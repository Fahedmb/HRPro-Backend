package com.fahed.hrpro.ServiceImpl;

import com.fahed.hrpro.Repository.AdminRepository;
import com.fahed.hrpro.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fahed.hrpro.Entity.Admin;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin createAdmin(Admin admin) {
        // Implement admin creation logic.
        return adminRepository.save(admin);
    }

    @Override
    public Admin updateAdmin(Admin admin) {
        // Implement admin update logic.
        return adminRepository.save(admin);
    }

    @Override
    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }

    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}

