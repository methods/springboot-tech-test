package org.springframework.samples.petclinic.appointment;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="appointments")
public class Appointment {

	@Column(name = "pet_id")
	@NotEmpty
	private String petId;

	@Column(name = "vet_id")
	@NotEmpty
	private String vetId;

	@Column(name = "app_date")
	@NotEmpty
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate apptDate;
	
	public String getPetId() {
		return petId;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	public String getVetId() {
		return vetId;
	}

	public void setVetId(String vetId) {
		this.vetId = vetId;
	}

	public LocalDate getApptDate() {
		return apptDate;
	}

	public void setApptDate(LocalDate apptDate) {
		this.apptDate = apptDate;
	}

}
