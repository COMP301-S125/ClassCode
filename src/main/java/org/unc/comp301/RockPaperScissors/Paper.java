package org.unc.comp301.RockPaperScissors;


public class Paper extends AHand{
    public Paper() {
        super(CHOICE.PAPER,
                "        _______\n" +
                        "  ____(____     \\\n" +
                        " (________       |\n" +
                        "(_________       |\n" +
                        " (________       |\n" +
                        "  (___________  /");
    }

    @Override
    public boolean equals(Object other) {
        return(other instanceof Paper);
    }

    @Override
    public boolean beats(AHand other) {
        return(other instanceof Rock);
    }

}
