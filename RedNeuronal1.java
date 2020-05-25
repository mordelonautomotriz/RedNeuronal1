/*
implemente un algoritmo que le permita 
1. desplegar el nombre de su proyecto de  paper
2. que es una red neorunal
3. cuales son los elementos que conforman una red neuronal
4. como utilizaron la red neuronal en el proyecto que usted ah seleccionado
5. como utilizaria usted la red neuronal como mejoramiento del proyecto propuesto
6. en que consistio el entrenamiento utilizando la red neuronal, e indique 
el algoritmo utilizado
 */
package redneuronal1;

import java.util.Scanner;

/**
 *
 * @author HECTOR ORTIZ
 */
public class RedNeuronal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
  Scanner objeto=new Scanner(System.in);//new reserva espacio de memoria
      
       System.out.println("\tUniversidad De Las Fuerzas Armadas ESPE - Extension Latacunga \n");
   
        System.out.println("Nombre: Hector Ortiz");
        
        System.out.println("\nDepartamento: Energia y Mecanica");
        
        System.out.println("Carrera: Ingeniera Automotriz");
        
        System.out.println("Docente: Ing. Luis Guerra ");
        
        System.out.println("Asignatura: Programacion ");
        
        System.out.println("Nivel: 4to nivel 'B' ");
        
        System.out.println("ID: L00280605 \n");
        
        System.out.println("\tIngrese el Nombre de su Respectivo Paper \n");
        String nombrepaper=objeto.nextLine();
        
        System.out.println("\tQue es una Red Neuronal?\n");
        String conceptoredneuronal=objeto.nextLine();
        
        System.out.println("\tCuales son los Elementos que Conforman una Red Neuronal?\n");
        String elementosredneuronal=objeto.nextLine();
        
        System.out.println("\tComo Utilizaron la Red Neuronal en el Proyecto que Usted ah Seleccionado?\n");
        String utilizacionredneuronal=objeto.nextLine();
        
        System.out.println("\tComo Utilizaria usted la Red Neuronal como Mejoramiento del Proyecto Propuesto?\n");
        String mejoramientoredneuronal=objeto.nextLine();
        
        System.out.println("\tEn que consistio el Entrenamiento utilizando la Red Neuronal, e indique el Algoritmo utilizado\n");
        String algoritmoredneuronal=objeto.nextLine();
        
        
    }
    
}
