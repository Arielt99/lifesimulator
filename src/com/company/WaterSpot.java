package com.company;

 public class WaterSpot {
    private float m_fArea;
    private int m_iQuantity;
    private float m_fEvaporationSpeed;

     public WaterSpot(float p_fArea, int p_iQuantity, float p_fEvaporationSpeed) {
         this.m_fArea = p_fArea;
         this.m_iQuantity = p_iQuantity;
         this.m_fEvaporationSpeed = p_fEvaporationSpeed;
     }

     void draw(){

     }

     void step(){
         System.out.println("water quantity"+m_iQuantity);
     }

     public int requestDrinkingQuantity(int waterDrunk) {
         if(m_iQuantity == 0){
             return 0;
         }
         int tmp = m_iQuantity;
         if(tmp>waterDrunk){
             tmp=waterDrunk;
             m_iQuantity -= tmp;
         }
         else{
             m_iQuantity = 0;
         }
         return tmp;
     }
 }
