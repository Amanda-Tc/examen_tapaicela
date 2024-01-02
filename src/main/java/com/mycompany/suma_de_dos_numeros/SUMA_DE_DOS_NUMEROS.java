/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.suma_de_dos_numeros;
import java.util.Scanner;//Importacion de la libreria Scanner
/**
 *
 * @author Usuario APC
 */
public class SUMA_DE_DOS_NUMEROS {

    public static void main(String[] args) {
        //Suma de dos numeros
        int n1;//definido una variable de tipo entero n1
        int n2;//definido una variable de tipo entero n2
        int r;//definido una variable de tipo entero r
        
        n1=2;//asignar valor estatico variable n1
        n2=4;//asignar valor estatico variable n2
        //procesamiento de datos
        r=n1+n2;//operacion matematica de suma
               
        //SALIDA DE DATOS
        System.out.print("este es el resultado de 2 + 4 es");
        System.out.print(r);//mostrar en pantalla el resultado
        
        
        //*******************************************************
        //definir variables de tipo entero
        int s1;
        int s2;
        int st;
        System.out.print("INGRESE UN VALOR");
        Scanner scanner =new Scanner(System.in);//uso del objeto scanner para capturar datos 
        s1=scanner.nexInt();//Asignacion de valores s1
        System.out.print("INGRESE OTRO VALOR");
        Scanner scanner1=new Scanner (System.in);
        s2=scanner1.nextInt();
        //opercion matematica
        System.out.print("SU RESPUESTA ES);
       
        st=s1+s2;
        //mostrar el resultado
        System.out.println(st);
        
        //*******************************************************
        
        int m1,m2,mt;//creacion de variables tipo entero
        
        Scanner ingresar = new Scanner(System.in);
               System.out.print("INGRESE NUMERO 1");
                m1=ingresar.nextInt();
                
                System.out.print("INGRESE NUMERO 2");
                m2=ingresar.nextInt();
                
               System.out.print("EL RESULTADO ES"); 
                mt=m1+m2;
                
                System.out.println(mt);
                
                
        
    }
}
