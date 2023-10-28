package com.fahed.hrpro.Repository;

import com.fahed.hrpro.Entity.HR;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HRRepository extends JpaRepository<HR, Long> {
}
