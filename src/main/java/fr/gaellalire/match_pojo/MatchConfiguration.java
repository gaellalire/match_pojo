package fr.gaellalire.match_pojo;


public class MatchConfiguration {

    private ScoredActivity scoredActivity;

    private Team homeTeam;

    private Team guestTeam;

    private MatchRules matchRules;

    public ScoredActivity getScoredActivity() {
        return scoredActivity;
    }

    public void setScoredActivity(ScoredActivity scoredActivity) {
        this.scoredActivity = scoredActivity;
    }

    public MatchRules getMatchRules() {
        return matchRules;
    }

    public void setMatchRules(MatchRules matchRules) {
        this.matchRules = matchRules;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getGuestTeam() {
        return guestTeam;
    }

    public void setGuestTeam(Team guestTeam) {
        this.guestTeam = guestTeam;
    }
    
}
