package com.nri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nri.dto.FlightBookingAcknowledgement;
import com.nri.dto.FlightBookingRequest;
import com.nri.service.FlightBookingService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private FlightBookingService bookingService;
	@PostMapping("/bookFlightTicket")
	public FlightBookingAcknowledgement bookFlighTicket(@RequestBody FlightBookingRequest request)
	{
		return bookingService.bookFlightTiclet(request);
	}

}
