package com.fahed.hrpro.ServiceImpl;

import com.fahed.hrpro.Repository.HRRepository;
import com.fahed.hrpro.Service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fahed.hrpro.Entity.HR;

import java.util.List;

@Service
public class HRServiceImpl implements HRService {
    @Autowired
    private HRRepository hrRepository;

    @Override
    public HR createHR(HR hr) {
        // Implement HR creation logic.
        return hrRepository.save(hr);
    }

    @Override
    public HR updateHR(HR hr) {
        // Implement HR update logic.
        return hrRepository.save(hr);
    }

    @Override
    public HR getHRById(Long id) {
        return hrRepository.findById(id).orElse(null);
    }

    @Override
    public List<HR> getAllHRs() {
        return hrRepository.findAll();
    }

    @Override
    public void deleteHR(Long id) {
        hrRepository.deleteById(id);
    }
}

