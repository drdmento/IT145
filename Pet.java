package module4;

//create Pet class
public class Pet {
	//create private fields for class Pet
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpaces;
	private int catSpaces;
	private int daysStay;
	private double amountDue;
	
	//create Pet constructor and initialize variables
public Pet() {
	petType = "None";
	petName = "None";
	petAge = 0;
	dogSpaces = 30;
	catSpaces = 12;
	daysStay = 1;
	amountDue = 0.0;
}

//getters and setters for all variables
public String getPetType() { //creates getPetType
	//returns value of variable petType
	return petType;
}

public void setPetType(String petType) { //setter to accept a String name petType
	//sets field name petType to parameter of the same name
	this.petType = petType;
}

public String getPetName() { //creates getPetName
	//returns value of petName
	return petName;
}

public void setPetName(String petName) { //setter to accept a String named petName
	//sets field name petName to parameter of the same name
	this.petName = petName;
}

public int getPetAge() { //creates getPetAge
	//returns value of petAge
	return petAge;
}

public void setPetAge(int petAge) { //setter to accept a integer named petAge
	//sets field name petAge to parameter of the same name
	this.petAge = petAge;
}

public int getDogSpaces() { //creates getDogSpaces
	//returns value of dogSpaces
	return dogSpaces;
}

public void setDogSpaces (int dogSpaces) { //setter to accept an integer named dogSpaces
	//sets field name of dogSpaces to parameter of the same name
	this.dogSpaces = dogSpaces;
}

public int getCatSpaces() { //creates getCatSpaces
	//returns value of catSpaces
	return catSpaces;
}

public void setCatSpaces(int catSpaces) { //setter to accept an integer named catSpaces
	//sets field name of catSpaces to parameter of the same name
	this.catSpaces = catSpaces;
}

public int getDaysStay() { //creates getDaysStay
	//returns value of daysStay
	return daysStay;
}

public void setDaysStay(int daysStay) { //setter to accept in integer named daysStay
	//sets field name of daysStay to parameter of the same name
	this.daysStay = daysStay;
}

public double getAmountDue() { //creates getAmountDue
	//returns value of amountDue
	return amountDue;
}

public void setAmountDue(double amountDue) { //setter to accept a double names amountDue
	//sets field name of amountDue to parameter of the same name
	this.amountDue = amountDue;
}

}

