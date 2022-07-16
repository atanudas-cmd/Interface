/**
 * 05. Create two interfaces with the same method (same signature) in both the interfaces.
 * Implement these two interfaces in one class. Call the method.
 */

//interface 1
interface fun5 {
    void fun1();
}

//interface 2
interface fun_5 {
    void fun1();
}

//Implemented these two interfaces in one class
class TwoInterfaceSameMethod implements fun5, fun_5 {
 
    public void fun1() {
        System.out.println("This is same method in both the interfaces");
    }

   
    public static void main(String[] args) {
        TwoInterfaceSameMethod t1 = new TwoInterfaceSameMethod();
        t1.fun1();
    }
}
