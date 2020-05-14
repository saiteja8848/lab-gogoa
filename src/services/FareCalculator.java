package services;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

// Type your code

public class FareCalculator extends Booking {
	public double book(Hotel hotel) {
		if (hotel.getTodate().isAfter(hotel.getFromdate()))
			return booking(hotel.getNoOfPersons(), hotel.getRates());
		else
			return 0;
	}

	public double book(Flight flight) {
     	
		if(flight.getTo().isAfter(flight.getFrom()))
			return booking(flight.getNoOfPersons(), flight.getRates());
		else
			return 0;
	}

	public double book(Train train) {
		return booking(train.getNoOfPersons(), train.getRates());
	}

	public double book(Bus bus) {
		return booking(bus.getNoOfPersons(), bus.getRates());
	}
}