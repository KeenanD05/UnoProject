package com.mycompany.unoproject;

import java.util.Random;

public class UnoCardGenerator {
    // Generate a hand of Uno cards using enum values
    public static UnoCards[] generateHand(int numCards) {
        UnoCards[] PlayerHand = new UnoCards[numCards];
        Random random = new Random();
        
        for (int i = 0; i < PlayerHand.length; i++) {
            int numValues = UnoCards.Value.values().length;
            UnoCards.Value value = UnoCards.Value.values()[random.nextInt(numValues)];
            int numColours = UnoCards.Colour.values().length;
            UnoCards.Colour colour = UnoCards.Colour.values()[random.nextInt(numColours)];
            UnoCards card = new UnoCards(value, colour);
            PlayerHand[i] = card;
        }
        
        return PlayerHand;
    }
}
