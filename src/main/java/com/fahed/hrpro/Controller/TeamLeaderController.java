package com.fahed.hrpro.Controller;

import com.fahed.hrpro.Entity.TeamLeader;
import com.fahed.hrpro.Service.TeamLeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teamleaders")
public class TeamLeaderController {
    @Autowired
    private TeamLeaderService teamLeaderService;

    /*
    @PostMapping
    public TeamLeader createTeamLeader(@RequestBody TeamLeader teamLeader) {
        return teamLeaderService.createTeamLeader(teamLeader);
    }
    */

    @GetMapping("/{id}")
    public TeamLeader getTeamLeaderById(@PathVariable Long id) {
        return teamLeaderService.getTeamLeaderById(id);
    }

    @GetMapping
    public List<TeamLeader> getAllTeamLeaders() {
        return teamLeaderService.getAllTeamLeaders();
    }

    @PutMapping("/{id}")
    public TeamLeader updateTeamLeader(@PathVariable Long id, @RequestBody TeamLeader teamLeader) {
        teamLeader.setId(id);
        return teamLeaderService.updateTeamLeader(teamLeader);
    }

    @DeleteMapping("/{id}")
    public void deleteTeamLeader(@PathVariable Long id) {
        teamLeaderService.deleteTeamLeader(id);
    }
}
