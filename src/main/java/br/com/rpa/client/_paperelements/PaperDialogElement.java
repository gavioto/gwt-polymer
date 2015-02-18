package br.com.rpa.client._paperelements;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(PaperDialogElement.TAG)
public class PaperDialogElement extends Element {

  public static final String TAG = "paper-dialog";

  /**
   * Assert that the given {@link Element} is compatible with this class and
   * automatically typecast it.
   */
  public static PaperDialogElement as(final Element elem) {
    assert elem.getTagName().equalsIgnoreCase(TAG);
    return (PaperDialogElement) elem;
  }

  protected PaperDialogElement() {
  }

  public final native void close() /*-{
		this.close();
  }-*/;

  public final native String getCloseSelector() /*-{
		return this.closeSelector;
  }-*/;

  public final native String getHeading() /*-{
		return this.heading;
  }-*/;

  public final native String getTransition() /*-{
		return this.transition;
  }-*/;

  public final native boolean isAutoCloseDisabled() /*-{
		return this.autoCloseDisabled;
  }-*/;

  public final native boolean isBackdrop() /*-{
		return this.backdrop;
  }-*/;

  public final native boolean isLayered() /*-{
		return this.layered;
  }-*/;

  public final native boolean isOpened() /*-{
		return this.opened;
  }-*/;

  public final native void open() /*-{
		this.open();
  }-*/;

  public final native void resizeHandler() /*-{
		this.resizeHandler();
  }-*/;

  public final native void setAutoCloseDisabled(boolean status) /*-{
		this.autoCloseDisabled = status;
  }-*/;

  public final native void setBackdrop(boolean status) /*-{
		this.backdrop = status;
  }-*/;

  public final native void setCloseSelector(String selector) /*-{
		this.closeSelector = selector;
  }-*/;

  public final native void setHeading(String heading) /*-{
		this.heading = heading;
  }-*/;

  public final native void setLayered(boolean status) /*-{
		this.layered = status;
  }-*/;

  public final native void setOpened(boolean status) /*-{
		this.opened = status;
  }-*/;

  public final native void setTransition(String transition) /*-{
		this.transition = transition;
  }-*/;

  public final native void toggle() /*-{
		this.toggle();
  }-*/;

}
