package cata1;
import java.util.Scanner;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String entradaUsu, dadaMaquina;
        Scanner lector = new Scanner(System.in);
        List<String> opcions = List.of("piedra","papel","tijera");
        Random indexAleatori = new Random();


        //Pedir entrada al usuario que sea piedra, papel o tijera
        System.out.println("entra Piedra, Papel o Tijera");
        entradaUsu = lector.nextLine();
        dadaMaquina = opcions.get(indexAleatori.nextInt(3));

        //comprovar si coincideix amb el index aleatori que escdull la consola
        System.out.println("entradaUsu "+entradaUsu+" vs entradaMaquina "+dadaMaquina);

        //Comparació
        entradaUsu=entradaUsu.toLowerCase();
        switch(entradaUsu){
            case "piedra":
                switch(dadaMaquina){
                    case "piedra":
                        System.out.println("Empate");
                        break;
                    case "papel":
                        System.out.println("Has perdido");
                        break;
                    case "tijera":
                        System.out.println("Has ganado");
                        break;
                }
                break;
            case "papel":
                switch(dadaMaquina){
                    case "piedra":
                        System.out.println("Has ganado");
                        break;
                    case "papel":
                        System.out.println("Empate");
                        break;
                    case "tijera":
                        System.out.println("Has perdido");
                        break;
                }
                break;
            case "tijera":
                switch(dadaMaquina){
                    case "piedra":
                        System.out.println("Has perdido");
                        break;
                    case "papel":
                        System.out.println("Has ganado");
                        break;
                    case "tijera":
                        System.out.println("Empate");
                        break;
                }
                break;
            default:
                System.out.println("entra un valor valid");
        }

    }
}
