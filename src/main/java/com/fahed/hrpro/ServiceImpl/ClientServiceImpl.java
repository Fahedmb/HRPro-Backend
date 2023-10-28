package com.fahed.hrpro.ServiceImpl;

import com.fahed.hrpro.Repository.ClientRepository;
import com.fahed.hrpro.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fahed.hrpro.Entity.Client;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client createClient(Client client) {
        // Implement client creation logic.
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        // Implement client update logic.
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
