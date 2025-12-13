package fr.gaellalire.match_pojo;

public class DisplayState {

    private TeamState home;

    private TeamState guest;

    private boolean guestService;

    private int hour;

    private int minute;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public boolean isGuestService() {
        return guestService;
    }

    public void setGuestService(boolean guestService) {
        this.guestService = guestService;
    }

    public TeamState getHome() {
        return home;
    }

    public void setHome(TeamState home) {
        this.home = home;
    }

    public TeamState getGuest() {
        return guest;
    }

    public void setGuest(TeamState guest) {
        this.guest = guest;
    }
}
