package com.project0.finances;

public class Payments
{
	private int accountId;
	private int carId;
	private String cusUsername;
	private double monthlyPayments;
	private double payOffbalance;

	public Payments(int carId, String cusUsername, double monthlyPayments, double payOffbalance)
	{
		super();
		// this.accountId = accountId;
		this.carId = carId;
		this.cusUsername = cusUsername;
		this.monthlyPayments = monthlyPayments;
		this.payOffbalance = payOffbalance;

	}

	/// getters and setters
	public int getAccountId()
	{
		return accountId;

	}

	public void setAccountId(int accountId)
	{
		this.accountId = accountId;
	}

	public int getCarId()
	{
		return carId;
	}

	public void setCarId(int carId)
	{
		this.carId = carId;
	}

	public String getCusUsername()
	{
		return cusUsername;
	}

	public void setCusUsername(String cusUsername)
	{
		this.cusUsername = cusUsername;
	}

	public double getMonthlyPayments()
	{
		return monthlyPayments;
	}

	public void setMonthlyPayments(double monthlyPayments)
	{
		this.monthlyPayments = monthlyPayments;
	}

	public double getPayOffbalance()
	{
		return payOffbalance;
	}

	public void setPayOffbalance(double payOffbalance)
	{
		this.payOffbalance = payOffbalance;
	}

	@Override
	public String toString()
	{
		return "Payments [accountId=" + accountId + ", carId=" + carId + ", cusUsername=" + cusUsername
				+ ", monthlyPayments=" + monthlyPayments + ", payOffbalance=" + payOffbalance + "]";
	}

}
