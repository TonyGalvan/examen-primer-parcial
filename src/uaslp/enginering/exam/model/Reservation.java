package uaslp.enginering.exam.model;

public class Reservation {

    public void setRoomNumber(int roomNumber) {
    }

    public void setArrivalDate(String arrivalDate) {
    }

    public void setGuest(Guest guest) {
    }

    public void setNights(int nights) {
    }

    public static void printReservations(Hotel hotel) {
        System.out.println("---------------------------------------------------------------------");
        System.out.println(hotel.getName() + " - reservations");
        for (Reservation reservation : hotel.getReservations()) {
            System.out.println(reservation.getRoomNumber() + " - " +
                    reservation.getGuest().getName() + " - " +
                    reservation.getArrivalDate() + " - " +
                    reservation.getNights() + " nights");
        }
        System.out.println("---------------------------------------------------------------------");
    }
}
