package model;
import java.util.ArrayList;
public class MiniRoom{
//attributes
private boolean availability;
private String numberOfRoom;
private int daysInHospital;
//constructor
public MiniRoom(boolean a, String n, int d){
	availability = a;
	numberOfRoom = n;
	daysInHospital = d;
	history = new ArrayList<History>();
}
//relations
private Pet petOnRoom;
private ArrayList<History>history;
//methods
public boolean getAvailability(){
	return availability;
}
public void setAvailability(boolean newAvailability){
	availability = newAvailability;
}
public String getNumberOfRoom(){
	return numberOfRoom;
}
public void setNumberOfRoom(String newNumberOfRoom){
	numberOfRoom = newNumberOfRoom;
}
public int getdaysInHospital(){
	return daysInHospital;
}
public void setDaysInHospital(int newDaysInHospital){
	daysInHospital = newDaysInHospital;
}
public String AddPetOnMini(String n, char t, double w, int a, int d){
	String message="could not be added";
	if(petOnRoom==null){
	petOnRoom = new Pet(n, t, w, a);
	setAvailability(false);
	setDaysInHospital(d);
	message="it was added successfully";
	}
	return message;
	}	
public double costHospital(){
	double total=0;
	if(petOnRoom.getTypeAnimal()==petOnRoom.CAT){
		if(petOnRoom.getWeight()>=1 && petOnRoom.getWeight()<=3){
			total=10000*daysInHospital;
		}
			if(petOnRoom.getWeight()>=3.1 && petOnRoom.getWeight()<=10){
				total=12000*daysInHospital;
				}
					if(petOnRoom.getWeight()>=10.1 && petOnRoom.getWeight()<=20){
						total=15000*daysInHospital;
						}
						if(petOnRoom.getWeight()>20){
							total = 20000*daysInHospital;
							}							
		}
		if(petOnRoom.getTypeAnimal()==petOnRoom.DOG){
		if(petOnRoom.getWeight()>=1 && petOnRoom.getWeight()<=3){
			total=15000*daysInHospital;
		}
			if(petOnRoom.getWeight()>=3.1 && petOnRoom.getWeight()<=10){
				total=17000*daysInHospital;
				}
					if(petOnRoom.getWeight()>=10.1 && petOnRoom.getWeight()<=20){
						total=20000*daysInHospital;
						}
						if(petOnRoom.getWeight()>20){
							total = 25000*daysInHospital;
							}							
		}
		if(petOnRoom.getTypeAnimal()==petOnRoom.BIRD){
		if(petOnRoom.getWeight()>=1 && petOnRoom.getWeight()<=3){
			total=10000*daysInHospital;
		}
			if(petOnRoom.getWeight()>=3.1 && petOnRoom.getWeight()<=10){
				total=12000*daysInHospital;
				}
					if(petOnRoom.getWeight()>=10.1 && petOnRoom.getWeight()<=20){
						total=20000*daysInHospital;
						}
						if(petOnRoom.getWeight()>20){
							total = 25000*daysInHospital;
							}							
		}
		if(petOnRoom.getTypeAnimal()==petOnRoom.OTHER){
		if(petOnRoom.getWeight()>=1 && petOnRoom.getWeight()<=3){
			total=10000*daysInHospital;
		}
			if(petOnRoom.getWeight()>=3.1 && petOnRoom.getWeight()<=10){
				total=17000*daysInHospital;
				}
					if(petOnRoom.getWeight()>=10.1 && petOnRoom.getWeight()<=20){
						total=30000*daysInHospital;
						}
						if(petOnRoom.getWeight()>20){
							total = 33000*daysInHospital;
							}							
		}
		return total;
	}
public Pet searchPetH(String name){
	Pet objpeth=null;
	if(petOnRoom!=null){
		if(name.equalsIgnoreCase(petOnRoom.getName())){
			objpeth = petOnRoom;
		}	

	}
	return objpeth;
}	
public String addClinicHistory(char s, String d, String sy, String pd, String nh){
	String message="";
	History objh = new History(s, d, sy, pd, nh);
	history.add(objh);
	message="the clinical history was added satisfactorily";
	return message;
	
}
public History searchClinicHistory(String number){
	History searchH = null;
	if(history.isEmpty()==true){
		searchH=null;
	}
	for(int i=0;i<history.size()&&searchH==null;i++){
		if(number.equals(history.get(i).getNumberHistory())){
			searchH = history.get(i);
		}
	}
	return searchH;
}	
public String ReportClinicHistory(){
	String text="";
	if(history.isEmpty()==true){
	text="there are no Clinic history in the room"+getNumberOfRoom()+"\n";
	}
	for(int i=0;i<history.size();i++){
		if(history.get(i).getState()==History.CLOSE){
		 text="there are no Clinic history in the room"+getNumberOfRoom()+"\n";
		}
		if(history.get(i).getState()==History.OPEN)
		text+="the state is: "+history.get(i).getState()+" the Date Of Admission: "+history.get(i).getDateOfAdmission()+" the sympton is: "+history.get(i).getSympton()+" the posible diagnosis is: "+history.get(i).getPossibleDiagnosis()+" the number of history is "+history.get(i).getNumberHistory()+"\n";
	}
	return text;
	}
public String releasedPet(String name){
	String text="could not be relased";
	if(name.equalsIgnoreCase(petOnRoom.getName())){
		petOnRoom = null;
		setAvailability(true);
		if(history.isEmpty()==false){
		for(int i=0;i<history.size();i++){	
		history.get(i).setState(History.CLOSE);
		}
		text="was discharged";
	}
	}
	return text;
}
public String addHistory(char s, String d, String sy, String pd, String nh){
	String text="";
	History objH=new History(History.OPEN,d,sy,pd,nh);
	if(searchClinicHistory(nh)==null){
		history.add(objH);
		text="the history was created successfully";
	}
	else{
		text="history already exists";
	}
	return text;
}		
}
	
