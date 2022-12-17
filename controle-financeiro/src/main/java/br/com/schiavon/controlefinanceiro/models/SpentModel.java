package br.com.schiavon.controlefinanceiro.models;

import br.com.schiavon.controlefinanceiro.enuns.SpendTypes;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "SPENT")
public class SpentModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate spendDate;
    private BigDecimal value;
    @Enumerated(value = EnumType.STRING)
    private SpendTypes spendTypes;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private UsersModel spendOwner;
}
