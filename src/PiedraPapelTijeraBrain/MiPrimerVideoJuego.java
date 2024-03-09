/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package PiedraPapelTijeraBrain;
/**
 * 
 */
import java.util.Scanner;
/**
 *Esta clase nos muestra el juego de piedra, papel o tijera.
 * @author Daniel Lanza Peña.
 * @since 04/03/2024.
 * 
 */
public class MiPrimerVideoJuego {
    /**
     * Este es el constructor de la clase PiedraPapelTijeraBrain.
     */
    public MiPrimerVideoJuego() {
    }
    /**
    * Metodo principal en el que pedimos a los jugadores introducir sus elecciones y comparamos posteriormente sacando el ganador.
    * @param args.
    */
    public static void main(String[] args) {
         /**
         * Inicializamos a cero la variable que contabiliza las victorias del jugador humano.
         */
        int chiquipuntos = 0;//numero de victorias en tiradas del jugador humano.
        /**
        * Inicializamos variables tipo cadena opcionJugador y opcionBot con las elecciones de jugador y máquina en blanco ambas.
        * constructor de entrada por teclado.
        * @param sc.
        */
        Scanner sc = new Scanner(System.in);
        String opcionJugador = "";
        String opcionBot = "";
        int exitoEnProposito = 1;
        /**
        * Inicializamos la variable con el tiempo de inicio del juego.
        */
        long inicio = System.currentTimeMillis();
         /**
         * Bucle for para repetir hasta llegar a cinco (vence el que es mejor de cinco tiradas, el que gana 3).
         * @param i.
         */
        for (int i = 0; i < 5; i++) {
        /**
         * generamos un proposito aleatorio; ganar o perder la tirada.
         * @param proposito.
         */
            int proposito = (int) Math.floor(Math.random() * 2 + 1);
            /**
             *  aqui vemos la doble eleccion del propósito, ganar o perder, segun la variable del mismo nombre; proposito.
             */
            if (proposito == 1) {
                    System.out.println("\n\tIntenta ganar");
                } // Fin de if
                if (proposito == 2) {
                    System.out.println("\n\tIntenta perder");
                } //Fin de if
                /**
                * Generación aleatoria del ordenador de uno de los tres valores posibles; piedra, papel o tijera.
                * @return j.
                */
                int j = (int) Math.floor(Math.random() * 3 + 1);
                /**
                * Leemos la variable generada aleatoriamente para la maquina, mostrando ademas su simbolo correspondiente
                */
                if (j == 1) {
                    opcionBot = "tijera";
                    System.out.println(opcionBot);
                    tijera();
                }// Fin de if
 
                if (j == 2) {
                    opcionBot = "papel";
                    System.out.println(opcionBot);
                    papel();
                }//fin de if
 
                if (j == 3) {
                    opcionBot = "piedra";
                    System.out.println(opcionBot);
                    piedra();
                }//fin de if
                /**
                 * 
                 * Cuando el jugador humano introduce su jugada repetido con un bucle do while mientras se mantenga el empate entre ambos
                 * @return opcionJugador
                 */
                do {
                    System.out.println("Introduce tu jugada");
                    opcionJugador = sc.nextLine();
                   /**                
                    * Imprime por pantalla un mensaje en caso de empate y regresa al bucle do while
                    */
                    if (opcionBot.equals(opcionJugador)) {
                        System.out.println("No tiene sentido que intentes empatar");
                    }// fin de if
                } while (opcionBot == opcionJugador);//fin de do while
            /**
            * Establecemos la comparativa entre los resultados del jugador humano y la máquina con el resultado en la variable exitoEnProposito
            * @return exitoEnProposito
            */
 
            if (opcionJugador.equals("tijera") && (opcionBot.equals("papel"))) {
                exitoEnProposito = 1;
            }// fin de if
 
            if (opcionJugador.equals("papel") && (opcionBot.equals("tijera"))) {
                exitoEnProposito = -1;
            }// fin de if
 
            if (opcionJugador.equals("tijera") && (opcionBot.equals("piedra"))) {
                exitoEnProposito = -1;
            }// fin de if
 
            if (opcionJugador.equals("piedra") && (opcionBot.equals("tijera"))) {
                exitoEnProposito = 1;
            }// fin de if
 
            if (opcionJugador.equals("piedra") && (opcionBot.equals("papel"))) {
                exitoEnProposito = -1;
            }// fin de if
 
            if (opcionJugador.equals("papel") && (opcionBot.equals("piedra"))) {
                exitoEnProposito = 1;
            }// fin de if
            /**
             * 
             */ 
            
            if (proposito == 2) {
                exitoEnProposito *= -1;
            }// fin de if 
 
            if (exitoEnProposito == 1) {
                chiquipuntos++;
            }// fin de if
        }// fin de for
    /**
    * Cálculo del tiempo de realizacion del juego que es igual al tiempo final menos el tiempo inicial entre 1000.
    *
    */
    long fin = System.currentTimeMillis();
    double tiempo = (double) ((fin - inicio) / 1000);
    /**
    * El tiempo final de realización se consigue sumando las penalizaciones por derrotas al tiempo de realización.
    * @return tiempo.
    */
    System.out.println("Has realizado el ejercicio en " + tiempo + " segundos");
    /**
    * Ahora les sumamos el numero de tiradas perdidas al tiempo de realización, dándonos como resultado el tiempo total.
    * @return nFallos, tiempoFinal.
    */
    int nFallos = 5 - chiquipuntos;
    System.out.println("Penalización: " + nFallos + " x 5s = " + nFallos * 5);
    double tiempoFinal = tiempo + nFallos * 5;
    System.out.println("Tu tiempo final es de " + tiempoFinal + " segundos");
   }
    /**
    * Método para visulizar el simbolo de tijera.
    * 
    */
    public static void tijera() {
        System.out.println("'''\n"
        + "       _______\n"
        + "   ---'   ____)____\n"
        + "           ________)\n"
        + "         ___________)\n"
        + "         (____)\n"
        + "   ---.__(___)\n"
        + "'''");
    }// fin del metodo
    /**
    * Método para visualizar el simbolo de papel.
    * 
    */
    public static void papel() {
        System.out.println("'''\n"
        + "    _______\n"
        + "---'   ____)______\n"
        + "        __________)\n"
        + "            _______)\n"
        + "          _______)\n"
        + "---.__________)\n");
    }// fin del metodo
 /**
  * Método para visualizar el simbolo de piedra.
  * 
  */
    public static void piedra() {
        System.out.println("'''\n"
        + "    _______\n"
        + "---'   ____)\n"
        + "        (_____)\n"
        + "        (_____)\n"
        + "        (____)\n"
        + "---.____(___)\n"
        + "'''\n");
    }// fin del metodo
}// fin de la clase, fin del programa   

