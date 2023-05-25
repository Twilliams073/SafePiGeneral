package com.cst499.safepi;

import com.cst499.safepi.model.Sensor;
import com.cst499.safepi.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SafepiBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SafepiBackendApplication.class, args);
	}

	@Autowired
	private SensorRepository sensorRepository;
	@Override
	public void run(String... args) throws Exception {
//		Sensor sensor = new Sensor();
//		sensor.setPiId("Pi0");
//		sensor.setSensorId("Sen0");
//		sensor.setStatus("Offline");
//		sensor.setTimestamp("Null");
//		sensorRepository.save(sensor);
	}
}
