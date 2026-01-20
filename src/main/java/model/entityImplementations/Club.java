package model.entityImplementations;

import model.entityInterfaces.ICoach;
import model.entityInterfaces.IFootballerProfile;
import model.entityInterfaces.ITeam;

import java.util.List;
import java.util.Optional;

public class Club implements ITeam {
    private String _name;
    private ICoach _headCoach;
    private List<IFootballerProfile> _players;
    private int _transferBudget;

    @Override
    public String name() {
        return _name;
    }

    @Override
    public void addPlayer(IFootballerProfile player) {
        _players.add(player);
    }

    @Override
    public void setHeadCoach(ICoach coach) {
        _headCoach = coach;
    }

    @Override
    public List<IFootballerProfile> allPlayers() {
        return _players;
    }

    @Override
    public Optional<IFootballerProfile> findPlayerByNumber(short number) {
        return _players.stream().filter(p -> p.number() == number).findAny();
    }
}