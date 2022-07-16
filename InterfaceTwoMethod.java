/*
 * 02. Create an interface with two methods, but implement only one in a class. Call the
 * method implemented.
 */


interface fun2 {
    void methodOne();

    void methodTwo();
}

public class InterfaceTwoMethod implements fun2 {
    //cannot implement only one method in a class
   
  public void methodOne() {
        System.out.println(" This is my First Method");
    }


    public void methodTwo() {
        System.out.println("This is my  Second Method");
    }

    //main method
    public static void main(String[] args) {
        InterfaceTwoMethod if2 = new InterfaceTwoMethod();
        //Calling the methods implemented
        if2.methodOne();
        if2.methodTwo();
    }
}
