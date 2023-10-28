package com.fahed.hrpro.Controller;

import com.fahed.hrpro.Entity.HR;
import com.fahed.hrpro.Service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hr")
public class HRController {
    @Autowired
    private HRService hrService;
    /*
    @PostMapping
    public HR createHR(@RequestBody HR hr) {
        return hrService.createHR(hr);
    }
    */
    @GetMapping("/{id}")
    public HR getHRById(@PathVariable Long id) {
        return hrService.getHRById(id);
    }

    @GetMapping
    public List<HR> getAllHRs() {
        return hrService.getAllHRs();
    }

    @PutMapping("/{id}")
    public HR updateHR(@PathVariable Long id, @RequestBody HR hr) {
        hr.setId(id);
        return hrService.updateHR(hr);
    }

    @DeleteMapping("/{id}")
    public void deleteHR(@PathVariable Long id) {
        hrService.deleteHR(id);
    }
}

