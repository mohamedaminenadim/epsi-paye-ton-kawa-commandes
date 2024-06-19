package com.epsi.mspr.payetonkawa.commandes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommandesRepository extends JpaRepository<CommandeEntity, Long> {
    List<CommandeEntity> findAll();
    CommandeEntity findByCommandeID(Long id);
    CommandeEntity deleteCommandeEntityByCommandeID(Long id);
}
