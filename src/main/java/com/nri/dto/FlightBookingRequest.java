package com.nri.dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.nri.entity.PassengerInfo;
import com.nri.entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class FlightBookingRequest {
	@Autowired
	private PaymentInfo paymentInfo;
	@Autowired
	private PassengerInfo passengerInfo;
	public FlightBookingRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightBookingRequest(PaymentInfo paymentInfo, PassengerInfo passengerInfo) {
		super();
		this.paymentInfo = paymentInfo;
		this.passengerInfo = passengerInfo;
	}
	
	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}
	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}
	@Override
	public String toString() {
		return "FlightBookingRequest [paymentInfo=" + paymentInfo + ", passengerInfo=" + passengerInfo + "]";
	}
	
	

}
