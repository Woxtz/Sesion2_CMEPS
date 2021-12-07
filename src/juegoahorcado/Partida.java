/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoahorcado;

/**
 *
 * @author juank
 */
public class Partida {

    private int  contadorFallos, jugadorAdivinador;
   // private boolean finPartida, finJuego;
    private String palabraOculta, palabraAdivinada;

    public Partida() {
     //   this.finJuego = this.finPartida = false;
       
        this.contadorFallos = 0;
        this.jugadorAdivinador = 2;
        this.palabraAdivinada = "";
    }

    public void setPalabraOculta (String palabraOculta){
        this.palabraOculta = palabraOculta;
    }
    public void setPalabraAdivinada (String palabraAdivinada){
        this.palabraAdivinada = palabraAdivinada;
    
    }
   

    public boolean finPartida() {

        if (contadorFallos == 6) {
            //this.contadorPartidas++;
            if (jugadorAdivinador == 1) {
            //    aumentarPuntosJugador(1);
                this.jugadorAdivinador = 2;
            } else {
              //  aumentarPuntosJugador(2);
                this.jugadorAdivinador = 1;
            }
            return true;
        } else if (palabraOculta.equals(palabraAdivinada)) {
            //this.contadorPartidas++;
            return true;
        } else {
            return false;
        }

    }

    

    public boolean LetraAdivinada(String letra) {
        if (palabraOculta.contains(letra)) {
            this.palabraAdivinada += letra;
            return true;
        } else {
            this.contadorFallos++;
            return false;
        }
    }

    public int getJugadorAdivinador() {
        return jugadorAdivinador;
    }
   
    public int getFallos(){
        return contadorFallos;
        
    }
    
    public String getPalabraOculta(){
        return palabraOculta;
    }
   
}
