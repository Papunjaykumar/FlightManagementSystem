package com.nri.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nri.dao.PassengerInfoDao;
import com.nri.dao.PaymentInfoDao;
import com.nri.dto.FlightBookingAcknowledgement;
import com.nri.dto.FlightBookingRequest;
import com.nri.entity.PassengerInfo;
import com.nri.entity.PaymentInfo;
import com.nri.util.PaymentUtils;

@Service
public class FlightBookingService {
	@Autowired
	private PassengerInfoDao passengerInfoDao;
	@Autowired
	private PaymentInfoDao paymentInfoDao;
	
	@Transactional//(readOnly = false,isolation=Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
	public FlightBookingAcknowledgement bookFlightTiclet(FlightBookingRequest request) {
		
		PassengerInfo passengerInfo=request.getPassengerInfo();
		passengerInfo=passengerInfoDao.save(passengerInfo);
		
		PaymentInfo paymentInfo=request.getPaymentInfo();
		PaymentUtils.validCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
		paymentInfo.setPassengerId(passengerInfo.getPid());
		paymentInfo.setAmount(passengerInfo.getFare());
		paymentInfo=paymentInfoDao.save(paymentInfo);
		return new FlightBookingAcknowledgement("SUCCESS",passengerInfo.getFare(),UUID.randomUUID().toString().split("-")[0],passengerInfo);
		
		
		
	}

}
