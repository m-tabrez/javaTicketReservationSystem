package com.BeginnersProject.Collections;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TrainService {
	static List<Train> trainsList = List.of(
			new Train("Train-One", 101, "Hyederabad", "Bangalore", LocalDate.now(), 100, 800),
			new Train("Train-Two", 102, "Bangalore", "Hyederabad", LocalDate.now(), 100, 800),
			new Train("Train-Three", 103, "Hyederabad", "Bangalore", LocalDate.now(), 80, 600),
			new Train("Train-Four", 104, "Bangalore", "Hyederabad", LocalDate.now(), 80, 600),
			new Train("Train-Five", 105, "Hyederabad", "Chennai", LocalDate.now(), 100, 900),
			new Train("Train-Six", 106, "Chennai", "Hyederabad", LocalDate.now(), 100, 900));

	static List<Train> allTrains = new LinkedList<>(trainsList);

	public TrainService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Train findTrain(int trainNo) {
		Train tempTrain = null;

		for (Train curTrain : allTrains) {
			if (curTrain.getTrainNo() == trainNo) {
				tempTrain = curTrain;
				break;
			}
		}

		return tempTrain;
	}

	public static void searchTrainBtwStations(String from, String to, LocalDate dateOfJour, int numOfSeats) {
		List<Train> searchResult = new LinkedList<>();
		for (Train curTrain : allTrains) {
			if (curTrain.getFromStation().equals(from) && curTrain.getToStation().equals(to)
					&& curTrain.getDateOfJourney().equals(dateOfJour) && curTrain.getSeatsAvailable() >= numOfSeats) {
				searchResult.add(curTrain);
			}
		}

		if (searchResult.size() == 0) {
			System.out.println("Sorry, There are no matching trains for the search criteria");
		} else {
			System.out.println(
					"TrainNo \t TrainName \t FromStation \t ToStation \t DatOfJourney \t SeatsAvailable \t Fare");
			System.out.println();
			for (Train curTrain : searchResult) {
				System.out.printf("%4d %20s %15s %20s %15s %15d %5d", curTrain.getTrainNo(), curTrain.getTrainName(),
						curTrain.getFromStation(), curTrain.getToStation(), curTrain.getDateOfJourney(),
						curTrain.getSeatsAvailable(), curTrain.getFare()).println();
			}
		}

	}

	public static void bookTickets(int TrainNo, List<Passenger> PassengersList) {

		// We need to dedect the balance from the bank account of Passenger

		int noOfPassengers = PassengersList.size();
		Train selectedTrain = findTrain(TrainNo);
		int totalFare = selectedTrain.getFare() * noOfPassengers;
		BankAccount passengersAccount = PassengersList.get(0).getBankAccount();
		passengersAccount.withDraw(totalFare);

		// We need to reduce no of seats availabe with no of seats booked
		int totalSeats = selectedTrain.getSeatsAvailable();
		selectedTrain.setSeatsAvailable(totalSeats - noOfPassengers);

		// We need to add one entry into tickets collection
		TicketService.addTicket(TrainNo, PassengersList);

	}

}
