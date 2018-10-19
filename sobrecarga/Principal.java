/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();
        Double []sueldos=new Double[4];
        
        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();
        
        if(numero_nombres==1){
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        }else{
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);
        
        }
        
        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);
        System.out.println("Ingrese el sueldo del trabajador");
        double s1 =scanner.nextDouble();
        double s2 =scanner.nextDouble();
        double s3 =scanner.nextDouble();
        double s4 =scanner.nextDouble();
        t.agregar_sueldo(s1,s2,s3,s4);
        System.out.println("Inicio de arreglo");
        for (int i = 0; i < sueldos.length; i++) {
            sueldos[i]=scanner.nextDouble();
        }
        t.agregar_sueldo(sueldos);

        
        System.out.printf("Los datos del trabajador son: %s\n", t.presentar_datos());
        
                
    }
}
