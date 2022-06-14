package com.BeginnersProject.Collections;

import java.time.LocalDate;

public class Train {
	private String trainName;
	private int trainNo;
	private String fromStation;
	private String toStation;
	private LocalDate dateOfJourney;
	private int seatsAvailable;
	private int fare;

	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Train(String trainName, int trainNo, String fromStation, String toStation, LocalDate dateOfJourney,
			int seatsAvailable, int fare) {
		super();
		this.trainName = trainName;
		this.trainNo = trainNo;
		this.fromStation = fromStation;
		this.toStation = toStation;
		this.dateOfJourney = dateOfJourney;
		this.seatsAvailable = seatsAvailable;
		this.fare = fare;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	public LocalDate getDateOfJourney() {
		return dateOfJourney;
	}

	public void setDateOfJourney(LocalDate dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

}
