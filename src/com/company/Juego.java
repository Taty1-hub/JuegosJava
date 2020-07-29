package com.company;

public class Juego {

        private int vidas;
        private int vidasIniciadas;
        private static int record;


        public Juego(int vidas) {
            this.vidas = vidas;
            this.vidasIniciadas=vidas;
        }


        public void MuestraVidasRestantes(){
            System.out.println("Númoero de vidas restantes: "+vidas);

        }

        public boolean QuitaVida(){
            this.vidas--;
            if (this.vidas==0){
                System.out.println("Juego terminado");
                return false;
            }else {
                return true;
            }
        }

        public void ReiniciaPartida(){
            this.vidas=this.vidasIniciadas;
        }

        public void ActualizarRecord(){
            if (this.vidas>Juego.record){
                Juego.record=this.vidas;
                System.out.println("Se ha batido el record: "+Juego.record);
            }else if (this.vidas==Juego.record){
                System.out.println("Se ha alcanzado el record");
            }
        }



}
