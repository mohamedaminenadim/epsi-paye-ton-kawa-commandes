package com.epsi.mspr.payetonkawa.commandes;

import com.epsi.mspr.payetonkawa.produits.ProduitEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "commandes")
@RequiredArgsConstructor
@Getter
@Setter
public class CommandeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long commandeID;

    @Column(name = "name")
    private String name;

    @OneToOne()
    @Column(name = "client_id")
    private long clientID;


    @OneToMany
    @Column(name = "products")
    private List<ProduitEntity> produits;

    @Column(name = "creation_date", nullable=false)
    private LocalDateTime createdAt;

}
