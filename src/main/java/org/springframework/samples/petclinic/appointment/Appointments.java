package org.springframework.samples.petclinic.appointment;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Appointments {

		private List<Appointment> appointments;

		@XmlElement
		public List<Appointment> getVetList() {
			if (appointments == null) {
				appointments = new ArrayList<>();
			}
			return appointments;
		}

}
