package model.repoInterfaces;

import model.components.IHasNationality;

public interface ICountry extends IHasNationality {
	INationalLeague premierLeague();
	INationalLeague divisionByNumber(short number);
	void addLeague(INationalLeague league);
}