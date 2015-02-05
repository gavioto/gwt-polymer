package br.com.rpa.client._paperelements;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.RootPanel;

public class PaperFab extends PaperIconButton {

	public static final String STYLE = "";

	public PaperFab() {
		this(Document.get().createElement(PaperFabElement.TAG), STYLE);
	}

	public PaperFab(Element element, String styleName){
		super(element, styleName);
	}

  public static PaperFab wrap(Element element) {
    // Assert that the element is attached.
    assert Document.get().getBody().isOrHasChild(element);

    PaperFab fab = new PaperFab(element, STYLE);

    // Mark it attached and remember it for cleanup.
    fab.onAttach();
    RootPanel.detachOnWindowClose(fab);

    return fab;
  }

	@Override
	protected PaperFabElement getPaperElement() {
		return getElement().cast();
	}

  public void setMini(boolean mini) {
    getPaperElement().setMini(mini);
  }
}
