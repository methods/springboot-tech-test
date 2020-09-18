package org.springframework.samples.petclinic.appointment;

import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.samples.petclinic.owner.OwnerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class AppointmentController {

	private static final String VIEWS_APPOINTMENT_CREATE_OR_UPDATE_FORM = "appointments/createOrUpdateAppointmentForm";

	private final AppointmentRepository appointments;
	private final OwnerRepository owners;


	public AppointmentController(AppointmentRepository appointments, OwnerRepository owners) {
		this.appointments = appointments;
		this.owners = owners;
	}

	@GetMapping("/appointments/new")
	public String initCreationForm(Map<String, Object> model) {
		Appointment appointment = new Appointment();
		model.put("appointment", appointment);
		return VIEWS_APPOINTMENT_CREATE_OR_UPDATE_FORM;
	}

	@PostMapping("/appointments/new")
	public String processCreationForm(@Valid Appointment appointment, BindingResult result) {

		if (result.hasErrors()) {
			return VIEWS_APPOINTMENT_CREATE_OR_UPDATE_FORM;
		}
		else {
			this.appointments.save(appointment);
			return "redirect:/appointments/" + appointment.getId();
		}
	}
}
