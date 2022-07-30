package com.api.parkingcontrol.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "ID_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id @Getter @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Getter @Setter
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;

    @Getter @Setter
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;

    @Getter @Setter
    @Column(nullable = false,  length = 70)
    private String brandCar;

    @Getter @Setter
    @Column(nullable = false,  length = 70)
    private String modelCar;

    @Getter @Setter
    @Column(nullable = false,  length = 70)
    private String colorCar;

    @Getter @Setter
    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @Getter @Setter
    @Column(nullable = false, length = 130)
    private String responsibleName;

    @Getter @Setter
    @Column(nullable = false, length = 30)
    private String apartment;

    @Getter @Setter
    @Column(nullable = false, length = 30)
    private String block;

}
