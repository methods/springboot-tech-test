package org.springframework.samples.petclinic.appointment;

import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.transaction.annotation.Transactional;


public interface AppointmentRepository extends Repository<Appointment, Integer> {

	/**
	 * Retrieve a {@link Appointment} from the data store by id.
	 * @param id the id to search for
	 * @return the {@link Appointment} if found
	 */
	@Transactional(readOnly = true)
	Appointment findById(Integer id);



	/**
	 * Save a {@link Appointment} to the data store, either inserting or updating it.
	 * @param appointment the {@link Appointment} to save
	 */
	void save(Appointment appointment);
}
