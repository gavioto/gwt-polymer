package br.com.rpa.client._paperelements;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.RootPanel;

public class PaperFab extends PaperIconButton {

  public static final String STYLE = "";

  public static PaperFab wrap(final Element element) {
    // Assert that the element is attached.
    assert Document.get().getBody().isOrHasChild(element);

    final PaperFab fab = new PaperFab(element, STYLE);

    // Mark it attached and remember it for cleanup.
    fab.onAttach();
    RootPanel.detachOnWindowClose(fab);

    return fab;
  }

  public static PaperFab wrap(final String id) {
    return wrap(DOM.getElementById(id));
  }

  public PaperFab() {
    this(Document.get().createElement(PaperFabElement.TAG), STYLE);
  }

  public PaperFab(final Element element, final String styleName) {
    super(element, styleName);
  }

  @Override
  protected PaperFabElement getPaperElement() {
    return getElement().cast();
  }

  public void setMini(final boolean mini) {
    getPaperElement().setMini(mini);
  }
}
