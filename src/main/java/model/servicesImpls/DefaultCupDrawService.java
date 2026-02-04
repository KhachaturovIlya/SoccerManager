package model.servicesImpls;

import model.repoImpls.DefaultCup;
import model.repoInterfaces.ITournament;
import model.servicesInterfaces.IDrawService;
import model.subclasses.MatchNote;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class DefaultCupDrawService implements IDrawService {
	@Override
	public void holdADraw(ITournament tournament) {
		List<String> teams = tournament.teams();
		int size = teams.size();
		List<MatchNote> pairs = new ArrayList<>(size / 2);
		Set<Integer> occupiedTeamsIndexes = new HashSet<>(size);

		for (int i = 0; i < size; i++) {
			int opponentIndex;
			do {
				opponentIndex = ThreadLocalRandom.current().nextInt(i, size);
			} while (occupiedTeamsIndexes.contains(opponentIndex));

			pairs.add(new MatchNote(teams.get(i), teams.get(opponentIndex)));
			occupiedTeamsIndexes.add(opponentIndex);
		}
		var cup = (DefaultCup) tournament;
		cup.setPairsAfterDraw(pairs);
	}
}