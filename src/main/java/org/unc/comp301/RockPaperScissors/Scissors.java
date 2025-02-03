package org.unc.comp301.RockPaperScissors;


public class Scissors extends AHand {
    public Scissors() {
        super(CHOICE.SCISSORS,
                "    .-.\n" +
                        "    | |    / )\n" +
                        "    | |   / /\n" +
                        "    | |  / /\n" +
                        " _.-| |_/ /\n" +
                        "; \\( \\   /\n" +
                        "|\\_)\\ \\  |\n" +
                        "|    ) \\ |\n" +
                        "|   (    /\n" +
                        " \\______/");
    }

    @Override
    public boolean equals(Object other) {
        return(other instanceof Scissors);
    }

    @Override
    public boolean beats(AHand other) {
        return(other instanceof Paper);
    }

}
