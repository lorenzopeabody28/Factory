public class Factory {
    //make a variable called yearFounded that is an integer
    //instance variables at the top of class, they can be seen by every class
    //they have to have the word public
    //scope is the whole class, where a variable exists, where you can use it
    public int yearFounded = 1798;
    public String factoryName = "Nutella Factory"; //you know its a string when their is quotes
    public boolean isOpen = true;


    //psvm method, type it in it makes method for you
    public static void main(String[] args) {
        System.out.println("Welcome to Enzo's factory");
        new Factory(); //makes new factory
    }
    //constructor
    //1. is a method
    //2. has same name as class
    //3. no void when being called upon
    public Factory() {
        isOpen = false;
        //scope for manager is only in the constructor
        String manager = "Mr. Bob";
        factoryInfo();
        yearFounded = 1944;
        factoryInfo();
        //todo: change the variable yearFounded to be a different value in public Factory constructor
        //call factoryInfo(); again
        /// type, varName = value
        //object(fancy variable) of type Airplanes
        Airplanes plane1 = new Airplanes();
        plane1.name = "jeff";
        System.out.println("Name: "+ plane1.name);
        plane1.capacity = 44;
        System.out.println("Capacity: "+ plane1.capacity);
        plane1.isDoubleDecker = false;
        System.out.println("Double Decker: "+ plane1.isDoubleDecker);
        plane1.model = "A300";
        System.out.println("Model: "+ plane1.model);
        plane1.length = 135;
        System.out.println("Length: "+ plane1.length + "m");

        Airplanes plane2 = new Airplanes();
        System.out.println(plane2.capacity);
        //todo; hw; make 2 more airplane objects
        //todo; for one of the objects change all the instance variables
        //todo; for both objects print all the instance variables



        //todo: give all of plane1's instance vars values
    }
    //sout makes System.out.println()
    public void factoryInfo () {//make a method called factoryInfo
        System.out.println("Year founded: "+ yearFounded);
        System.out.println("Factory name: " + factoryName);
        System.out.println("Is open: " + isOpen);
        //System.out.println(yearFounded + factoryName + isOpen);
        // more readable option
        //System.out.println("year founded" + yearFounded);
        // add souts to print out the instance variables
    }
}
