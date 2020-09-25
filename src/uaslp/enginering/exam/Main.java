package uaslp.enginering.exam;

import uaslp.enginering.exam.model.Guest;
import uaslp.enginering.exam.model.Hotel;
import uaslp.enginering.exam.model.Reservation;
import uaslp.enginering.exam.model.Room;
import uaslp.enginering.exam.model.RoomStatus;

import java.util.ArrayList;

import static uaslp.enginering.exam.model.Hotel.printInformation;
import static uaslp.enginering.exam.model.Reservation.printReservations;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = hotel.prepareHotel();
        Guest gregorio = new Guest();
        Guest lucia = new Guest();

        gregorio.setName("Gregorio H. Latham");
        gregorio.setAddress("Colonia Ofir 8720 65001 San Javier");
        gregorio.setCountry("Uruguay");
        gregorio.setPhoneNumber("5132343313");

        lucia.setName("Lucia J. Schultz");
        lucia.setAddress("Via del Pontiere, 27 10020-Valle Sauglio TO");
        lucia.setCountry("Italy");
        lucia.setPhoneNumber("0317 2637392");

        hotel.reserveRoom(100, lucia, "2020-10-03", 3);
        hotel.reserveRoom(101, lucia, "2020-12-23", 10);
        hotel.reserveRoom(201, gregorio, "2020-11-25", 6);
        hotel.reserveRoom(203, lucia, "2021-02-10", 5);
        hotel.reserveRoom(103, gregorio, "2020-01-31", 15);

        printInformation(hotel);

        printReservations(hotel);

    }






}
