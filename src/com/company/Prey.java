package com.company;


public class Prey {

    public static final int MAX_WATER_DRUNK = 50;

    static int s_iMaxPreyAge;
    int m_iAgeMax;
    int m_iAge;

    static int s_iMaxPreyLifePoint;
    int m_iLifePointMax;
    int m_iLifePoint;

    static int s_iMaxPreyVigor;
    int m_iVigorMax;
    int m_iVigor;

    static float s_fMaxPreyMovingSpeed;
    float m_fMaxMovingSpeed;
    float m_fMovingSpeed;

    static float s_fPreyAcceleration;

    float m_fOrientation; //Angle varying between 0 and 2Pi

    Vision m_Vision;
    Hearing m_Hearing;
    Coords m_Coords;

    WaterSpot m_waterSpot;

    public Prey(int p_iAgeMax, int p_iAge, int p_iLifePointMax, int p_iLifePoint, int p_iVigorMax, int p_iVigor, float p_fMaxMovingSpeed, float p_fMovingSpeed, float p_fOrientation, Vision p_Vision, Hearing p_Hearing) {
        this.m_iAgeMax = p_iAgeMax;
        this.m_iAge = p_iAge;
        this.m_iLifePointMax = p_iLifePointMax;
        this.m_iLifePoint = p_iLifePoint;
        this.m_iVigorMax = p_iVigorMax;
        this.m_iVigor = p_iVigor;
        this.m_fMaxMovingSpeed = p_fMaxMovingSpeed;
        this.m_fMovingSpeed = p_fMovingSpeed;
        this.m_fOrientation = p_fOrientation;
        this.m_Vision = p_Vision;
        this.m_Hearing = p_Hearing;
    }

    public Prey(WaterSpot p_waterSpot) {
        m_waterSpot = p_waterSpot;
    }

    void draw(){

    }

    void step(){
        drink();
    }

    void pop(){

    }

    void move(){
    }

    void mating(){

    }

    void eat()  {

    }

    void drink(){
        if(Jungle.s_randGenerator.nextInt(100)<20){
            int waterThirst = 1 + Jungle.s_randGenerator.nextInt(MAX_WATER_DRUNK);
            System.out.println("prey want to drink : " + waterThirst);
            int waterAvailable= m_waterSpot.requestDrinkingQuantity(waterThirst);
            System.out.println("prey drunk : " + waterAvailable);
        }
    }

    void rest(){

    }

    void flee()  {

    }



}
