package com.gfike.Main;

public class Bottle {
    public String verse(int i) {
        return String.format("%s bottles of beer on the wall, %s bottles of beer.", i, i) +
        String.format("\nTake one down and pass it around, %s bottles of beer on the wall.", i -1);
    }

    public String verses(int i, int i1) {
        return "";
    }

    public String song() {
        return "";
    }
}
