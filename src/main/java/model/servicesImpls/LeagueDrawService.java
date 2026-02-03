package model.servicesImpls;

import model.repoInterfaces.INationalLeague;
import model.repoInterfaces.ITournament;
import model.servicesInterfaces.IDrawService;
import model.subclasses.MatchNote;

import java.util.*;

public class LeagueDrawService implements IDrawService {
	private Random random = new Random();

	private void holdATourDraw(List<String> teams) {
		int size = teams.size();
		List<MatchNote> res = new ArrayList<>(size / 2);
		for (int i = 0; i < size; i += 1) {
			int opponentIndex = random.nextInt(size - i + 1) + i;
			res.add(new MatchNote(teams.get(i), teams.get(opponentIndex)));
		}
	}


	@Override
	public void holdADraw(ITournament tournament) {
		List<String> teams = tournament.teams();
		Map<String, List<MatchNote>> res = new HashMap<>(teams.size());



		var league = (INationalLeague) tournament;
	}
}