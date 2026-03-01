package fr.gaellalire.match_pojo;

import java.util.List;

public class MatchEvent {

    private EventType type;

    private long timestamp;

    private boolean guestEvent;

    private List<String> playerIdentifiers;

    private String playerIdentifier;
    
    private SanctionType sanctionType;
    
    private List<PlayerSubstitution> playerSubstitutions;

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isGuestEvent() {
        return guestEvent;
    }

    public void setGuestEvent(boolean guestEvent) {
        this.guestEvent = guestEvent;
    }

    private boolean cancelled;

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public List<PlayerSubstitution> getPlayerSubstitutions() {
        return playerSubstitutions;
    }

    public void setPlayerSubstitutions(List<PlayerSubstitution> playerSubstitutions) {
        this.playerSubstitutions = playerSubstitutions;
    }

    public String getPlayerIdentifier() {
        return playerIdentifier;
    }

    public void setPlayerIdentifier(String playerIdentifier) {
        this.playerIdentifier = playerIdentifier;
    }

    public SanctionType getSanctionType() {
        return sanctionType;
    }

    public void setSanctionType(SanctionType sanctionType) {
        this.sanctionType = sanctionType;
    }

    public List<String> getPlayerIdentifiers() {
        return playerIdentifiers;
    }

    public void setPlayerIdentifiers(List<String> playerIdentifiers) {
        this.playerIdentifiers = playerIdentifiers;
    }
    
}
