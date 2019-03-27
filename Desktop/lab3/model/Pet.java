package model;
public class Pet{
//constants
public final static char DOG='D';
public final static char CAT='C';
public final static char BIRD='B';
public final static char OTHER='O';
//attributes
private String name;
private char typeAnimal;
private double weight;
private int age;
//constructor
public Pet(String n, char t, double w, int a){
	name = n;
	typeAnimal = t;
	weight = w;
	age = a;
}
//methods
public String getName(){
	return name;
}
public void setName(String newName){
	name = newName;
}
public char getTypeAnimal(){
	return typeAnimal;
}
public void setTypeAnimal(char newTypeAnimal){
	typeAnimal = newTypeAnimal;
}
public double getWeight(){
	return weight;
}
public void setWeight(double newWeight){
	weight = newWeight;
}
public double getAge(){
	return age;
}
public void setAge(int newAge){
	age = newAge;
}
}