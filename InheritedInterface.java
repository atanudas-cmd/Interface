/**
 
 * 07. Create an interface and inherit it from the other interface.
 */

//interface
interface fun7 {
    void methodOne();
}

//inherited interface
interface fun_7 extends fun7 {
    void methodTwo();
}

class InheritedInterface implements fun_7 {
    //override method of interface fun_7
    
    public void methodOne() {
        System.out.println("This is first method");
    }
    //override method of inherited interface fun_7
    
    public void methodTwo() {
        System.out.println("This is second method");
    }

    public static void main(String[] args) {
        //creating obj of InheritedInterface
        InheritedInterface obj = new InheritedInterface();
        //Calling the methods implemented
        obj.methodOne();
        obj.methodTwo();
    }
}
