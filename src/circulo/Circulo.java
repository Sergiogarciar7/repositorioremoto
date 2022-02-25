/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;
import java.util.Scanner;

/**
 *
 * @author monse
 */
public class Circulo {

    final static double PI=3.14165;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s=new Scanner(System.in);
        System.out.println("Introduce el radio:");
        double r=s.nextDouble();
        CalculaArea(r);
        
    }
    public static void CalculaArea(double r) {
        double area=(PI*r*r);
	System.out.printf("El valor del área es %f\n",area);
    }
   public static void longitud(double r) {
        double area=(PI*r*r);
	System.out.printf("El valor del área es %f\n",area);
    }
    public static void velocidad (double r) {
        double area=(PI*r*r);
	System.out.printf("El valor del área es %f\n",area);
    }
	public static void calcularDiametro (double r)
	{
	double diametro=2*r;
	System.out.printf("El valor del diametro es %f\n",diametro);
		
	}
}
