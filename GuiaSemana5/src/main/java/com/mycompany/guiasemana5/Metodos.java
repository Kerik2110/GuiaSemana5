package com.mycompany.guiasemana5;

import java.util.Scanner;

public class Metodos {

    public static int contar(int num) {
        int resultado;
        if (num < 10) {
            resultado = 1;
        } else {
            resultado = 1 + contar(num / 10);
        }
        return resultado;
    }

    public static int sumar(int num) {
        int resultado;
        if (num < 10) {
            resultado = num;
        } else {
            resultado = num % 10 + sumar(num / 10);
        }
        return resultado;
    }

    public static int mcd(int num1, int num2) {
        int resultado;
        if (num2 == 0) {
            resultado = num1;
        } else {
            resultado = mcd(num2, num1 % num2);
        }
        return resultado;
    }

    public static String invertirCadena(String cadena) {
        if (cadena.length() < 2) {
            return cadena;
        } else {
            // Se toma el ultimo caracter de la cadena y se concatena con la cadena invertida de los caracteres restantes
            return cadena.charAt(cadena.length() - 1) + invertirCadena(cadena.substring(0, cadena.length() - 1));
        }
    }
}
