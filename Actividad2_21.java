
package com.mycompany.actividad2_21;

import java.util.Scanner;

public class Actividad2_21 {

    public static void main(String[] args) {
        Scanner leerporteclado = new Scanner(System.in);
        
        double la, lb, lc, perimetro, sperimetro, area;

        System.out.print("Introduce el valor del lado a: ");
        la = leerporteclado.nextDouble();
        
        System.out.print("Introduce el valor del lado b: ");
        lb = leerporteclado.nextDouble();
        
        
        System.out.print("Introduce el valor del lado c: ");
        
        lc = leerporteclado.nextDouble();

        perimetro = la + lb + lc;
        
        sperimetro = perimetro / 2;
        
        //se usa la fórmula de Herón para encontar el area
        area = Math.sqrt(sperimetro * (sperimetro - la) * (sperimetro - lb) * (sperimetro - lc));
        
        System.out.println("El perímetro del triángulo es: " + perimetro);
        System.out.println("El semiperimetro del triángulo es: " + sperimetro);
        System.out.println("El area del triangulo es: " + area + " unidades cuadradas");
    }
}
