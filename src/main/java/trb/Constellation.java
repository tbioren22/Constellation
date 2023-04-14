package trb;

import java.util.ArrayList;

public class Constellation {
    private ArrayList<Star> stars;

    public Constellation() {
        stars = new ArrayList<Star>();
    }

    public ArrayList<Star> getStars() {
        return stars;
    }

    public void addStar(Star star) {
        stars.add(star);
    }
}
