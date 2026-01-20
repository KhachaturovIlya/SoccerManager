package model.servicesInterfaces;

import model.entityInterfaces.IFootballerProfile;
import model.subclasses.Role;

public interface IMatchStartService {
    void addPlayerToStartingXI(IFootballerProfile player, Role role);
    void addPlayerOnBench(IFootballerProfile player);
}