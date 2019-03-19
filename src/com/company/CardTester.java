package com.company;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        Card j = new Card("beeb", "clubs", 3);
        Card e = new Card("beeb", "clubs", 3);

        System.out.println(j.matches(e));
        System.out.println(e.suit());
        System.out.println(e.rank());
        System.out.println(e.pointValue());


    }
}