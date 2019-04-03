package ch.bbw.SpringBootForms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ReservationCRUDController {

    @Autowired
    ReservationCRUDService reservationCRUDService;


    @GetMapping("/list-reservations")
    private String listReservation(Model model) {
        model.addAttribute("listOfReservations", reservationCRUDService.getAllReservations());
        return "/result";
    }

    @GetMapping("/add-reservation")
    private String addReservation(Model model) {
        return "/addreservation";
    }

    @PostMapping("/add-reservation")
    private String addReservation(Reservation reservation, Model model) {
        return "/addreservation";
    }

    @GetMapping("/edit-reservation/{id}")
    private String editReservation(@PathVariable("id") int id, Model model) {
        Reservation value = reservationCRUDService.getReservation(id);
        return "/editreservation";
    }

    @PostMapping("/edit-reservation")
    private String editReservation(Reservation reservation, Model model) {
        return "/editreservation";
    }

    @GetMapping("/delete-reservation")
    private String deleteReservation(@RequestParam(name = "id", required = true) int id, Model model) {
        reservationCRUDService.removeReservation(id);
        return "/deletereservation";
    }

    @GetMapping("/menue")
    private String menue() {
        return "/menue";
    }
}
