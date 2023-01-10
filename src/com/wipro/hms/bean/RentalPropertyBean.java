package com.wipro.hms.bean;

public class RentalPropertyBean {
	private float rentalAmount;
	private int noOfBedRooms;
	private String location;
	private String city;
	private String propertyId;

	/**
	 * @return the rentalAmount
	 */
	public float getRentalAmount() {
		return rentalAmount;
	}

	/**
	 * @param rentalAmount
	 *            the rentalAmount to set
	 */
	public void setRentalAmount(float rentalAmount) {
		this.rentalAmount = rentalAmount;
	}

	/**
	 * @return the noOfBedRooms
	 */
	public int getNoOfBedRooms() {
		return noOfBedRooms;
	}

	/**
	 * @param noOfBedRooms
	 *            the noOfBedRooms to set
	 */
	public void setNoOfBedRooms(int noOfBedRooms) {
		this.noOfBedRooms = noOfBedRooms;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the propertyId
	 */
	public String getPropertyId() {
		return propertyId;
	}

	/**
	 * @param propertyId
	 *            the propertyId to set
	 */
	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}
}
