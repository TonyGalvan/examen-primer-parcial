package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private int roomNumber;
    private String arrivalDate;
    private int nights;
    private String prepareHotel;




    public Hotel() {
        reservations = new ArrayList<>();
    }

    public Hotel(String comfort_poo_inn) {

    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    private static Hotel prepareHotel() {
        Hotel hotel = new Hotel("Comfort POO Inn");

        hotel.addRoom(new Room(100, "1-BED-KING", RoomStatus.CLEAN)); // Room receives room number and room description
        hotel.addRoom(new Room(101, "2-BED-QUEEN", RoomStatus.CLEAN));
        hotel.addRoom(new Room(102, "1-BED-KING", RoomStatus.CLEAN));
        hotel.addRoom(new Room(103, "1-BED-KING", RoomStatus.DIRTY));
        hotel.addRoom(new Room(200, "2-BED-QUEEN", RoomStatus.DIRTY));
        hotel.addRoom(new Room(201, "2-BED-QUEEN", RoomStatus.CLEAN));
        hotel.addRoom(new Room(202, "2-BED-QUEEN", RoomStatus.DIRTY));
        hotel.addRoom(new Room(203, "2-BED-QUEEN", RoomStatus.CLEAN));
        hotel.addRoom(new Room(204, "2-BED-QUEEN", RoomStatus.CLEAN));
        hotel.addRoom(new Room(205, "2-BED-QUEEN", RoomStatus.DIRTY));

        return hotel;
    }

    public static void printInformation(Hotel hotel) {

        System.out.println("---------------------------------------------------------------------");
        System.out.println(hotel.getName() + " - Hotel information");

        ArrayList<Room> rooms = hotel.getRooms();

        System.out.println("Total rooms: " + rooms.size());
        System.out.println();
        System.out.println("Room statuses");
        for (Room room : rooms) {
            System.out.println(room.getNumber() + " - " + room.getStatus());
        }
        System.out.println("---------------------------------------------------------------------");
    }
}
