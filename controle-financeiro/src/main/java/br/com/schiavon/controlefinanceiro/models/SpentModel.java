package br.com.schiavon.controlefinanceiro.models;

import br.com.schiavon.controlefinanceiro.enuns.SpendTypes;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "SPENT")
@Getter
@Setter
public class SpentModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDate spendDate;
    @Column(nullable = false)
    private BigDecimal value;
    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private SpendTypes spendTypes;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private UsersModel spendOwner;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "family_id")
    private FamilyControlModel family;
}
