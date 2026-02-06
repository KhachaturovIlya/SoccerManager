package model.repoImpls;

import model.repoInterfaces.ICountry;
import model.repoInterfaces.INationalLeague;
import model.subclasses.Nationality;

import java.util.ArrayList;
import java.util.List;

public class Country implements ICountry {
	private Nationality _country;
	private List<INationalLeague> _leagues = new ArrayList<>();



	public Country(Nationality country) {
		_country = country;
	}

	public Country(String country) {
		_country = Nationality.valueOf(country);
	}

	@Override
	public Nationality nationality() {
		return _country;
	}

	@Override
	public INationalLeague premierLeague() {
		return _leagues.getFirst();
	}

	@Override
	public INationalLeague divisionByNumber(short number) {
		return _leagues.get(number);
	}

	@Override
	public void addLeague(INationalLeague league) {
		_leagues.add(league);
	}
}