package com.cst499.safepi.repository;

import com.cst499.safepi.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SensorRepository extends JpaRepository<Sensor, Long> {
    // all crud database methods
    @Query("select a from Sensor a where a.piId = :piId and a.sensorId = :sensorId")
    Sensor findByPiIdAndSensorId(
            @Param("piId") String piId,
            @Param("sensorId") String sensorId
    );
}
