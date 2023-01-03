package Clases;

public class Main {
    public static void main(String[] args) {


        SmartDevices kindle = new SmartDevices("Amazon","Signature",2022,"Negro", "Linux",16,6.8 );

        System.out.println("Kindle");

        System.out.println(kindle.fabricante);
        System.out.println(kindle.modelo);
        System.out.println(kindle.year);
        System.out.println(kindle.color);
        System.out.println(kindle.sistemaOperativo);
        System.out.println(kindle.capacidad);
        System.out.println(kindle.pulgadas);

        System.out.println("FIN ATRIBUTOS KINDDLE");

        //2. herencia iphone

        System.out.println("Smartphone");

        Smartphone iphone = new Smartphone();
        iphone.fabricante = "apple";
        System.out.println(iphone.fabricante);
        iphone.modelo = "14Pro";
        System.out.println(iphone.modelo);
        iphone.year = 2022;
        System.out.println(iphone.year);
        iphone.color = "negro";
        System.out.println(iphone.color);
        iphone.sistemaOperativo = "Ios";
        System.out.println(iphone.sistemaOperativo);
        iphone.capacidad = 256;
        System.out.println(iphone.capacidad);
        iphone.pulgadas = 6.06;
        System.out.println(iphone.pulgadas);
        iphone.conectividad = "5G";
        System.out.println(iphone.conectividad);
        iphone.camara = 48;
        System.out.println(iphone.camara);

        System.out.println("FIN ATRIBUTOS IPHONE 14 PRO");

        // 2.1 herencia smartwatch

        System.out.println("Smartwatch");

        SmartWatch AppleWatch = new SmartWatch();
        AppleWatch.fabricante = "apple";
        System.out.println(AppleWatch.fabricante);
        AppleWatch.modelo = "Serie8";
        System.out.println(AppleWatch.modelo);
        AppleWatch.year = 2022;
        System.out.println(AppleWatch.year);
        AppleWatch.color = "blanco";
        System.out.println(AppleWatch.color);
        AppleWatch.sistemaOperativo = "Ios";
        System.out.println(AppleWatch.sistemaOperativo);
        AppleWatch.capacidad = 32;
        System.out.println(AppleWatch.capacidad);
        AppleWatch.pulgadas = 1.5;
        System.out.println(AppleWatch.pulgadas);
        AppleWatch.oled = true;
        System.out.println(AppleWatch.oled);

        System.out.println("FIN ATRIBUTOS APPLEWATCH");



    }




}
