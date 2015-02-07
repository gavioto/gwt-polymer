package br.com.rpa.client._coreelements;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.FocusWidget;

public class CoreRange extends FocusWidget {

  public CoreRange() {
    this(Document.get().createElement(CoreRangeElement.TAG));
  }

  public CoreRange(final Element element) {
    super(element);
  }

  public final int getMax() {
    return getPaperElement().getMax();
  }

  public final int getMin() {
    return getPaperElement().getMin();
  }

  private CoreRangeElement getPaperElement() {
    return getElement().cast();
  }

  public final int getRatio() {
    return getPaperElement().getRatio();
  }

  public final int getStep() {
    return getPaperElement().getStep();
  }

  public final int getValue() {
    return getPaperElement().getValue();
  }

  public final void setMax(final int max) {
    getPaperElement().setMax(max);
  }

  public final void setMin(final int min) {
    getPaperElement().setMin(min);
  }

  public final void setRatio(final int ratio) {
    getPaperElement().setRatio(ratio);
  }

  public final void setStep(final int step) {
    getPaperElement().setStep(step);
  }

  public final void setValue(final int value) {
    getPaperElement().setValue(value);
  }

}
