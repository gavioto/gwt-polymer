package br.com.rpa.client;

import br.com.rpa.client._coreelements.CoreIcon;
import br.com.rpa.client._coreelements.CoreIconButton;
import br.com.rpa.client._paperelements.PaperButton;
import br.com.rpa.client._paperelements.PaperCheckBox;
import br.com.rpa.client._paperelements.PaperCustomButton;
import br.com.rpa.client._paperelements.PaperDialog;
import br.com.rpa.client._paperelements.PaperFab;
import br.com.rpa.client._paperelements.PaperIconButton;
import br.com.rpa.client._paperelements.PaperInput;
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
    final PaperButton button = new PaperButton();
    button.setIcon("menu");
    button.setText("Botão");
    button.setRaisedButton(true);

    final PaperDialog dialog = new PaperDialog();
    dialog.setOpened(true);
    dialog.setHeading("Some heading");
    dialog.addParagraphContent("Some content");
    dialog.setLayered(true);

    final PaperIconButton paperBtn = new PaperIconButton();
    paperBtn.setText("Icon btn");
    paperBtn.setRaisedButton(true);
    paperBtn.setIcon("menu");

    final PaperCheckBox checkbox = new PaperCheckBox();
    checkbox.setLabel("check box");

    final PaperFab fab = new PaperFab();
    fab.setIcon("menu");

    final PaperFab fabmini = new PaperFab();
    fabmini.setIcon("mail");
    fabmini.setMini(true);

    final PaperInput input = new PaperInput();
    input.setRequired(true);
    input.setLabel("Type something");

    // Getting the value of a paper button property.
    System.out.println(button.isRaisedButton());

    // Adding a event handler to the paper button.
    fab.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(final ClickEvent event) {
        Window.alert("Teste!!");
      }
    });

    final CoreIconButton coreIconBtn = new CoreIconButton();
    coreIconBtn.setIcon("folder");

    final CoreIcon coreIcon = new CoreIcon();
    coreIcon.setIcon("polymer");

    final CoreIcon coreIconForCustom = new CoreIcon();
    coreIconForCustom.setIcon("explore");

    final PaperCustomButton<CoreIcon> customPaperBtn = new PaperCustomButton<CoreIcon>(coreIconForCustom);
    customPaperBtn.setText("Custom");
    customPaperBtn.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(final ClickEvent event) {
        Window.alert("It works!");
      }
    });

    RootPanel.get().add(button);
    RootPanel.get().add(checkbox);
    RootPanel.get().add(dialog);
    RootPanel.get().add(paperBtn);
    RootPanel.get().add(input);
    RootPanel.get().add(fab);
    RootPanel.get().add(fabmini);
    RootPanel.get().add(coreIconBtn);
    RootPanel.get().add(coreIcon);
    RootPanel.get().add(customPaperBtn);

    // Creating uiBinder for polymer elements
    final PolymerTest uiPolymer = new PolymerTest("Teste");
    RootPanel.get().add(uiPolymer);

    final PaperFab fabWrapped = PaperFab.wrap(DOM.getElementById("rootfab"));
    fabWrapped.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(final ClickEvent event) {
        Window.alert("Wrapped PaperFab");
      }
    });
    fabWrapped.setMini(true);
  }
}
