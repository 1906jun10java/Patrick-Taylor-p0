package com.project0.beans;

public class Offers
{

	private int offerId;
	private String customerUserName;
	private int carsId;
	private double offerAmount;

	public Offers(int offerId, int carId, double offerAmount, String customerUserName)
	{
		super();
		this.offerId = offerId;
		this.customerUserName = customerUserName;
		this.carsId = carId;
		this.offerAmount = offerAmount;

	}

	public int getOfferId()
	{
		return offerId;
	}

	public void setOfferId(int offerId)
	{
		this.offerId = offerId;
	}

	public String getCustomerUserName()
	{
		return customerUserName;
	}

	public void setCustomerUserName(String customerUserName)
	{
		this.customerUserName = customerUserName;
	}

	public int getCarId()
	{
		return carsId;
	}

	public void setCarId(int carId)
	{
		this.carsId = carId;
	}

	public double getOfferAmount()
	{
		return offerAmount;
	}

	public void setOfferAmount(double offerAmount)
	{
		this.offerAmount = offerAmount;
	}

	@Override
	public String toString()
	{
		return "Offers [offerId=" + offerId + ", customerUserName=" + customerUserName + ", carId=" + carsId
				+ ", offerAmount=" + offerAmount + ", getOfferId()=" + getOfferId() + ", getCustomerUserName()="
				+ getCustomerUserName() + ", getCarId()=" + getCarId() + ", getOfferAmount()=" + getOfferAmount()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
