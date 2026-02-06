package model.repoInterfaces;

import model.entityInterfaces.ITeam;

import java.util.List;

public interface ITeamRepository {
	void addTeam(ITeam team);
	ITeam teamByName(String name);
	List<ITeam> allTeams();
}