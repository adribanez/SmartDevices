package Clases;

public class SmartDevices {

    // 1. atributos

    protected String fabricante;

    protected String modelo;

    protected int year;

    protected String color;

    protected String sistemaOperativo;

    protected int capacidad;

    protected double pulgadas;

    // 2. contructores

    public SmartDevices(){

    }

    public SmartDevices(String fabricante, String modelo, int year, String color, String sistemaOperativo, int capacidad, double pulgadas){

        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
        this.sistemaOperativo = sistemaOperativo;
        this.capacidad = capacidad;
        this.pulgadas = pulgadas;

    }



}
