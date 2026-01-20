package model.servicesImpls;

import model.entityInterfaces.IFootballerProfile;
import model.entityInterfaces.IPlayingFootballer;
import model.entityInterfaces.ITeam;
import model.servicesInterfaces.IMatchStartService;
import model.servicesInterfaces.IPlayingFootballerFactory;
import model.subclasses.Role;

import java.util.List;
import java.util.Optional;

public class MatchStartService implements IMatchStartService {
    private static final short PLAYERS_ON_FIELD = 11;
    private static final short MAX_PLAYERS_ON_BENCH = 11;
    private static final short MIN_PLAYERS_ON_BENCH = 9;
    private ITeam _teamX;
    private ITeam _teamY;
    private short _playersOnFieldX;
    private short _playersOnFieldY;
    private short _playersOnBenchX;
    private short _playersOnBenchY;
    private List<IPlayingFootballer> _startingXITeamX;
    private List<IPlayingFootballer> _startingXITeamY;
    private List<IPlayingFootballer> _bench;
    private IPlayingFootballerFactory _factory;


    public MatchStartService(ITeam teamX, ITeam teamY, IPlayingFootballerFactory factory) {
        _teamX = teamX;
        _teamY = teamY;
        _factory = factory;
    }


    @Override
    public void addPlayerToStartingXI(IFootballerProfile player, Role role) {
        Optional<IFootballerProfile> profileX = _teamX.findPlayerByNumber(player.number());
        Optional<IFootballerProfile> profileY = _teamY.findPlayerByNumber(player.number());

        if (profileX.isEmpty() && profileY.isEmpty()) {
            // throw
        }

        IPlayingFootballer footballer = _factory.produce(player, role);

        if (_playersOnFieldX < PLAYERS_ON_FIELD && profileX.get().name().equals(player.name())) {
            _startingXITeamX.add(footballer);
            _playersOnFieldX += 1;
        } else if (_playersOnFieldY < PLAYERS_ON_FIELD && profileY.get().name().equals(player.name())) {
            _startingXITeamY.add(footballer);
            _playersOnFieldY += 1;
        }
    }

    @Override
    public void addPlayerOnBench(IFootballerProfile player) {

    }
}