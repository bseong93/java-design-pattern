package factory;

import car.Car;

public abstract class CarFactory {
	
	public void getCarInfo() {
		Car car = createCar();
		
		car.getName();
	}
	
	public abstract Car createCar();

}
