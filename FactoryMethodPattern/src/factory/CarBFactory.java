package factory;

import car.Car;
import car.CarB;

public class CarBFactory extends CarFactory {

	@Override
	public Car createCar() {
		return new CarB();
	}

}
