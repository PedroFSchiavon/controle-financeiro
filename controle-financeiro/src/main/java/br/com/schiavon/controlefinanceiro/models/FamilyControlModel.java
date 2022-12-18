package br.com.schiavon.controlefinanceiro.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "FAMILY_CONTROL")
@Getter
@Setter
public class FamilyControlModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "family")
    private List<UsersModel> familyMembers;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "family")
    private List<SpentModel> familySpend;
    private BigDecimal monthlyIncome;
    private BigDecimal totalBalance;
    @Column(nullable = false, length = 20)
    private String familyName;

}
