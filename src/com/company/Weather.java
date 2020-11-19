package com.company;

public class Weather {
    private final Jungle m_jungle;
    private static final int MAX_QUANTITY_RAIN = 50;
    public Weather(Jungle p_jungle) {
        m_jungle = p_jungle;
    }

    public void step() {
        if(Jungle.s_randGenerator.nextInt(100)<5){
            rain();
        }
    }

    private void rain() {
        int quantity = 5 + Jungle.s_randGenerator.nextInt(MAX_QUANTITY_RAIN);
        System.out.println("It is raining : " + quantity);
        m_jungle.spray(quantity);
    }
}
