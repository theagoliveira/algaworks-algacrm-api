package com.algaworks.crm.algacrmapi.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

}
