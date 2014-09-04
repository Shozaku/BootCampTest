package com.cooksys.jcarson.car;

public abstract class Car {

	private Integer year;
	private String make;
	private String model;
	
	public Car (Integer year, String make, String model){
		this.year = year;
		this.make = make;
		this.model = model;
	}
	
	public abstract Boolean canCarry(Load load);

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return year + ", " + make + ", " + model;
	}
	
}
