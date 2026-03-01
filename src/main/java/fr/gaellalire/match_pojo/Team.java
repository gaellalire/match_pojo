package fr.gaellalire.match_pojo;

import java.util.List;

public class Team {

    private String name;

    private String captainIdentifier;
    
    private List<Player> players;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getCaptainIdentifier() {
        return captainIdentifier;
    }

    public void setCaptainIdentifier(String captainIdentifier) {
        this.captainIdentifier = captainIdentifier;
    }
    
    
}
