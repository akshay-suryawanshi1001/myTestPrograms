package com.akshay.ObjMapperPractice;

public class CustomerObj {
	
	private String accountId;
	
	private String fistname;
	
	private String email;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getFistname() {
		return fistname;
	}

	public void setFistname(String fistname) {
		this.fistname = fistname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CustomerObj(String accountId, String fistname, String email) {
		super();
		this.accountId = accountId;
		this.fistname = fistname;
		this.email = email;
	}

	@Override
	public String toString() {
		return "CustomerObj [accountIdd=" + accountId + ", fistname=" + fistname + ", email=" + email + "]";
	}
	
}
