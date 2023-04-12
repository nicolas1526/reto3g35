package com.grupog35.reto3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Reservation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "devolution_date")
    private Date devolutionDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_client", nullable = false)
    private ClientModel client;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_car", nullable = false)
    private CarModel car;

}
