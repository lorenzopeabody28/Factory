public class David {
    public String name;
    public int number1;
    public boolean trueOrFalse;

    public void PrintInfo(){
        System.out.println(name);
        System.out.println(number1);
        System.out.println(trueOrFalse);
    }
    public David() {
        name = "David Jefferson";
        System.out.println("His name is " +name);
        number1 = 67;
        System.out.println("He is " + number1);
        trueOrFalse = false;
        System.out.println("It is " +trueOrFalse+ " that David likes glass.");

    }
    public David(String pname, int pnumber1, boolean ptrueOrFalse){
        name = pname;
        number1 = pnumber1;
        trueOrFalse = ptrueOrFalse;


    }
}
