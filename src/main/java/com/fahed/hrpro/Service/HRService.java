package com.fahed.hrpro.Service;

import com.fahed.hrpro.Entity.HR;

import java.util.List;

public interface HRService {
    HR createHR(HR hr);
    HR updateHR(HR hr);
    HR getHRById(Long id);
    List<HR> getAllHRs();
    void deleteHR(Long id);
}

