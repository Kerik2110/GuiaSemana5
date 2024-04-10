package com.mycompany.guiasemana5;

import java.util.Scanner;

public class GuiaSemana5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int menu = 0;
        while (menu == 0) {
            System.out.println("Bienvenido a su programa");
            System.out.println("1- Contar digitos");
            System.out.println("2- Suma de digitos");
            System.out.println("3- Maximo comun divisor");
            System.out.println("4- Invertir cadena");
            System.out.println("5- Salir");

            while (!leer.hasNextInt()) {
                System.out.println("Ingrese un valor numerico: ");
                leer.next();
            }

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    int numero;
                    do {
                        System.out.println("Ingrese un numero entero positivo: ");
                        while (!leer.hasNextInt()) {
                            System.out.println("Error. Debe ingresar un numero entero positivo:");
                            leer.next();
                        }
                        numero = leer.nextInt();
                    } while (numero <= 0);
                    
                    int mostrarContar = Metodos.contar(numero);
                    System.out.println("Numeros contados: " + mostrarContar);
                    break;
                case 2:
                    int numero2;
                    do {
                        System.out.println("Ingrese un numero entero positivo: ");
                        while (!leer.hasNextInt()) {
                            System.out.println("Error. Debe ingresar un numero entero positivo:");
                            leer.next();
                        }
                        numero2 = leer.nextInt();
                    } while (numero2 <= 0);

                    int mostrarSuma = Metodos.sumar(numero2);
                    System.out.println("Suma de los digitos del numero: " + mostrarSuma);
                    break;
                case 3:
                    int numero1de3;
                    int numero2de3;
                    do {
                        System.out.println("Ingrese el 1er numero entero positivo: ");
                        while (!leer.hasNextInt()) {
                            System.out.println("Error. Debe ingresar un numero entero positivo:");
                            leer.next();
                        }
                        numero1de3 = leer.nextInt();
                    } while (numero1de3 <= 0);
                    do {
                        System.out.println("Ingrese el 2do numero entero positivo: ");
                        while (!leer.hasNextInt()) {
                            System.out.println("Error. Debe ingresar un numero entero positivo:");
                            leer.next();
                        }
                        numero2de3 = leer.nextInt();
                    } while (numero2de3 <= 0);

                    int mostrarMCD = Metodos.mcd(numero1de3, numero2de3);
                    System.out.println("El MCD de " + numero1de3 + " y " + numero2de3 + " es: " + mostrarMCD);
                    break;
                case 4:
                    System.out.print("Ingresa una palabra: ");
                    Scanner leerString = new Scanner(System.in);
                    String cadena = leerString.nextLine();
                    String cadenaInvertida = Metodos.invertirCadena(cadena);
                    System.out.println("Palabra invertida: " + cadenaInvertida);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el programa");
                    menu = 1;
                    break;
                default:
                    System.out.println("Error. Ingrese una opcion valida.");
            }
        }
    }
}
