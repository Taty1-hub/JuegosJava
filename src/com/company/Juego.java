package com.company;

public class Juego {

    public int vidas;
    public int MuestraVidasRestantes;

    public static void main(String[] args) {
        // write your code here
    }


    public Juego(int vidas, int muestraVidasRestantes) {
        this.vidas = vidas;
        MuestraVidasRestantes = muestraVidasRestantes;
    }

    public Juego(int vidas) {
        this.vidas = vidas;
    }
}
