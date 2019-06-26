package project0.ourwork;

public class Customer extends User {

	//no-args Constructor
	public Customer() {
		super();
	}
	
	//Constructor for the customer Class 
	public Customer(String username, String password, Double offers, Double payments) {
		super();
		this.username = username;
		this.password = password;
		this.offers = offers;
		this.payments = payments;
	}
	//private fields for the customer Class	
	protected String username;
	protected String password;
	private Double offers;
	private Double payments;

	//generated getters and setters for the Customer Class 
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getOffers() {
		return offers;
	}
	public void setOffers(Double offers) {
		this.offers = offers;
	}
	public Double getPayments() {
		return payments;
	}
	public void setPayments(Double payments) {
		this.payments = payments;
	}

	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password + ", offers=" + offers + ", payments="
				+ payments + "]";
	}
	
	
}

