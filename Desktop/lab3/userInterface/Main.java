package userInterface;
import model.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main{
//attributes
private static Vet vetSafePet;
//constructor
public Main(){
vetSafePet = new Vet("Safe pet", "7578687676778", "La Flora");
}
public String getVetInfo(){
	String info = vetSafePet.makeVetReport();
	return info;
}
public static void main(String[] args){
	Main main = new Main();
	System.out.println(main.getVetInfo());
	int option;
	do{
		Scanner scn = new Scanner(System.in);
		System.out.println("Menu\n");
		System.out.println("1.-Add a Client\n");
		System.out.println("2.-Report Client\n");
		System.out.println("3.-Add a Pet\n");
		System.out.println("4.-Report Pet\n");
		System.out.println("5.-Report of Client without a pet\n");
		System.out.println("6.-Deleted Pet\n");
		System.out.println("7.-Change State\n");
		System.out.println("8.-Add pet in mini room\n");
		System.out.println("9.-Report of the earning\n");
		System.out.println("10.-Search the number of mini room\n");
		System.out.println("11.-Add history\n");
		System.out.println("12.-Discharged pet\n");
		System.out.println("13.-report history\n");
		System.out.println("14.-Exit\n");
		option = 0;
		option = scn.nextInt();
		if(option==1){
			Scanner scn2 = new Scanner(System.in);
			System.out.println("Enter the name of the client");
			String name;
			name=scn2.nextLine();
		    System.out.println("Enter the id of the client");
			String id;
			id=scn2.nextLine();
			System.out.println("Enter the address of the client");
			String address;
			address=scn2.nextLine();
			System.out.println("Enter the phone of the client");
			String phone;
			phone=scn2.nextLine();
			System.out.println(vetSafePet.addPerson(name, id, address, phone, Person.ACTIVE));
			}
		if(option==2){
			System.out.println(vetSafePet.makePersonReport());
		}	
		if(option==3){
			Scanner scn2 = new Scanner(System.in);
		    System.out.println("Enter the id of the client");
			String id;
			id=scn2.nextLine();
			System.out.println("Enter the name of the pet");
			String name;
			name=scn2.nextLine();
			System.out.println("Enter the type of animal");
			char typeAnimal;
			typeAnimal=scn2.nextLine().charAt(0);
			System.out.println("Enter the weight");
			double weight;
			weight = scn2.nextDouble();
			System.out.println("Enter the age");
			int age;
			age = scn2.nextInt();
			System.out.println(vetSafePet.addPet(id,name, typeAnimal, weight, age));
		}
		if(option==4){
			Scanner scn2 = new Scanner(System.in);
		    System.out.println("Enter the id of the client");
			String id;
			id=scn2.nextLine();
			System.out.println(vetSafePet.makePetReport(id));
		}
		if (option==5){
			System.out.println(vetSafePet.verificationPet());
		}
		if(option==6){
			Scanner scn2 = new Scanner(System.in);
			System.out.println("enter the id of the owner ");
			String id;
			id = scn2.nextLine();
			System.out.println("enter the name of the pet you want to remove");
			String name;
			name = scn2.nextLine();
			System.out.println(vetSafePet.deletedPet(id,name));
		}
		if(option==7){
			Scanner scn2 = new Scanner(System.in);
			System.out.println("Enter the id of the person you want to change this state");
			String id;
			id = scn2.nextLine();
			System.out.println("enter the new state");
			char state;
			state=scn2.nextLine().charAt(0);
			System.out.println(vetSafePet.changeState(id,state));
		}
		if(option==8){
			Scanner scn2 = new Scanner(System.in);
		    System.out.println("Enter the id of the client");
			String id;
			id=scn2.nextLine();
			System.out.println("Enter the name of the pet");
			String name;
			name=scn2.nextLine();
			System.out.println("Enter the type of animal");
			char typeAnimal;
			typeAnimal=scn2.nextLine().charAt(0);
			System.out.println("Enter the weight");
			double weight;
			weight = scn2.nextDouble();
			System.out.println("Enter the age");
			int age;
			age = scn2.nextInt();
			System.out.println("between the number of days of hospitalization");
			int days;
			days = scn2.nextInt();
			System.out.println(vetSafePet.addPetMini(id, name, typeAnimal, weight, age, days));
		}
		if(option==9){
			System.out.println(vetSafePet.reportEarning());
		}
		if(option==10){
			Scanner scn2 = new Scanner(System.in);
			System.out.println("Enter the name of the pet");
			String name;
			name=scn2.nextLine();
			System.out.println(vetSafePet.searchNumberOfRoom(name));
		}
		if(option==11){
			Scanner scn2 = new Scanner(System.in);
			System.out.println("enter the number of room");
			String number;
			number=scn2.nextLine();
			System.out.println("enter the name of the pet to which it is to create a clinical history");
			String name;
			name=scn2.nextLine();
			System.out.println("enter the date of admssion");
			String date;
			date=scn2.nextLine();
			System.out.println("enter the sympton");
			String sympton;
			sympton=scn2.nextLine();
			System.out.println("enter the possible diagnosis");
			String possibleDiagnosis;
			possibleDiagnosis=scn2.nextLine();
			System.out.println("enter the number of history");
			String numberHistory;
			numberHistory=scn2.nextLine();
			System.out.println(vetSafePet.addHistory(number,name,History.OPEN,date,sympton,possibleDiagnosis,numberHistory));
		}
		if(option==12){
			Scanner scn2 = new Scanner(System.in);
			System.out.println("enter the number of room");
			String number;
			number=scn2.nextLine();
			System.out.println("Enter the name of the pet you want to register");
			String name;
			name=scn2.nextLine();
			System.out.println(vetSafePet.relasedPet(number,name));
		}
		if(option==13){
			System.out.println(vetSafePet.reportHistory());
		}
		if(option==14){
			System.exit(0);
		}
	}while(option<=14);




}
}