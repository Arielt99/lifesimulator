package com.company;

public class Predator {
    static int s_iMaxPredatorAge;
    int m_iAgeMax;
    int m_iAge;

    static int s_iMaxPredatorLifePoint;
    int m_iLifePointMax;
    int m_iLifePoint;

    static int s_iMaxPredatorVigor;
    int m_iVigorMax;
    int m_iVigor;

    static float s_fPredatorSpeedMovingBySmell;
    static float s_fMaxPredatorSpeedMovingByView;
    static float s_fMaxPredatorMovingSpeed;
    float m_fMaxMovingSpeed;
    float m_fMovingSpeed;

    static float s_fPredatorMovingNoise;

    static float s_fPredatorAcceleration;

    float m_fOrientation; //Angle varying between 0 and 2Pi

    public static final int WATER_DRUNK = 7;

    Vision m_Vision;
    Smelling m_Smelling;
    private boolean m_bHunting;
    Coords m_Coords;

    WaterSpot m_waterSpot;

    public Predator(int p_iAgeMax, int p_iAge, int p_iLifePointMax, int p_iLifePoint, int p_iVigorMax, int p_iVigor, float p_fMaxMovingSpeed, float p_fMovingSpeed, float p_fOrientation, Vision p_Vision, Smelling p_Smelling) {
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
        this.m_Smelling = p_Smelling;
    }

    public Predator(WaterSpot p_waterSpot) {
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

    void eat(Prey p_Prey)  {
        m_bHunting = false;
    }

    void drink(){
        int waterAvailable= m_waterSpot.requestDrinkingQuantity(WATER_DRUNK);
    }

    void rest(){

    }

    void spot(Prey p_Prey){
        if(m_Smelling.canSmell(p_Prey, m_Coords)){
            hunt(p_Prey);
        }
    }

    void hunt(Prey p_Prey)  {
        m_bHunting = true;

        if(true){
            eat(p_Prey);
        }
        else{
            m_bHunting = false;
        }
    }

}
