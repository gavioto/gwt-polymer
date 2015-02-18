package br.com.rpa.client._coreelements;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.ButtonBase;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;

public class CoreIconButton extends ButtonBase implements HasIcon, HasText {

  public static CoreIconButton wrap(final Element element) {
    // Assert that the element is attached.
    assert Document.get().getBody().isOrHasChild(element);

    final CoreIconButton widget = new CoreIconButton(element);

    // Mark it attached and remember it for cleanup.
    widget.onAttach();
    RootPanel.detachOnWindowClose(widget);

    return widget;
  }

  public static CoreIconButton wrap(final String id) {
    return wrap(DOM.getElementById(id));
  }

  public CoreIconButton() {
    this(Document.get().createElement(CoreIconButtonElement.TAG));
  }

  protected CoreIconButton(final Element elem) {
    super(elem);
  }

  private CoreIconButtonElement getCoreElement() {
    return getElement().cast();
  }

  @Override
  public String getIcon() {
    return getCoreElement().getIcon();
  }

  @Override
  public String getIconSrc() {
    return getCoreElement().getIconSrc();
  }

  public boolean isActive() {
    return getCoreElement().isActive();
  }

  public void setActive(final boolean active) {
    getCoreElement().setActive(active);
  }

  @Override
  public void setIcon(final String icon) {
    getCoreElement().setIcon(icon);
  }

  @Override
  public void setIconSrc(final String src) {
    getCoreElement().setIconSrc(src);
  }

}
