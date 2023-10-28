package com.fahed.hrpro.Service;

import com.fahed.hrpro.Entity.TeamLeader;

import java.util.List;

public interface TeamLeaderService {
    TeamLeader createTeamLeader(TeamLeader teamLeader);
    TeamLeader updateTeamLeader(TeamLeader teamLeader);
    TeamLeader getTeamLeaderById(Long id);
    List<TeamLeader> getAllTeamLeaders();
    void deleteTeamLeader(Long id);
}

