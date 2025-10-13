package br.fiap.assistencia_tecnica.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "JAVA_CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long id;
}
