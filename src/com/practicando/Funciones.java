package com.practicando;

import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {

        //se pide una frase al usuario
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una frase y que esta termine en punto");
        String frase = entrada.nextLine();


        codificador(frase);


    }
    static void codificador(String frase){

        //el parametro frase se convierte a un array (vector) para poder cambiar las vocales a otro caracter
        char[] caracteres = frase.toCharArray();

        //se considera menos una posicion del array por el uso de length
        for(int i=0 ; i<= caracteres.length-1; i++){

            switch (caracteres[i]){
                case 'a':
                    caracteres[i] = '@';
                    break;
                case 'e':
                    caracteres[i] = '#';
                    break;
                case 'i':
                    caracteres[i] = '$';
                    break;
                case 'o':
                    caracteres[i] = '%';
                    break;
                case 'u':
                    caracteres[i] = '*';
                    break;
            }
        }

        //se convierte el array a un nuevo String guardandolo en el parametro frase (con esto se guarda la frase modificada)
        frase = new String(caracteres);
        System.out.println(frase);
    }


}
