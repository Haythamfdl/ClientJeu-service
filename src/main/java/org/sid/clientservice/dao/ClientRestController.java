package org.sid.clientservice.dao;

import org.sid.clientservice.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestController {
    @Autowired
 private ClientRepository clientRepository;

    @GetMapping("/authentification/{client}")
    @CrossOrigin
    public Boolean authentification(@PathVariable(name = "client") Client client){

        Client client2= clientRepository.findClientByEmail(client.getEmail());
        if(client2==null)
            return false;
            else if (client.getPassword() == client2.getPassword())
                return  true;
            return  false;
    }


}
