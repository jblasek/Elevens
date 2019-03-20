package com.company;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String sui[] = {"ee", "eeee"};
        String ran[] = {"2", "3", "6"};
        int pVal[] = {1, 2, 3};
        Deck cholonk = new Deck(ran, sui, pVal);
        System.out.println(cholonk.toString());
    }
}