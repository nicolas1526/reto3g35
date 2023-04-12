package com.grupog35.reto3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Messages")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 250)
    private String text;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_client", nullable = false)
    private ClientModel client;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_car", nullable = false)
    private CarModel car;

}
