package com.mycompany.unoproject;

public class UnoCards {
    public enum Colour {RED, YELLOW, GREEN, BLUE}
    public enum Value {
        ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
        SKIP, REVERSE, DRAW_TWO, WILD, WILD_DRAW_FOUR
    }
    
    private Value value;
    private Colour colour;
    
    public UnoCards(Value v, Colour c) {
        value = v;
        colour = c;
    }
    
    public Value getValue() {
        return value;
    }
    
    public void setValue(Value value) {
        this.value = value;
    }
    
    public Colour getColour() {
        return colour;
    }
    
    public void setColour(Colour colour) {
        this.colour = colour;
    }
}
