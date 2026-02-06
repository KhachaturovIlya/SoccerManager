package model.repoInterfaces;

import model.subclasses.MatchNote;
import model.subclasses.TournamentTableNote;

import java.util.List;
import java.util.Map;

public interface INationalLeague extends ITournament {
	void addTeam(String team);
	void removeTeam(String team);
	void setSchedule(Map<String, List<MatchNote>> schedule);
	short currentTour();
	void increaseTour();
	List<TournamentTableNote> tournamentTable();
}