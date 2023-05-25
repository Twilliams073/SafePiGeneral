package com.cst499.safepi.controller;

import com.cst499.safepi.exception.ResourceNotFoundException;
import com.cst499.safepi.model.Sensor;
import com.cst499.safepi.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/sensors")
public class SensorController {

    @Autowired
    private SensorRepository sensorRepository;

    // Get All Sensors
    @GetMapping
    public List<Sensor> getAllSensors(){
        return sensorRepository.findAll();
    }

    // Get Sensor by Id
    @GetMapping("{id}")
    public ResponseEntity<Sensor> getSensorById(@PathVariable long id){
        Sensor sensor = sensorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sensor does not exist with id: " +id));
        return ResponseEntity.ok(sensor);
    }

    // Add New Sensor
    @PostMapping
    public Sensor createSensor(@RequestBody Sensor sensor){
        return sensorRepository.save(sensor);
    }

    //Update Sensor Status by Id
    @PutMapping("{id}")
    public ResponseEntity<Sensor> updateSensorById(@PathVariable long id, @RequestBody Sensor sensorDetails){
        Sensor updateSensorById = sensorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sensor does not exist with id: " +id));
        updateSensorById.setStatus(sensorDetails.getStatus());
        updateSensorById.setTimestamp(sensorDetails.getTimestamp());

        sensorRepository.save(updateSensorById);

        return ResponseEntity.ok(updateSensorById);
    }

    @PutMapping("{piId}/{sensorId}")
    public ResponseEntity<Sensor> updateSensorByName(@PathVariable("piId") String piId
            , @PathVariable("sensorId") String sensorId, @RequestBody Sensor sensorDetails){
        Sensor updateSensorByName = sensorRepository.findByPiIdAndSensorId(piId, sensorId);
        updateSensorByName.setStatus(sensorDetails.getStatus());
        updateSensorByName.setTimestamp(sensorDetails.getTimestamp());

        sensorRepository.save(updateSensorByName);
        return ResponseEntity.ok(updateSensorByName);

    }
}
