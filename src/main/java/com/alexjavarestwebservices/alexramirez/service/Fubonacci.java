package com.alexjavarestwebservices.alexramirez.service;

public class Fubonacci {

    public String fubo(int n){
        int serie = n, num1 = 0, num2 = 1, suma = 1;
        String strfubo="";
        String openli="<li>";
        String closeli="</li>";
        // Muestro el valor inicial
        System.out.println(num1);

        for (int i = 1; i < serie; i++) {

            // muestro la suma
            System.out.println(suma);
            strfubo=openli+strfubo+closeli+openli+String.valueOf(suma)+closeli;
            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
        }
        String finalfubo ="<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h2>Funonacci Unordered HTML List ALEX RAMIREZ</h2>\n" +
                "\n" +
                "<ul>\n" +strfubo+
                "</ul>  \n" +
                "\n" +
                "</body>\n" +
                "</html>";
        return finalfubo;
    }
}
