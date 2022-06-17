package hkpl_backend.hkpl_backend.service;

import com.google.gson.Gson;
import hkpl_backend.hkpl_backend.data.Fixture;
import hkpl_backend.hkpl_backend.data.FixtureResult;
import hkpl_backend.hkpl_backend.data.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class FootballService {

    String baseUrl = "apiv2.allsportsapi.com/football";
    String apiKey = "ac231ccaec46e9115b02aecd43631abe2b8bab3c2301e19b8e3638b8d1a9eecd";

    public Fixture getFixtureWithin() throws Exception{
        URL result = new URL ("https://"+ baseUrl+ "/?met=Fixtures&APIkey=ac231ccaec46e9115b02aecd43631abe2b8bab3c2301e19b8e3638b8d1a9eecd&from=20211030&to=20211231&leagueId=186");
        URLConnection yc = result.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine = in.readLine();
        in.close();
        System.out.println("testing 1   -   " + inputLine);

        Gson gson = new Gson();
        FixtureResult fixtureResult = gson.fromJson(inputLine, FixtureResult.class);
        System.out.println("testing 2   -   " + fixtureResult);
        Fixture fixture = new Fixture();

        List<Object> obj = fixtureResult.getResult();

        fixture.setEventAwayTeam(obj.get(0).getEvent_away_team());
        fixture.setAwayTeamKey(obj.get(0).getAway_team_key());
        fixture.setEventHomeTeam(obj.get(0).getEvent_home_team());
        fixture.setHomeTeamKey(obj.get(0).getHome_team_key());
        fixture.setEventStadium(obj.get(0).getEvent_stadium());
        fixture.setEventDate(obj.get(0).getEvent_date());
        fixture.setLeagueRound(obj.get(0).getLeague_round());
        fixture.setLeagueSeason(obj.get(0).getLeague_season());

        return fixture;
    }
}
