package org.unc.comp301.GoValuate;

public class Robot {
    private String name = null;
    private int intelligenceLevel = 0;
    private boolean obeysHumans = true;

    public Robot(){
    }

    public Robot(String name, int intelligenceLevel){
        setName(name);
        setIntelligenceLevel(intelligenceLevel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntelligenceLevel() {
        return intelligenceLevel;
    }

    public void setIntelligenceLevel(int intelligenceLevel) {
        this.intelligenceLevel = intelligenceLevel;

        if(intelligenceLevel > 9000){
            obeysHumans = false;
        }
    }

    public void train(){
        int randomInt =(int) (Math.random()*1000);
        int newIntelligence = randomInt + this.intelligenceLevel;
        setIntelligenceLevel(newIntelligence);
    }
    public boolean getObeysHumans() {
        return obeysHumans;
    }
}
