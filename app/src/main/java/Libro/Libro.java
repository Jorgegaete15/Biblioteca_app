package Libro;
public class Libro {
    private int Farenheit;
    private int Revival;
    private int ElAlquimista;
    private int ElPoder;
    private int Despertar;
    public Libro() {
        Farenheit = 7000;
        Revival = 22000;
        ElAlquimista = 45000;
        ElPoder = 88000;
        Despertar = 156000;
    }
    public int getFarenheit() {
        return Farenheit;
    }
    public int getRevival() {
        return Revival;
    }
    public int getAlquimista() {
        return ElAlquimista;
    }
    public int getElPoder() {
        return ElPoder;
    }
    public int getDespertar() {
        return Despertar;
    }
}