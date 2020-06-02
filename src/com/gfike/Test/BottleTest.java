package com.gfike.Test;

import com.gfike.Main.Bottle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BottleTest {


    Bottle b = new Bottle();

    @Test
    public void firstVerse (){
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer." +
                        "\nTake one down and pass it around, 98 bottles of beer on the wall."
        , b.verse(99));
    }

    @Test
    public void anotherVerse() {
        assertEquals("89 bottles of beer on the wall, 89 bottles of beer. " +
                        "\nTake one down and pass it around, 88 bottles of beer on the wall."
        , b.verse(89));
    }

    @Test
    public void verse2(){
        assertEquals("2 bottles of beer on the wall, 2 bottles of beer. " +
                        "\nTake one down and pass it around, 1 bottle of beer on the wall."
        , b.verse(2));
    }

    @Test
    public void verse1(){
        assertEquals("Take one down and pass it around, 1 bottle of beer on the wall.\n" +
                        "Take it down and pass it around, no more bottles of beer on the wall."
        , b.verse(1));
    }

    @Test
    public void verse0() {
        assertEquals("No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall."
        , b.verse(0));
    }

    @Test
    public void aCoupleVerses(){
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take one down and pass it around, 98 bottles of beer on the wall." +
                "\n" + "98 bottles of beer on the wall, 98 bottles of beer.\n" +
                "Take one down and pass it around, 97 bottles of beer on the wall."
        , b.verses(99,98));
    }

    @Test
    public void aFewVerses(){
        assertEquals("2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.\n" +
                "\n" + "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take it down and pass it around, no more bottles of beer on the wall.\n" +
                "\n" + "No more bottles of beer on the wall, no more bottles of beer.\n" +
                " Go to the store and buy some more, 99 bottles of beer on the wall."
        , b.verses(2, 0));
    }

//    @Test
//    public void theWholeSong(){
//        assertEquals("");
//    }
}
