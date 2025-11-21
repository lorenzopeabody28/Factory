public class David {

    public String name;
    public int number1;
    public boolean trueOrFalse;

    public David() {
        name = "David Jefferson";
        number1 = 67;
        trueOrFalse = false;


    }
    public void PrintInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age" + number1);
        System.out.println("IDK: " + trueOrFalse);
    }

    public David(String pname, int pnumber1, boolean ptrueOrFalse){
        name = pname;
        number1 = pnumber1;
        trueOrFalse = ptrueOrFalse;


    }

}
