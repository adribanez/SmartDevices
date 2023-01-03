package Clases;

public class Smartphone extends SmartDevices {

    // 1. atributos

     String conectividad;
     double camara;

     //  2. constructor

     public Smartphone(){}



    public Smartphone(String fabricante, String modelo, int year, String color, String sistemaOperativo, int capacidad, double pulgadas, String conectividad, double camara){

         this.conectividad = conectividad;
         this.camara = camara;



    }


}
