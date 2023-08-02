package com.nri.util;

import java.util.HashMap;
import java.util.Map;

import exceptions.InsufficientAmountException;

public class PaymentUtils {
	
	private static Map<String,Double> paymentMap=new HashMap<>();
	static {
		paymentMap.put("acc1", 12000.0);
		paymentMap.put("acc2", 15000.0);
		paymentMap.put("acc3", 10000.0);
		paymentMap.put("acc4", 11000.0);
		paymentMap.put("acc5", 18000.0);
	}
	
	public static boolean validCreditLimit(String accNo,double paidAmount) {
		if(paidAmount>paymentMap.get(accNo)) {
			throw new InsufficientAmountException("Insufficient fund ....!!");
		}
		return true;
	}
	

}
