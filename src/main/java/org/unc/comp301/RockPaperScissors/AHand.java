package org.unc.comp301.RockPaperScissors;

public abstract class AHand extends Ascii{
    public enum CHOICE {ROCK, PAPER, SCISSORS}
    private final CHOICE choice;

    public AHand(CHOICE choice, String ascii){
        super(ascii);
        this.choice = choice;
    }

    @Override
    public abstract boolean equals(Object other);

    public abstract boolean beats(AHand other);

    @Override
    public String toString(){
        return this.choice + "\n" + super.toString();
    }

}
