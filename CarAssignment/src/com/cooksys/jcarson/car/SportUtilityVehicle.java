package com.cooksys.jcarson.car;

public class SportUtilityVehicle extends Car{

	/**
	 * @param year
	 * @param make
	 * @param model
	 */
	public SportUtilityVehicle() {
		super(2009, "Honda", "Canyonero");
	}

	/* (non-Javadoc)
	 * @see com.cooksys.jcarson.car.Car#canCarry(com.cooksys.jcarson.car.Load)
	 */
	@Override
	public Boolean canCarry(Load load) {
		// TODO Auto-generated method stub
		return load.getWeight() <= 200;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SportUtilityVehicle, " + super.toString();
	}
}
