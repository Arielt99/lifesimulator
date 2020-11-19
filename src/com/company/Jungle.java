package com.company;

public class Jungle {

    public static int m_iwidth;
    public static int m_iheigt;

    Prey[] m_preyArray;
    Predator[] m_predatorArray;
    Plant[] m_plantArray;
    WaterSpot m_waterSpot;

    public Jungle() {

        m_waterSpot = new WaterSpot(100,1000,100);

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

    public static void main(String[] args) {
        Jungle j = new Jungle();

        while(true){
            j.step();
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
