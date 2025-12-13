package fr.gaellalire.match_pojo;

public class MatchEvent {

    private EventType type;

    private long timestamp;

    private boolean guestEvent;

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

}
