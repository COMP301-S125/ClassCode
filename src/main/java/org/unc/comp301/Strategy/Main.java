package org.unc.comp301.Strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random r = new Random();
        List<Agent> db = new ArrayList<>();
        for(int i=0; i<10; i++){
            int threat = r.nextInt(0,10);
            String name = "Agent" + i;
            boolean atLarge = r.nextBoolean();

            db.add(new Agent(name, threat,atLarge));
        }
        db.sort(Comparator.comparingInt(Agent::getThreatLevel).reversed());

//        db.sort(new AgentComparator().reversed());
        for(Agent a : db){
            System.out.println(a);
        }

    }
}
