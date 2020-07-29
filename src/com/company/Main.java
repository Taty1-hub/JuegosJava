package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Juego juego1=new Juego(5);
        Juego juego2=new Juego(5);
        juego1.QuitaVida();
        juego1.MuestraVidasRestantes();
        juego1.ReiniciaPartida();
        juego1.MuestraVidasRestantes();
        juego1.ActualizarRecord();
        juego2.ActualizarRecord();

    }
}
