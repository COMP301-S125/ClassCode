package org.unc.comp301.Decorator.SpiesInDisguise;

public class Perry implements Spy{
    private String disguise = "Just a platypus. They don't do much.";
    private boolean inDiguise = false;
    private String spyDescription = "Perry the platypus!";

    Perry(){
    }



    @Override
    public void putOnDisguise() {
        inDiguise = true;
    }

    @Override
    public void takeOffDisguise() {
        inDiguise = false;
    }

    @Override
    public boolean isInDisguise() {
        return this.inDiguise;
    }

    @Override
    public String getDescription() {
        if(inDiguise){
            return disguise;
        }
        return spyDescription;
    }
}
