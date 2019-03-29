package userInterface;
import Model.*;
import java.util.Scanner;
public class Main{
//atributos
private static Comerciante juan;
//constructor
public Main(){
juan = new Comerciante("Juan"); 	
}
public static void main (String[] args){
	Main main= new Main();
	Scanner scn = new Scanner(System.in);
	int option;
	System.out.println("Ingrese las dimensiones de la caja 1 de la siguiente manera ancho, largo, alto\n");
		String say[] = scn.nextLine().split(",");
		double ancho = Double.parseDouble(say[0]);
		double largo = Double.parseDouble(say[1]);
		double alto = Double.parseDouble(say[2]);
		juan.addCaja("1", ancho, largo, alto);
	System.out.println("Ingrese las dimensiones de la caja 2 de la siguiente manera ancho, largo, alto\n");
		String say2[] = scn.nextLine().split(",");
		double ancho2 = Double.parseDouble(say2[0]);
		double largo2 = Double.parseDouble(say2[1]);
		double alto2 = Double.parseDouble(say2[2]);
		juan.addCaja("2", ancho2, largo2, alto2);
	System.out.println("Ingrese las dimensiones de la caja 3 de la siguiente manera ancho, largo, alto\n");
		String say3[] = scn.nextLine().split(",");
		double ancho3 = Double.parseDouble(say3[0]);
		double largo3 = Double.parseDouble(say3[1]);
		double alto3 = Double.parseDouble(say3[2]);
		juan.addCaja("3", ancho3, largo3, alto3);
do{
		Scanner scn1 = new Scanner(System.in);
		System.out.println("Menu\n");
		System.out.println("1.- Consultar volumen de un contenedor predeterminado\n");
		System.out.println("2.- Consultar promedio\n");
		System.out.println("3.- Salir\n");
		option = 0;
		option = scn1.nextInt();
		if(option==1){
			Scanner scn2 = new Scanner(System.in);
		    System.out.println("Ingrese el numero de la caja");
			String number;
			number=scn2.nextLine();
			System.out.println(juan.calcularVolumen(number));
		}
		if(option==2){
			System.out.println(juan.promedio());
		}
		if(option==3){
			System.exit(0);
		}
}while(option<=3);
}
}