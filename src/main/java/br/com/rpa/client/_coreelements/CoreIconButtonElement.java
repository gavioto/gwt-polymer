package br.com.rpa.client._coreelements;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(CoreIconButtonElement.TAG)
public class CoreIconButtonElement extends Element {
  public static final String TAG = "core-icon-button";

  /**
   * Assert that the given {@link Element} is compatible with this class and
   * automatically typecast it.
   */
  public static CoreIconButtonElement as(final Element elem) {
    assert elem.getTagName().equalsIgnoreCase(TAG);
    return (CoreIconButtonElement) elem;
  }

  protected CoreIconButtonElement() {
  }

  public final native String getIcon() /*-{
		return this.icon
  }-*/;

  public final native String getIconSrc() /*-{
		return this.src
  }-*/;

  public final native boolean isActive() /*-{
		return this.active;
  }-*/;

  public final native void setActive(boolean active) /*-{
		this.active = active;
  }-*/;

  public final native void setIcon(String icon) /*-{
		this.icon = icon;
  }-*/;

  public final native void setIconSrc(String src) /*-{
		this.src = src;
  }-*/;

}
