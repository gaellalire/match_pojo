package fr.gaellalire.match_pojo;

public class MatchRules {

    private RulesName rulesName;

    private int minSetNumber;

    private SetRules defaultSetRules;

    private SetRules lastSetRules;

    private InternalServiceRotation internalServiceRotation;

    private int timeoutDuration;

    private int maxSubstitutionEntering;

    private int serviceTime;

    public int getMinSetNumber() {
        return minSetNumber;
    }

    public void setMinSetNumber(int minSetNumber) {
        this.minSetNumber = minSetNumber;
    }

    public SetRules getDefaultSetRules() {
        return defaultSetRules;
    }

    public void setDefaultSetRules(SetRules defaultSetRules) {
        this.defaultSetRules = defaultSetRules;
    }

    public SetRules getLastSetRules() {
        return lastSetRules;
    }

    public void setLastSetRules(SetRules lastSetRules) {
        this.lastSetRules = lastSetRules;
    }

    public InternalServiceRotation getServiceRotation() {
        return internalServiceRotation;
    }

    public void setServiceRotation(InternalServiceRotation internalServiceRotation) {
        this.internalServiceRotation = internalServiceRotation;
    }

    public int getTimeoutDuration() {
        return timeoutDuration;
    }

    public void setTimeoutDuration(int timeoutDuration) {
        this.timeoutDuration = timeoutDuration;
    }

    public int getMaxSubstitutionEntering() {
        return maxSubstitutionEntering;
    }

    public void setMaxSubstitutionEntering(int maxSubstitutionEntering) {
        this.maxSubstitutionEntering = maxSubstitutionEntering;
    }

    public RulesName getRulesName() {
        return rulesName;
    }

    public void setRulesName(RulesName rulesName) {
        this.rulesName = rulesName;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(int serviceTime) {
        this.serviceTime = serviceTime;
    }

    public InternalServiceRotation getInternalServiceRotation() {
        return internalServiceRotation;
    }

    public void setInternalServiceRotation(InternalServiceRotation internalServiceRotation) {
        this.internalServiceRotation = internalServiceRotation;
    }
}
