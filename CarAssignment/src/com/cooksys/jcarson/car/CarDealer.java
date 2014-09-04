package com.cooksys.jcarson.car;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class CarDealer {

	private List<Car> carModels;
	private static Random rng = new Random();
	
	public CarDealer(){
		this.carModels = new ArrayList<Car>();
		
		// Add cars to the list from smallest to largest, so the list will be sorted
		// by carrying capacity.
		carModels.add(new Compact());
		carModels.add(new SportUtilityVehicle());
		carModels.add(new PickupTruck());
	}
	
	public static void main(String[] args) {
		Load load;
		CarDealer dealer = new CarDealer();
		for (int i = 0; i < 10; i++)
		{
			load = new Load(rng.nextInt(400));
			System.out.println(load + " " + dealer.getSmallestCarThatCanCarry(load));
		}
	}
	
	public Car getSmallestCarThatCanCarry(Load load){
		for (Car car : carModels){
			if (car.canCarry(load)){
				return car;
			}
		}
		return null;
	}

}
