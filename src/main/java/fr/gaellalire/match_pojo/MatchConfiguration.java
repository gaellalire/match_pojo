package fr.gaellalire.match_pojo;


public class MatchConfiguration {

    private ScoredActivity scoredActivity;

    private Teams teams;

    private MatchRules matchRules;

    public Teams getTeams() {
        return teams;
    }

    public void setTeams(Teams teams) {
        this.teams = teams;
    }

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
}
