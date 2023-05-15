package com.practicando;


import java.util.Scanner;


public class Funciones {
    public static void main(String[] args) {

        //se pide una frase al usuario
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una frase y que esta termine en punto");
        String frase = entrada.nextLine();


        while (!verificarPunto(frase)) {

            System.out.println("por favor termine la frase con un punto");
            frase = entrada.nextLine();
            verificarPunto(frase);

        }
        codificador(frase);


    }


    static void codificador(String frase) {

        //la frase se converte a minusculas
        String fraseMinusculas = frase.toLowerCase();


        //el parametro frase se convierte a un array (vector) para poder cambiar las vocales a otro caracter
        char[] caracteres = fraseMinusculas.toCharArray();

        //se considera menos una posicion del array por el uso de length
        for (int i = 0; i <= caracteres.length - 1; i++) {

            switch (caracteres[i]) {
                case 'a' -> caracteres[i] = '@';
                case 'e' -> caracteres[i] = '#';
                case 'i' -> caracteres[i] = '$';
                case 'o' -> caracteres[i] = '%';
                case 'u' -> caracteres[i] = '*';
            }
        }

        //se convierte el array a un nuevo String guardandolo en el parametro frase (con esto se guarda la frase modificada)
        frase = new String(caracteres);
        System.out.println(frase);
    }

    //la funcion ayudara a verificar si la frase ingresada por el usuario termina en punto
    static boolean verificarPunto(String frase) {
        //se guarda el último caracter en una variable (ultimoCaracter)

        char ultimoCaracter = frase.charAt(frase.length() - 1);
        //[f][r][a][s][e][ ][e][j][e][m][p ][l ][o ]
        //[0][1][2][3][4][5][6][7][8][9][10][11][12] = length(empienza desde cero, es por eso que se le resta 1) = 13-1 = 12
        // entonces frase.charAt valdria 12
        return ultimoCaracter == '.';

    }


}
