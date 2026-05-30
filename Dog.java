public class Dog { // create public class called Dog
    private int dogSpaceNumber; //set private attributes for class Dog
    private int dogWeight;
    private boolean grooming;

    public Dog() { // initialize attributes for Dog object
        dogSpaceNumber = 0;
        dogWeight = 0;
        grooming = false;
    }

    public int getDogSpaceNumber() {

        return dogSpaceNumber;
    }

    public void setDogSpaceNumber(int dogSpaceNumber) {

        this.dogSpaceNumber = dogSpaceNumber;
    }

    public int getDogWeight() {

        return dogWeight;
    }
    public void setDogWeight(int dogWeight) {

        this.dogWeight = dogWeight;
    }


    public boolean getGrooming() {

        return grooming;
    }

    public void setGrooming( boolean grooming) {

        this.grooming = grooming;
    }

}
