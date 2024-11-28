/* Hacer un programa el cual reciba como input segundos 
y que luego convierta esos segundos a horas y minutos
    Input: 3600
    Output: 1 hora, 0 minutos, 0 segundos */

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {

        Scanner clock = new Scanner(System.in);

        int segundos, horas, minutos, otroSeg;

        System.out.print("Digite los segundos que desee convertir a horas y minutos: ");
        segundos = clock.nextInt();

        // 1h --> 3600seg
        horas = segundos / 3600;
        // 1min --> 60 seg
        minutos = (segundos % 3600)/60;
        // Segundos restantes
        otroSeg = segundos % 60;

        System.out.println(horas + " hora(s) " + minutos + " minuto(s) " + otroSeg + " segundo(s)");

    }
    
}
