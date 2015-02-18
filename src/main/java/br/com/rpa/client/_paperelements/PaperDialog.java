package br.com.rpa.client._paperelements;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.ParagraphElement;
import com.google.gwt.user.client.ui.FocusWidget;

public class PaperDialog extends FocusWidget {

  public static final String STYLE = "";

  protected List<ParagraphElement> paragraphs;

  public PaperDialog() {
    this(Document.get().createElement(PaperDialogElement.TAG));
  }

  public PaperDialog(final Element elem) {
    this(elem, STYLE);
  }

  public PaperDialog(final Element element, String styleName) {
    super(element);
    if (styleName != null && !styleName.equalsIgnoreCase(STYLE)) {
      styleName = STYLE + " " + styleName;
    }
    if (!styleName.isEmpty()) {
      setStyleName(styleName);
    }
    paragraphs = new ArrayList<ParagraphElement>();
  }

  public void addActionButtons(final PaperButton dismissive, final int autoFocusIndex,
      final PaperButton... affirmatives) {
    if (dismissive != null) {
      dismissive.getElement().setAttribute("dismissive", "");
      getPaperElement().appendChild(dismissive.getElement());
    }

    int focus = -1;
    for (final PaperFocusable btn : affirmatives) {
      focus++;
      btn.getElement().setAttribute("affirmative", "");
      if (autoFocusIndex >= 0 && focus == autoFocusIndex) {
        btn.getElement().setAttribute("autofocus", "");
      }
      getPaperElement().appendChild(btn.getElement());
    }

  }

  public void addParagraphContent(final ParagraphElement... content) {
    for (final ParagraphElement p : content) {
      paragraphs.add(p);
    }

    if (!paragraphs.isEmpty()) {
      buildContent();
    }
  }

  public void addParagraphContent(final String... content) {
    for (final String txt : content) {
      final ParagraphElement p = Document.get().createPElement();
      p.setInnerHTML(txt);
      paragraphs.add(p);
    }

    if (!paragraphs.isEmpty()) {
      buildContent();
    }
  }

  private void buildButtons() {

  }

  private void buildContent() {
    for (final ParagraphElement p : paragraphs) {
      getPaperElement().appendChild(p);
    }
  }

  public void close() {
    getPaperElement().close();
  }

  public String getCloseSelector() {
    return getPaperElement().getCloseSelector();
  }

  public String getHeading() {
    return getPaperElement().getHeading();
  }

  protected PaperDialogElement getPaperElement() {
    return getElement().cast();
  }

  public String getTransition() {
    return getPaperElement().getTransition();
  }

  public boolean isAutoCloseDisabled() {
    return getPaperElement().isAutoCloseDisabled();
  }

  public boolean isBackdrop() {
    return getPaperElement().isBackdrop();
  }

  public boolean isLayered() {
    return getPaperElement().isLayered();
  }

  public boolean isOpened() {
    return getPaperElement().isOpened();
  }

  public void open() {
    getPaperElement().open();
  }

  public void resizeHandler() {
    getPaperElement().resizeHandler();
  }

  public void setAutoCloseDisabled(final boolean status) {
    getPaperElement().setAutoCloseDisabled(status);
  }

  public void setBackdrop(final boolean status) {
    getPaperElement().setBackdrop(status);
  }

  public void setCloseSelector(final String selector) {
    getPaperElement().setCloseSelector(selector);
  }

  public void setHeading(final String heading) {
    getPaperElement().setHeading(heading);
  }

  public void setHTML(final String html) {
    getPaperElement().setInnerHTML(html);
  }

  public void setLayered(final boolean status) {
    getPaperElement().setLayered(status);
  }

  public void setOpened(final boolean status) {
    getPaperElement().setOpened(status);
  }

  public void setTransition(final String transition) {
    getPaperElement().setTransition(transition);
  }

  public void toggle() {
    getPaperElement().toggle();
  }

}
