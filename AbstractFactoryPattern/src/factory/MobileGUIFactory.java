package factory;

import button.IButton;
import button.MobileButton;

public class MobileGUIFactory implements IGUIFactory {

	@Override
	public IButton createButton() {
		return new MobileButton();
	}

}
