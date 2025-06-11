package org.unc.comp301.Strategy;

import java.util.Comparator;

public class AgentComparator implements Comparator<Agent> {
    @Override
    public int compare(Agent o1, Agent o2) {
        return o1.getThreatLevel() - o2.getThreatLevel();
    }
}
