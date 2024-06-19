package com.epsi.mspr.payetonkawa.commandes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandesService {

    @Autowired
    private CommandesRepository commandesRepository;

    public List<CommandeEntity> getAllCommandes() {
        return this.commandesRepository.findAll();
    }
    public CommandeEntity getCommandeById(Long id) {
        return this.commandesRepository.findByCommandeID(id);
    }

    public CommandeEntity postCommande(CommandeEntity commandeEntity) {
        return this.commandesRepository.save(commandeEntity);
    }

    public CommandeEntity updateCommande(Long id, CommandeEntity commandeEntity) {
        CommandeEntity toUpdate = this.commandesRepository.findByCommandeID(id);
        // Set all fields
        return toUpdate;
    }

    public CommandeEntity deleteClient(Long id) {
        return this.commandesRepository.deleteCommandeEntityByCommandeID(id);
    }
}
