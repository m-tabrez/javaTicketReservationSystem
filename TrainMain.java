package com.BeginnersProject.Collections;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TrainMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Now Searching for Trains");
		TrainService.searchTrainBtwStations("Hyederabad", "Bangalore", LocalDate.now(), 10);

		BankAccount accountTabrez = new BankAccount(101, 5000);

		List passengerList1 = List.of(new Passenger("Mohammed Tabrez", 101, 29, accountTabrez),
				new Passenger("Musadiqua Aiman", 102, 23, accountTabrez));

		List<Passenger> TabrezPassengers = new LinkedList<>(passengerList1);

		System.out.println("Now Booking Ticket for above passengers");

		TrainService.bookTickets(101, TabrezPassengers);

		System.out.println("Now Printing ticket dtails");

		TicketService.showTicket(1);

		System.out.println("Now Searching for Trains again with avialableity of seats");
		TrainService.searchTrainBtwStations("Hyederabad", "Bangalore", LocalDate.now(), 10);
	}

}
