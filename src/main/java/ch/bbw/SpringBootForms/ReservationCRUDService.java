package ch.bbw.SpringBootForms;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ReservationCRUDService {
    public List<Reservation> reservations = new ArrayList<>(Arrays.asList(
            new Reservation(1, "Familie Muster, 4 Personen"),
            new Reservation(2, "Familie Kuster, 2 Personen"),
            new Reservation(3, "Familie Liechti, 5 Personen")
    ));

    public List<Reservation> getAllReservations() {
        return reservations;
    }

    public Reservation getReservation(int id) {
        return reservations.get(id);
    }

    public void addReservation(int id, Reservation reservation) {
        reservations.add(reservation);
    }

    public void updateReservation(int id, Reservation reservation) {
        removeReservation(id);
        reservations.add(reservation);
    }

    public void removeReservation(int id) {
        reservations.remove(id);
    }
}
