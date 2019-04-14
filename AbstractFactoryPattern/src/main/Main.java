package main;

import factory.DesktopGUIFactory;
import factory.IGUIFactory;
import factory.MobileGUIFactory;

public class Main {

	public static void main(String[] args) {

		IGUIFactory fac = null;

		fac = new MobileGUIFactory();
		fac.createButton().paint();

		fac = new DesktopGUIFactory();
		fac.createButton().paint();

	}

}