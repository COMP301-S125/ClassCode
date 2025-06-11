package org.unc.comp301.Strategy;

public class Agent {

    private final String name;
    private final int threatLevel;  // 1-10 (higher = more dangerous)
    private boolean atLarge; //don't need to caputure someone who is not at large

    public Agent(String name, int threatLevel,  boolean atLarge) {
        this.name = name;
        this.threatLevel = threatLevel;
        this.atLarge = atLarge;
    }

    public Agent(String name, int threatLevel) {
        this(name,threatLevel,true);
    }

    public String getName() {
        return name;
    }

    public int getThreatLevel() {
        return threatLevel;
    }



    public boolean isAtLarge(){
        return atLarge;
    }

    public void capture(){
        atLarge = false;
    }

    @Override
    public String toString() {
        return name + " (Threat: " + threatLevel + ", At Large: " + atLarge + ")";
    }
}
