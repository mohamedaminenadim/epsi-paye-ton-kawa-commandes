package com.epsi.mspr.payetonkawa.commandes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/commandes")
public class CommandesController {

    public CommandesService commandesService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<CommandeEntity> getAllCommandes() {
        return commandesService.getAllCommandes();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommandeEntity getCommande(@PathVariable Long id) {
        return commandesService.getCommandeById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public CommandeEntity postCommande(@RequestBody CommandeEntity commandeEntity) {
        return commandesService.postCommande(commandeEntity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public CommandeEntity getClient(@PathVariable Long id, @RequestBody CommandeEntity commandeEntity) {
        return commandesService.updateCommande(id, commandeEntity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public CommandeEntity deleteClient(@PathVariable Long id) {
        return commandesService.deleteClient(id);
    }


}
