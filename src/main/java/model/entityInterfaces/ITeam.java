package model.entityInterfaces;

import model.components.IHasName;

import java.util.List;
import java.util.Optional;

public interface ITeam extends IHasName {
    void addPlayer(IFootballerProfile player);
    void setHeadCoach(ICoach coach);
    List<IFootballerProfile> allPlayers();
    Optional<IFootballerProfile> findPlayerByNumber(short number);
}