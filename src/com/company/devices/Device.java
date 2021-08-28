package com.company.devices;
import com.company.Human;

public abstract class Device implements salleable {

     String producer;
     String model;
     int yearOfProduction;
     Double value1;

        public void sell(Human seller, Human buyer, Double price)
        {
            if (seller.phone != null)
            {
                if (buyer.cash >= price)
                {
                    seller.cash += price;
                    buyer.cash -= price;

                    buyer.phone = seller.phone;
                    seller.phone = null;

                    System.out.println("Telefon został sprzedany za: " + price + "pieniędzy");
                }
            }
        }



    public String toString(){

            return "producer "+producer+"model"+model+"yearOfproduction"+yearOfProduction;
    }

    abstract void TurnOn();






}
