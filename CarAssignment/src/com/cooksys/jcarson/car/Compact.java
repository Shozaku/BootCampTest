package com.cooksys.jcarson.car;

public class Compact extends Car{

	/**
	 * @param year
	 * @param make
	 * @param model
	 */
	public Compact() {
		super(2007, "Hyundai", "Idunno");
	}

	/* (non-Javadoc)
	 * @see com.cooksys.jcarson.car.Car#canCarry(com.cooksys.jcarson.car.Load)
	 */
	@Override
	public Boolean canCarry(Load load) {
		return load.getWeight() <= 100;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compact, " + super.toString();
	}

}
