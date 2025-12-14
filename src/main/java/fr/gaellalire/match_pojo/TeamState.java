package fr.gaellalire.match_pojo;

import java.util.List;

public class TeamState {

    private int set;

    private int point;

    private int substitution;

    private int timeout;

    private List<String> playerIdentifiers;

    private String captainIdentifier;

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getSubstitution() {
        return substitution;
    }

    public void setSubstitution(int substitution) {
        this.substitution = substitution;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public List<String> getPlayerIdentifiers() {
        return playerIdentifiers;
    }

    public void setPlayerIdentifiers(List<String> playerIdentifiers) {
        this.playerIdentifiers = playerIdentifiers;
    }

    public String getCaptainIdentifier() {
        return captainIdentifier;
    }

    public void setCaptainIdentifier(String captainIdentifier) {
        this.captainIdentifier = captainIdentifier;
    }
    
}
