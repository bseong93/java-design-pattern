package main;

import factory.CarAFactory;
import factory.CarBFactory;
import factory.CarFactory;

public class Main {

	public static void main(String[] args) {
		CarFactory carFactory = null;
		
		carFactory = new CarAFactory();
		carFactory.getCarInfo();
		
		carFactory = new CarBFactory();
		carFactory.getCarInfo();
	}

}
