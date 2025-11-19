public class Airplanes {
    /// instance variables
    /// 1. used in the whole class
    /// 2. they should be at the top of the class
    /// 3. have public in front
    public int capacity;
    public String name;
    public String model;
    public boolean isDoubleDecker;
    public int length;
    //constructor
    public Airplanes(){ //default values
        capacity = 250;
        name = "Jacob6";
        model = "Boeing 737";
        isDoubleDecker = false;
        length =157;
    }

    //constructor with parameter
    //todo add a parameter for model, isdoubledecker, and length to the constructor
    //todo set the value of the instance variables to the parameters
    //todo fix the related problems in factory
    public Airplanes(int pCapacity, String pname, String pmodel, boolean pisDoubleDecker, int plength){
        capacity = pCapacity;
        name = pname;
        model = pmodel;
        isDoubleDecker = pisDoubleDecker;
        length = plength;

        //left of equal sign is the storage container, the right is the value we are putting into the storage container
        //that's why pname = name; doesn't work

    }
    public void PrintInfo(){
        System.out.println("This plane is named "+ name); //more fancy readable
        System.out.println("Capacity: "+ capacity); //readable simple
        System.out.println("Double Decker: "+ isDoubleDecker);
        System.out.println("Model: "+ model);
        System.out.println("The length of the plane is "+ length + "m"); // super fancy readable
        //System.out.println(model); //not readable
    }
// todo: make a method called PrintInfo() that prints the airplanes instance variables
}
