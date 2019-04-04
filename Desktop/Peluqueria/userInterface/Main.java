package userInterface;
import Model.*;
import java.util.Scanner;
public class Main{
//atributos
	private static Salon queBelleza;
//constructor
public Main(){
queBelleza = new Salon ("Que Belleza");
}
public static void main(String []args){
	Main main = new Main();
	int option;
	do{
	Scanner scn = new Scanner(System.in);
	System.out.println("1.Registrar un servicio\n");
	System.out.println("2.Ver Ingreso acumulado de un tipo de servicio\n");
	System.out.println("3.Ganancia empleado\n");
	System.out.println("4.Salir\n");
	option = 0;
	option = scn.nextInt();
	if(option==1){
		System.out.println("Introduzca el nombre del empleado\n");
		String nombre;
		scn.nextLine();
		nombre = scn.nextLine();
		System.out.println("Introduzca el tipo de servicio\n");
		char tipoDeServicio;
		tipoDeServicio = scn.nextLine().charAt(0);
		System.out.println("Introduzca el nombre del servicio\n");
		String nombreser;
		nombreser = scn.nextLine();
		System.out.println("Introduzca el valor del servicio\n");
		double valorIndividual;
		valorIndividual = scn.nextDouble();
		System.out.println("Introduzca valorAcumuladoImpuestos\n");
		double valorImpuestos;
		valorImpuestos = scn.nextDouble();
		System.out.println(queBelleza.registrarServicio(nombre,tipoDeServicio,nombreser,queBelleza.ingresoAcumulado(nombre,tipoDeServicio),valorIndividual,valorImpuestos ));
	}
	if(option==2){
		System.out.println("Introduzca el nombre del empleado\n");
		String nombre;
		scn.nextLine();
		nombre = scn.nextLine();
		System.out.println("Introduzca el tipo de servicio\n");
		char tipoDeServicio;
		tipoDeServicio = scn.nextLine().charAt(0);
		System.out.println(queBelleza.ingresoAcumulado(nombre,tipoDeServicio));
	}
	if(option==3){
		System.out.println("Introduzca el nombre del empleado\n");
		String nombre;
		scn.nextLine();
		nombre = scn.nextLine();
		System.out.println("Introduzca el tipo de servicio\n");
		char tipoDeServicio;
		tipoDeServicio = scn.nextLine().charAt(0);
		System.out.println(queBelleza.gananciaEmpleado(nombre,tipoDeServicio));
	}
	if(option==4){
		System.exit(0);
	}
	}while(option<=3);
}
}
