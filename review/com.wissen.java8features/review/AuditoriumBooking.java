package review;

import java.util.ArrayList;
import java.util.List;

public class AuditoriumBooking {

	private static List<Booking> bookings = new ArrayList<>();

	public static boolean isTimeSlotAvailable(String timeSlot) {
		for (Booking booking : bookings) {
			if (booking.timeSlot.equals(timeSlot)) {
				return false;
			}
		}
		return true;
	}

	public static void bookSlot(String name, String timeSlot, int amountPaid) {
		if (isTimeSlotAvailable(timeSlot)) {
			bookings.add(new Booking(name, timeSlot, amountPaid));
		} else {
			System.out.println("Time slot " + timeSlot + " is not available.");
		}
	}

	public static void checkAndBook(String name, String timeSlot, int amountPaid, int priorityAmount) {
		for (Booking booking : bookings) {
			if (booking.timeSlot.equals(timeSlot)) {
				if (amountPaid == priorityAmount) {
					bookings.remove(booking);
					bookings.add(new Booking(name, timeSlot, amountPaid));
					System.out.println("Higher priority booking made by " + name + ". Previous booking removed.");
				} else {
					System.out.println("Time slot conflict and higher priority booking not made.");
				}
				return;
			}
		}
		bookings.add(new Booking(name, timeSlot, amountPaid));
	}

	public static void main(String[] args) {
		bookSlot("Person 1", "1-2pm", 1000);
		bookSlot("Person 2", "3-4pm", 1200);

		// Trying to book conflicting slot with lower amount, should fail
		checkAndBook("Person 3", "1:30-2:30pm", 1000, 1500);

		// Trying to book conflicting slot with higher amount, should succeed
		checkAndBook("Person 4", "1:30-2:30pm", 1500, 1500);

		// Print all bookings
		for (Booking booking : bookings) {
			System.out.println(booking);
		}
	}
}