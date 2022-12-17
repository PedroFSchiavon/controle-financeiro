package br.com.schiavon.controlefinanceiro.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "USERS")
@Getter
@Setter
public class UsersModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 40)
    private String nome;
    @Column(nullable = false, length = 40, unique = true)
    private String email;
    @Column(nullable = false, length = 30)
    private String password;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    @Column(nullable = false)
    private BigDecimal rendaMensal;

    public UsersModel(){}

    public UsersModel(String nome, String email, String password, LocalDate dataNascimento, BigDecimal rendaMensal) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.dataNascimento = dataNascimento;
        this.rendaMensal = rendaMensal;
    }
}
