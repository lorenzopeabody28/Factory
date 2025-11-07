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
    //constructor - is a very special type of method, it has exact same name as class, it has no void, it allows us to make a factory
    public Factory() {
        isOpen = false;
        //scope for manager is only in the constructor
        String manager = "Mr. Bob";

        factoryInfo();
        //todo: change the variable yearFounded to be a different value in public Factory constructor
        //call factoryInfo(); again
    }
    //sout makes System.out.println()
    public void factoryInfo () {                       //make a method called factoryInfo
        System.out.println(yearFounded);
        System.out.println(factoryName);
        System.out.println(isOpen);
        //System.out.println(yearFounded + factoryName + isOpen);
        // more readable option
        //System.out.println("year founded" + yearFounded);
        // add souts to print out the instance variables
    }
}
