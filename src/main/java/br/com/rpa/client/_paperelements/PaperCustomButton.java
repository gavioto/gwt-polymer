package br.com.rpa.client._paperelements;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Text;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class PaperCustomButton<T extends Widget> extends PaperButton implements HasText {

  private final Text textNode;
  private final T widget;

  public PaperCustomButton(final T widget) {
    super(Document.get().createElement(PaperButtonElement.TAG), STYLE);
    textNode = Document.get().createTextNode("");
    getElement().appendChild(widget.getElement());
    getElement().appendChild(textNode);
    this.widget = widget;
  }

  @Override
  public String getText() {
    return textNode.getData();
  }

  public T getWidget() {
    return widget;
  }

  @Override
  public void setText(final String text) {
    textNode.setData(text);
  }

}
