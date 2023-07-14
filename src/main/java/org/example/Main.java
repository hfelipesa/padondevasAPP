package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declarando datos de entrada

        Scanner entradad = new Scanner(System.in);

        String ubicacionUsuario;
        String destino;
        String nombreUsurio;
        String telefonoUsuario;

        //declarar un dato especial para capturar informacion desde teclado.
        //Espacio para inicializar las variables.

        System.out.println("\u001B[34m Pa Onde Vas APP \u001B[0m");

        System.out.print("Digite su ubuacion: ");
        ubicacionUsuario= entradad.nextLine();
        System.out.print("Digite su destino: ");
        destino= entradad.nextLine();
        System.out.print("Digite su nombre: ");
        nombreUsurio=entradad.nextLine();
        System.out.print("Digite su telefno: ");
        telefonoUsuario=entradad.nextLine();

        // proceso del problema.



        String distancia="20"; //esto es un texto
        //debo hacer parseo de la variable distancia "Parseo es cambian o modificar el tipo de dato de una variable"
        Integer  costoPorKilometro=6800;
        Integer distanciaEntero=Integer.parseInt(distancia);
        Integer  costoTotal=distanciaEntero*costoPorKilometro;




        //salidas del problema
        System.out.println("\u001B[34m Señor usuario: "+nombreUsurio+ "\u001B[0m");
        System.out.println("\u001B[34m Su costo total es: $ "+costoTotal+ " Pesos\u001B[0m");











    }
}