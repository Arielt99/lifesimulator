package com.company;

import java.util.Random;

public class Jungle {

    public static Random s_randGenerator = new Random();
    private int m_iwidth;
    private int m_iheigt;

    private Prey[] m_preyArray;
    private Predator[] m_predatorArray;
    private Plant[] m_plantArray;
    private WaterSpot m_waterSpot;

    public Jungle() {

        m_waterSpot = new WaterSpot();

        m_preyArray = new Prey[100];
        for (int i= 0; i<m_preyArray.length; i++){
            m_preyArray[i]= new Prey(m_waterSpot);
        }
        m_predatorArray = new Predator[100];
        for (int i= 0; i<m_predatorArray.length; i++){
            m_predatorArray[i]= new Predator(m_waterSpot);
        }
        m_plantArray = new Plant[50];
        for (int i= 0; i<m_plantArray.length; i++){
            m_plantArray[i]= new Plant();
        }
        m_iwidth = 80;
        m_iheigt = 30;
    }

    void step() {
        for (Predator predator : m_predatorArray){
            predator.step();
        };
        for (Prey prey : m_preyArray){
            prey.step();
        }
        for (Plant plant : m_plantArray){
            plant.step();
        }
        m_waterSpot.step();
    }
    void draw() {
        for (int i = 0; i <m_iheigt; i++) {

            for (int k = 0; k <  m_iwidth; k++) {
                if (i == 0 || i == m_iheigt - 1)
                    System.out.print("_");
                else if (k == 0 || k == m_iwidth - 1)
                    System.out.print("|");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }

    }

    boolean hasLivingCreatures() {
        return true;
    }

    public void spray(int p_iQuantity) {
        m_waterSpot.setQuantity(m_waterSpot.getQuantity() + p_iQuantity);
    }

    public static void main(String[] args) {
        Jungle jungle = new Jungle();
        Weather weather = new Weather(jungle);

        while(jungle.m_waterSpot.getQuantity() != 0){
            weather.step();
            jungle.step();
            //terrain.draw();
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("now it is a desert every one is dead");
    }
}
