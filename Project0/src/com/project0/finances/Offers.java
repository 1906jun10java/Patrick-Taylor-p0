package com.project0.finances;

public class Offers {

	private int offerId;
	private String customerUserName;
	private int carId;
	private double offerAmount;

	public Offers(int carId, double offerAmount, String customerUserName) {
		super();
		this.customerUserName = customerUserName;
		this.carId = carId;
		this.offerAmount = offerAmount;

	}

	
	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public String getCustomerUserName() {
		return customerUserName;
	}

	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public double getOfferAmount() {
		return offerAmount;
	}

	public void setOfferAmount(double offerAmount) {
		this.offerAmount = offerAmount;
	}

@Override
	public String toString() {
		return "Offers [offerId=" + offerId + ", customerUserName=" + customerUserName + ", carId=" + carId
				+ ", offerAmount=" + offerAmount + ", getOfferId()=" + getOfferId() + ", getCustomerUserName()="
				+ getCustomerUserName() + ", getCarId()=" + getCarId() + ", getOfferAmount()=" + getOfferAmount()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
