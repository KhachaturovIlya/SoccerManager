package model.servicesInterfaces;

import model.entityInterfaces.IFormation;
import model.entityInterfaces.IPlayingFootballer;
import model.subclasses.Role;

import java.util.Map;


public interface IMatchStartService {
    void addPlayerToStartingXI(short number, Role role);
    void addPlayerOnBench(short number);
    void replacePlayerInStartingXI(short numberOld, short numberNew);
    void replacePlayerOnBench(short numberOld, short numberNew);
    void swapPlayersInStartingXI(short numberX, short numberY);
    void setFormation(IFormation formation);
    Map<Short, IPlayingFootballer> startingXI();
    Map<Short, IPlayingFootballer> bench();
    boolean isFormationSet();
    boolean isTeamReady();
}