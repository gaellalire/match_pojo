package fr.gaellalire.match_pojo;

public class SetRules {

    private int minPoint;

    private int maxPoint;

    private boolean twoPointDifferenceNeeded;

    private int maxTimeoutNumber;

    private int maxSubstituteNumber;

    private int[] changeOfCourtAt;

    private int changeOfCourtEach;

    private boolean firstServiceTossed;

    private boolean courtTossed;

    public int getMinPoint() {
        return minPoint;
    }

    public void setMinPoint(int minPoint) {
        this.minPoint = minPoint;
    }

    public int getMaxPoint() {
        return maxPoint;
    }

    public void setMaxPoint(int maxPoint) {
        this.maxPoint = maxPoint;
    }

    public boolean isTwoPointDifferenceNeeded() {
        return twoPointDifferenceNeeded;
    }

    public void setTwoPointDifferenceNeeded(boolean twoPointDifferenceNeeded) {
        this.twoPointDifferenceNeeded = twoPointDifferenceNeeded;
    }

    public int getMaxTimeoutNumber() {
        return maxTimeoutNumber;
    }

    public void setMaxTimeoutNumber(int maxTimeoutNumber) {
        this.maxTimeoutNumber = maxTimeoutNumber;
    }

    public int getMaxSubstituteNumber() {
        return maxSubstituteNumber;
    }

    public void setMaxSubstituteNumber(int maxSubstituteNumber) {
        this.maxSubstituteNumber = maxSubstituteNumber;
    }

    public int[] getChangeOfCourtAt() {
        return changeOfCourtAt;
    }

    public void setChangeOfCourtAt(int... changeOfCourtAt) {
        this.changeOfCourtAt = changeOfCourtAt;
    }

    public int getChangeOfCourtEach() {
        return changeOfCourtEach;
    }

    public void setChangeOfCourtEach(int changeOfCourtEach) {
        this.changeOfCourtEach = changeOfCourtEach;
    }

    public boolean isFirstServiceTossed() {
        return firstServiceTossed;
    }

    public void setFirstServiceTossed(boolean firstServiceTossed) {
        this.firstServiceTossed = firstServiceTossed;
    }

    public boolean isCourtTossed() {
        return courtTossed;
    }

    public void setCourtTossed(boolean courtTossed) {
        this.courtTossed = courtTossed;
    }
}
