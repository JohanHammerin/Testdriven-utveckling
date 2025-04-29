package se.johan.lektion3.uppgift;

import java.util.Random;

public class RandomCompliments {

    public String[] compliments = {
            "Du är fin",
            "Du kan gå bra",
            "Du är cool",
            "Du cyklar bra",
            "Du springer bra"
    };
    private final Random randomNumber = new Random();


    public String[] getCompliments() {
        return new String[]{compliments[randomNumber.nextInt(compliments.length)]};
    }

    public void setCompliments(String[] compliments) {
        this.compliments = compliments;
    }
}
