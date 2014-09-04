package com.cooksys.jcarson.car;

public class Load {
	
	private Integer weight;
	
	public Load(Integer weight){
		this.weight = weight;
	}

	/**
	 * @return the weight
	 */
	public Integer getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Weight=" + weight;
	}

}
