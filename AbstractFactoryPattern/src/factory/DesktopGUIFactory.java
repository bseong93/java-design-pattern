package factory;

import button.DesktopButton;
import button.IButton;

public class DesktopGUIFactory implements IGUIFactory {

	@Override
	public IButton createButton() {
		return new DesktopButton();
	}

}
