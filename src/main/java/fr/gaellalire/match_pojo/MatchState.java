package fr.gaellalire.match_pojo;

import java.util.List;

public class MatchState {

    private boolean ended;

    // side that forfeited: "home", "guest" or "both"
    private String forfeit;

    // declared winner when the score is tied: "home" or "guest"
    private String winner;

    public String getForfeit() {
        return forfeit;
    }

    public void setForfeit(String forfeit) {
        this.forfeit = forfeit;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    private boolean guestService;

    private boolean guestServiceFirst;

    private float buzzingTime;

    public float getBuzzingTime() {
        return buzzingTime;
    }

    public void setBuzzingTime(float buzzingTime) {
        this.buzzingTime = buzzingTime;
    }

    private long buzzStart;

    private long buzzEnd;

    private long timeoutStart;

    private long timeoutEnd;

    private TeamState homeTeamState;

    private TeamState guestTeamState;

    private boolean changeOfCourt;

    private boolean serviceTossDone;

    private boolean courtToss;

    public void setGuestService(boolean guestService) {
        this.guestService = guestService;
    }

    public boolean isGuestServiceFirst() {
        return guestServiceFirst;
    }

    public boolean isServiceTossDone() {
        return serviceTossDone;
    }

    public void setServiceTossDone(boolean serviceTossDone) {
        this.serviceTossDone = serviceTossDone;
    }

    public void setGuestServiceFirst(boolean guestServiceFirst) {
        this.guestServiceFirst = guestServiceFirst;
    }

    public boolean isGuestService() {
        return guestService;
    }

    public long getBuzzEnd() {
        return buzzEnd;
    }

    public long getBuzzStart() {
        return buzzStart;
    }

    public void setBuzzEnd(long buzzEnd) {
        this.buzzEnd = buzzEnd;
    }

    public void setBuzzStart(long buzzStart) {
        this.buzzStart = buzzStart;
    }

    public long getTimeoutStart() {
        return timeoutStart;
    }

    public void setTimeoutStart(long timeoutStart) {
        this.timeoutStart = timeoutStart;
    }

    public long getTimeoutEnd() {
        return timeoutEnd;
    }

    public void setTimeoutEnd(long timeoutEnd) {
        this.timeoutEnd = timeoutEnd;
    }

    public TeamState getHomeTeamState() {
        return homeTeamState;
    }

    public void setHomeTeamState(TeamState homeTeamState) {
        this.homeTeamState = homeTeamState;
    }

    public TeamState getGuestTeamState() {
        return guestTeamState;
    }

    public void setGuestTeamState(TeamState guestTeamState) {
        this.guestTeamState = guestTeamState;
    }

    public boolean isEnded() {
        return ended;
    }

    public void setEnded(boolean ended) {
        this.ended = ended;
    }

    public boolean isChangeOfCourt() {
        return changeOfCourt;
    }

    public void setChangeOfCourt(boolean changeOfCourt) {
        this.changeOfCourt = changeOfCourt;
    }

    private List<MatchEvent> events;

    public List<MatchEvent> getEvents() {
        return events;
    }

    public void setEvents(List<MatchEvent> events) {
        this.events = events;
    }

    private List<SetFinalState> setFinalStates;

    public List<SetFinalState> getSetFinalStates() {
        return setFinalStates;
    }

    public void setSetFinalStates(List<SetFinalState> setFinalStates) {
        this.setFinalStates = setFinalStates;
    }

    public boolean isCourtToss() {
        return courtToss;
    }

    public void setCourtToss(boolean courtToss) {
        this.courtToss = courtToss;
    }
}
