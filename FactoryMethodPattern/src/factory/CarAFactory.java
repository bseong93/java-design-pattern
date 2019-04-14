package factory;

import car.Car;
import car.CarA;

public class CarAFactory extends CarFactory {

	@Override
	public Car createCar() {
		return new CarA();
	}

}
