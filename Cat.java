//creates a class called Cat
public class Cat {
  //creates a private integer variable named catSpaceNumber
  private int catSpaceNumber;

  //creates a constructor named cat
 public Cat(){
	 //initialize variable with a value of 0
      catSpaceNumber = 0;
  }
 
 //creates a getter named getCatSpace Number
 public int getCatSpaceNumber() {
	 //returns the value of the variable catSpaceNumber
	return catSpaceNumber;
 }
 
 // creates a setter that accepts the integer catSpaceNumber
 public void setCatSpaceNumber(int catSpaceNumber) {
	 //sets the field to the value of the user input variable of the same name
	this.catSpaceNumber = catSpaceNumber;
 }

  
}
