package Class;

import java.util.List;

public class Customer {
	private long custId;
	private String custName;
	private int tier;
	
	
	public Customer() {
		
	}

	public Customer(long custId, String custName, int tier) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.tier = tier;
	}
	
	
	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", tier=" + tier + "]";
	}
	
}
