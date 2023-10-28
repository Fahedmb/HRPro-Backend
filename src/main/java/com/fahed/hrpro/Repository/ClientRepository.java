package com.fahed.hrpro.Repository;

import com.fahed.hrpro.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
