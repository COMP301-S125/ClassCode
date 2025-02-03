package org.unc.comp301.RockPaperScissors;


public class Rock extends AHand {

    public Rock(){
        super(CHOICE.ROCK,
                " _.-.-.-.\n" +
                        ";_|_|_|_|_\n" +
                        "|_|_|\\__  \\\n" +
                        "|    . '  |\n" +
                        "|   (    /\n" +
                        " \\______/" );
    }

    @Override
    public boolean equals(Object other){
        return(other instanceof Rock);
    }

    public boolean beats(AHand other){
        return (other instanceof Scissors);
    }
}
