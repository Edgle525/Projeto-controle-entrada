package com.projeto.acesso.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos") // O nome exato da tabela que criamos no SQL
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String matricula;

    @Column(name = "cartao_rfid", unique = true) // Nome exato da coluna no SQL
    private String cartaoRfid;

    // Construtores
    public Aluno() {}

    public Aluno(String nome, String matricula, String cartaoRfid) {
        this.nome = nome;
        this.matricula = matricula;
        this.cartaoRfid = cartaoRfid;
    }

    // Getters e Setters (Essenciais para o Spring funcionar)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getCartaoRfid() { return cartaoRfid; }
    public void setCartaoRfid(String cartaoRfid) { this.cartaoRfid = cartaoRfid; }
}