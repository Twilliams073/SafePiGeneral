package com.cst499.safepi.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sensors")
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "pi_id")
    private String piId;

    @Column(name = "sensor_id")
    private String sensorId;

    @Column(name = "status")
    private String status;

    @Column(name = "timestamp")
    private String timestamp;

}


