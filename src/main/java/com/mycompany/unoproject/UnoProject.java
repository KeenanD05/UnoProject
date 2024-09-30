package com.mycompany.unoproject;

public class UnoProject {
    public static void main(String[] args) {
        // Generate and print 7 Uno cards
        UnoCards[] PlayerHand = UnoCardGenerator.generateHand(7);
        for (UnoCards card : PlayerHand) {
            System.out.println(card.getColour() + " value is " + card.getValue());
        }
    }
}
