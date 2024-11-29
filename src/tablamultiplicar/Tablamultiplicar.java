/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamultiplicar;
import java.util.Scanner;
/**
 *
 * @author DETPC
 */
public class Tablamultiplicar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("--elije la tabla que no te sabes--");
        System.out.println("ingrese el numero " );
        
        int numero=scanner.nextInt();
        for (int i=1; i<=12; i++){
            System.out.println(numero + "*" + i + "=" + (numero * i));
        }
        
        System.out.println("*****Deja de estar viendo tiktok y ponte a estudiar*******");
    }
}    
    
