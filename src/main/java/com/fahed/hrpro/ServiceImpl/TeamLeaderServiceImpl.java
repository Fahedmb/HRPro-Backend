package com.fahed.hrpro.ServiceImpl;

import com.fahed.hrpro.Repository.TeamLeaderRepository;
import com.fahed.hrpro.Service.TeamLeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fahed.hrpro.Entity.TeamLeader;

import java.util.List;

@Service
public class TeamLeaderServiceImpl implements TeamLeaderService {
    @Autowired
    private TeamLeaderRepository teamLeaderRepository;

    @Override
    public TeamLeader createTeamLeader(TeamLeader teamLeader) {
        // Implement team leader creation logic.
        return teamLeaderRepository.save(teamLeader);
    }

    @Override
    public TeamLeader updateTeamLeader(TeamLeader teamLeader) {
        // Implement team leader update logic.
        return teamLeaderRepository.save(teamLeader);
    }

    @Override
    public TeamLeader getTeamLeaderById(Long id) {
        return teamLeaderRepository.findById(id).orElse(null);
    }

    @Override
    public List<TeamLeader> getAllTeamLeaders() {
        return teamLeaderRepository.findAll();
    }

    @Override
    public void deleteTeamLeader(Long id) {
        teamLeaderRepository.deleteById(id);
    }
}


