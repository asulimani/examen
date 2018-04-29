/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exacprac2;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author PracticaEvaluada2
 */
public class AmandineSulimani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       JOptionPane.showMessageDialog(null,"Programa que calcula el salario de un empleado");
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion = sn.nextInt(); 
        String empleado;
        int  horast,shora=0,n=0,salariobruto=0;
        double salariorenta=0,renta=0.10;
       
       
       while(!salir){
            
           System.out.println("1. Registro de cada empleado.");          
           System.out.println("2. Registro del salaraio de cada empleado.");      
           System.out.println("3. Salir");
           
           System.out.println("Escribe la opción que deseas realizar");
        if(opcion==1){        
              
        empleado = JOptionPane.showInputDialog("Empleado:");
        horast = Integer.parseInt(JOptionPane.showInputDialog("Horas Trabajadas:"));
        
        if(n==1){
            salariobruto=shora*horast;
        }
        if(n==2){
            salariobruto=shora*horast;
        }
        if(n==3){
            salariobruto=shora*horast;
        }
         
        }else{
        
        if (opcion==2){
            
           
        empleado = JOptionPane.showInputDialog("Empleado:");
        horast = Integer.parseInt(JOptionPane.showInputDialog("Horas Trabajadas:"));
        
        if(n==1){
            salariobruto=shora*horast;
        }
        if(n==2){
            salariobruto=shora*horast;
        }
        if(n==3){
            salariobruto=shora*horast;    
        salariobruto=(shora*horast );
        salariorenta=salariobruto*renta;
        String imprimir="";
        imprimir=imprimir+("Empleado:"+empleado+"\n");
        imprimir=imprimir+("Numero de Empleado:"+n+"\n");
        imprimir=imprimir+("Horas Trabajadas:"+horast+"\n");
	imprimir=imprimir+("Salario por Hora:"+shora+"\n");
        imprimir=imprimir+("Salario bruto:"+salariobruto+"\n");
        imprimir=imprimir+("Salario con el 10% de la renta aplicada:"+salariorenta+"\n");
        }
        
       }else{
            
            if(opcion==3){
                 System.exit(0);
            }
        }
           
        } 
    }
  }
}
  
