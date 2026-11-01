package fr.gaellalire.match_pojo;

public class TeamState {

    private int set;

    private int point;

    private int substitution;

    private int timeout;

    // this team forfeited
    private boolean forfeit;

    // this team declares it won (decides a tied score); both teams
    // declaring it is a conflict rejected when signing
    private boolean winner;

    public boolean isForfeit() {
        return forfeit;
    }

    public void setForfeit(boolean forfeit) {
        this.forfeit = forfeit;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

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
    
}
