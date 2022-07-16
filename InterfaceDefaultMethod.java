/**
 * 06. Create an interface with a default method and implement it in a class. Do not provide
 * implementation to the default method and call the method.
 */
//interface
interface fun6 {
   
    default void defaultMethod() {
        System.out.println("This is the default method");
    }
}

class InterfaceDefaultMethod implements fun6 {
    public static void main(String[] args) {
        //Didn't provide implementation to the default method
        InterfaceDefaultMethod obj= new InterfaceDefaultMethod();
        //Calling the method
        obj.defaultMethod();
    }
}