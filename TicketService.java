package com.BeginnersProject.Collections;

import java.util.LinkedList;
import java.util.List;

class Ticket {
	private int pnr;
	private Train train;
	private List<Passenger> passengersList;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int pnr, Train train, List<Passenger> passengersList) {
		super();
		this.pnr = pnr;
		this.train = train;
		this.passengersList = passengersList;
	}

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(int trainNo) {
		this.train = train;
	}

	public List<Passenger> getPassengersList() {
		return passengersList;
	}

	public void setPassengersList(List<Passenger> passengersList) {
		this.passengersList = passengersList;
	}

}

public class TicketService {

	static List<Ticket> allTickets = new LinkedList<>();

	public static void addTicket(int trainNo, List<Passenger> passengersList) {
		Train tempTrain = TrainService.findTrain(trainNo);
		int pnr = allTickets.size() + 1;
		allTickets.add(new Ticket(pnr, tempTrain, passengersList));
		System.out.println("Tickets Booked Successfully...");
	}

	public static void showTicket(int pnr) {
		Ticket userTicket = null;
		for(Ticket curTicket:allTickets) {
			if(curTicket.getPnr() == pnr) {
				userTicket = curTicket;
				break;
			}
		}

		Train ticketTrain = userTicket.getTrain();
		List<Passenger> passengers = userTicket.getPassengersList();

		if (userTicket == null) {
			System.out.println("Sorry, Kindly enter a valid PNR no");
		} else {
			System.out.println("****** Your Booking Details *********");
			System.out.println("PNR => " + userTicket.getPnr() + "Train No => " + ticketTrain.getTrainNo());
			System.out.println("*******************************");
			System.out.println("Train Name => " + ticketTrain.getTrainName());
			System.out.println("From Station => " + ticketTrain.getFromStation() + " To Station => " + ticketTrain.getToStation());
			System.out.println("DOJ => " + ticketTrain.getDateOfJourney());
			System.out.println("Passengers info below");

			for (Passenger curPassenger : passengers) {
				System.out.println(curPassenger.getPassengerName() + " " + curPassenger.getAge());
			}
		}


	}

}


