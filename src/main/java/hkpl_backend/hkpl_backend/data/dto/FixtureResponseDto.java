package hkpl_backend.hkpl_backend.data.dto;

import hkpl_backend.hkpl_backend.data.Fixture;

public class FixtureResponseDto {

    public FixtureResponseDto(Fixture fixture){
        setEventDate(fixture.getEventDate());
        setEventHomeTeam(fixture.getEventHomeTeam());
        setHomeTeamKey(fixture.getHomeTeamKey());
        setEventAwayTeam(fixture.getEventAwayTeam());
        setAwayTeamKey(fixture.getAwayTeamKey());
        setLeagueRound(fixture.getLeagueRound());
        setLeagueSeason(fixture.getLeagueSeason());
        setEventStadium(fixture.getEventStadium());
    }
    private String eventDate;
    private String eventHomeTeam;
    private String homeTeamKey;
    private String eventAwayTeam;
    private String awayTeamKey;
    private String leagueRound;
    private String leagueSeason;
    private String eventStadium;

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventHomeTeam() {
        return eventHomeTeam;
    }

    public void setEventHomeTeam(String eventHomeTeam) {
        this.eventHomeTeam = eventHomeTeam;
    }

    public String getHomeTeamKey() {
        return homeTeamKey;
    }

    public void setHomeTeamKey(String homeTeamKey) {
        this.homeTeamKey = homeTeamKey;
    }

    public String getEventAwayTeam() {
        return eventAwayTeam;
    }

    public void setEventAwayTeam(String eventAwayTeam) {
        this.eventAwayTeam = eventAwayTeam;
    }

    public String getAwayTeamKey() {
        return awayTeamKey;
    }

    public void setAwayTeamKey(String awayTeamKey) {
        this.awayTeamKey = awayTeamKey;
    }

    public String getLeagueRound() {
        return leagueRound;
    }

    public void setLeagueRound(String leagueRound) {
        this.leagueRound = leagueRound;
    }

    public String getLeagueSeason() {
        return leagueSeason;
    }

    public void setLeagueSeason(String leagueSeason) {
        this.leagueSeason = leagueSeason;
    }

    public String getEventStadium() {
        return eventStadium;
    }

    public void setEventStadium(String eventStadium) {
        this.eventStadium = eventStadium;
    }
}
