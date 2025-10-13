package br.fiap.assistencia_tecnica.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "JAVA_CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long id;

    @Column(name = "NOME", nullable = true, length = 120)
    private String nome;

    @Column(name = "EMAIL", nullable = false, length = 120)
    private String email;

    @Column(name = "TELEFONE", nullable = false, length = 120)
    private String telefone;

    @Column(name = "SENHA", nullable = false, length = 120)
    private String senha;

    public Cliente(Long id, String nome, String email, String telefone, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSenha() {
        return senha;
    }
}
