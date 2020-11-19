package com.company;

 public class WaterSpot {

     private Coords m_Coords;

     private float m_fArea;

     public void setQuantity(int p_iQuantity) {
         m_iQuantity = p_iQuantity;
     }

     public int getQuantity() {
         return m_iQuantity;
     }

     private int m_iQuantity;
    private float m_fEvaporationSpeed;

     WaterSpot() {
         m_iQuantity = 500;
         m_Coords = new Coords();
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
