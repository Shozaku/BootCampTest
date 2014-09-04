package com.cooksys.jcarson.car;

public class PickupTruck extends Car{

	/**
	 * @param year
	 * @param make
	 * @param model
	 */
	public PickupTruck() {
		super(2011, "Toyota", "Beefut");
	}

	/* (non-Javadoc)
	 * @see com.cooksys.jcarson.car.Car#canCarry(com.cooksys.jcarson.car.Load)
	 */
	@Override
	public Boolean canCarry(Load load) {
		// TODO Auto-generated method stub
		return load.getWeight() <= 400;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PickupTruck, " + super.toString();
	}
}
