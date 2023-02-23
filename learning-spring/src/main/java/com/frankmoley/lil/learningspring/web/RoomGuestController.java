package com.frankmoley.lil.learningspring.web;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.frankmoley.lil.learningspring.business.ReservationService;
import com.frankmoley.lil.learningspring.data.Guest;

@Controller
@RequestMapping("/guests")
public class RoomGuestController {
	
	private final ReservationService reservationService;
	

	public RoomGuestController(ReservationService reservationService) {
		super();
		this.reservationService = reservationService;
	}


	@RequestMapping(method = RequestMethod.GET)
	public String getGuests(Model model) {
		List<Guest> roomGuests = this.reservationService.getRoomGuests();
		model.addAttribute("roomGuests", roomGuests);
		return "roomguest";
	}
}
