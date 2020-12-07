package org.sid.clientservice.dao;

import org.sid.clientservice.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client,Long> {
    @GetMapping("/getid/{email}")
    @CrossOrigin
    public Client findClientByEmail(@PathVariable(name = "email") String email);
}
