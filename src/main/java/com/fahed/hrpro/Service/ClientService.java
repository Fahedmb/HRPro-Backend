package com.fahed.hrpro.Service;

import com.fahed.hrpro.Entity.Client;

import java.util.List;

public interface ClientService {
    Client createClient(Client client);
    Client updateClient(Client client);
    Client getClientById(Long id);
    List<Client> getAllClients();
    void deleteClient(Long id);
}
