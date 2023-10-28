package com.fahed.hrpro.Service;

import com.fahed.hrpro.Entity.Admin;

import java.util.List;

public interface AdminService {
    Admin createAdmin(Admin admin);
    Admin updateAdmin(Admin admin);
    Admin getAdminById(Long id);
    List<Admin> getAllAdmins();
    void deleteAdmin(Long id);
}

