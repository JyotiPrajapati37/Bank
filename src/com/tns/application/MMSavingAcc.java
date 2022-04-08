package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	private static final float MINBAL = SavingAcc.getMinbal();

	public static float getMinbal() {
		return MINBAL;
	}

	
//Constructor
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void withdraw(float amt) {
		// TODO Auto-generated method stub
		super.withdraw(amt);
		System.out.println("AVAILABLE BALANCE: " + getAccBal());
	}
	
	
}
