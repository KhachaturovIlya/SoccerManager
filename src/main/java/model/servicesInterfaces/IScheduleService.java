package model.servicesInterfaces;

import model.repoInterfaces.ITournament;

import java.util.List;

public interface IScheduleService {
	void addTournamentForTeam(String teamName, ITournament tournament);
	void removeTeamFromTournament(String teamName, String tournamentName);
	List<ITournament> allTeamsTournaments(String teamName);
}