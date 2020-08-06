package org.springframework.samples.petclinic.appointment;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.GetMapping;

public class AppointmentController {

	//This should make a REST call to appointment service 
	
	@GetMapping("/appointments")
	public String showAppointmentList(Map<String, Object> model) throws ClientProtocolException, IOException {
		// Making a REST call to appointment service
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		final HttpGet httpGet = new HttpGet("http://localhost:8081/appointments");
		CloseableHttpResponse response = httpClient.execute(httpGet);
		StatusLine statusLine = response.getStatusLine();		        
		String responseBody = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
		        
		List<Appointment> appts = /* handle responseBody to get List of appointments*/ new ArrayList<>();
		
		model.put("appointments",  appts);    
		return "appointments/appointmentList";
	}
}
