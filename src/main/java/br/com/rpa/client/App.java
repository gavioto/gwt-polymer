package br.com.rpa.client;

import br.com.rpa.client._paperelements.PaperCheckBox;
import br.com.rpa.client._paperelements.PaperDialog;
import br.com.rpa.client._paperelements.PaperFab;
import br.com.rpa.client._paperelements.PaperIconButton;
import br.com.rpa.client._paperelements.PaperInput;
import br.com.rpa.client.api.widgets.paper.PaperButton;
import br.com.rpa.client.ui.PolymerTest;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class App implements EntryPoint {
  /**
   * This is the entry point method.
   */
  @Override
  public void onModuleLoad() {
    // Creating a paper button.
    PaperButton button = new PaperButton();
    button.setIcon("menu");
    button.setLabel("Botão");
    button.setRaised(true);

    PaperDialog dialog = new PaperDialog();
    dialog.setOpened(true);
    dialog.setHeading("Some heading");
    dialog.addParagraphContent("Some content");
    dialog.setLayered(true);
    
    PaperIconButton paperBtn = new PaperIconButton();
    paperBtn.setLabel("Icon btn");
    paperBtn.setRaisedButton(true);
    paperBtn.setIcon("menu");
      
    PaperCheckBox checkbox = new PaperCheckBox();   
    checkbox.setLabel("check box");
    
    PaperFab fab = new PaperFab();    
    fab.setIcon("menu");
    
    PaperFab fabmini = new PaperFab();
    fabmini.setIcon("mail");
    fabmini.setMini(true);
        
    PaperInput input = new PaperInput();
    input.setRequired(true);
    input.setLabel("Type something");
        
    // Getting the value of a paper button property.
    System.out.println(button.isRaised());

    // Adding a event handler to the paper button.
    fab.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
      Window.alert("Teste!!");
      }
    });

    RootPanel.get().add(button);    
    RootPanel.get().add(checkbox);
    RootPanel.get().add(dialog);
    RootPanel.get().add(paperBtn);
    RootPanel.get().add(input);
    RootPanel.get().add(fab);
    RootPanel.get().add(fabmini);

    // Creating uiBinder for polymer elements
    PolymerTest uiPolymer = new PolymerTest("Teste");
    RootPanel.get().add(uiPolymer);
    
    PaperFab fabWrapped = PaperFab.wrap(DOM.getElementById("rootfab"));
    fabWrapped.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        Window.alert("Wrapped PaperFab");        
      }
    });
    fabWrapped.setMini(true);
  }
}
