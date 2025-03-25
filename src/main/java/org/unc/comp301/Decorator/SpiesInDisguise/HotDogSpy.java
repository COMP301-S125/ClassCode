package org.unc.comp301.Decorator.SpiesInDisguise;

public class HotDogSpy implements  Spy{
    private Spy spy;

    HotDogSpy(Spy spy){
        this.spy = spy;
    }

    @Override
    public void putOnDisguise() {
        spy.putOnDisguise();
    }

    @Override
    public void takeOffDisguise() {
        spy.takeOffDisguise();
    }

    @Override
    public boolean isInDisguise() {
        return spy.isInDisguise();
    }

    @Override
    public String getDescription() {
        String retval = spy.getDescription();
        if(spy.isInDisguise()){
            return retval;
        }
        return  retval + " with a hotdog";
    }
}
