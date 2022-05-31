package com.mavendemo.springcore;

public class Address {
	public int addressFlatNumber;
	public String addressStreat;
	public String addressCity;

	public int getAddressFlatNumber() {
		return addressFlatNumber;
	}

	public void setAddressFlatNumber(int addressFlatNumber) {
		this.addressFlatNumber = addressFlatNumber;
	}

	public String getAddressStreat() {
		return addressStreat;
	}

	public void setAddressStreat(String addressStreat) {
		this.addressStreat = addressStreat;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public Address(int addressFlatNumber, String addressStreat, String addressCity) {
		super();
		this.addressFlatNumber = addressFlatNumber;
		this.addressStreat = addressStreat;
		this.addressCity = addressCity;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [addressFlatNumber=" + addressFlatNumber + ", addressStreat=" + addressStreat + ", addressCity="
				+ addressCity + "]";
	}

}
