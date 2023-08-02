package com.nri.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@Data
@AllArgsConstructor
@NoArgsConstructor*/
@Entity
@Table(name="passenger_Info")
public class PassengerInfo {
	
	@Id
	@GeneratedValue
	private Long pid;
	private String pname;
	private String pemail;
	private String psource;
	private String destinamtion;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
	private Date travelDate;
	private String pickupTime;
	private String arrivalTime;
	private double fare;
	public PassengerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PassengerInfo(Long pid, String pname, String pemail, String psource, String destinamtion, Date travelDate,
			String pickupTime, String arrivalTime, double fare) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pemail = pemail;
		this.psource = psource;
		this.destinamtion = destinamtion;
		this.travelDate = travelDate;
		this.pickupTime = pickupTime;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
	}
	
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	public String getPsource() {
		return psource;
	}
	public void setPsource(String psource) {
		this.psource = psource;
	}
	public String getDestinamtion() {
		return destinamtion;
	}
	public void setDestinamtion(String destinamtion) {
		this.destinamtion = destinamtion;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public String getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "PassengerInfo [pid=" + pid + ", pname=" + pname + ", pemail=" + pemail + ", psource=" + psource
				+ ", destinamtion=" + destinamtion + ", travelDate=" + travelDate + ", pickupTime=" + pickupTime
				+ ", arrivalTime=" + arrivalTime + ", fare=" + fare + "]";
	}
	
	
	
	
	

}
