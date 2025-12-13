package fr.gaellalire.match_pojo;

public class SetFinalState {

    private TeamSetFinalState homeState;

    private TeamSetFinalState guestState;

    private boolean guestServiceFirst;

    public TeamSetFinalState getHomeState() {
        return homeState;
    }

    public void setHomeState(TeamSetFinalState homeState) {
        this.homeState = homeState;
    }

    public TeamSetFinalState getGuestState() {
        return guestState;
    }

    public void setGuestState(TeamSetFinalState guestState) {
        this.guestState = guestState;
    }

    public boolean isGuestServiceFirst() {
        return guestServiceFirst;
    }

    public void setGuestServiceFirst(boolean guestServiceFirst) {
        this.guestServiceFirst = guestServiceFirst;
    }
}
