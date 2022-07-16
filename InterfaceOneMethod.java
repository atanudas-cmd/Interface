/* 01. Create an interface with only one method and implement it in a class. Call the method
 * implemented.
 */
interface fun1 {
        //An abstract method doesn't have its body, and they are public and abstract
        void oneMethod();
    }
    
    public class InterfaceOneMethod implements fun1 {
        @Override
        public void oneMethod() {
            System.out.println("This is a method");
        }
    
        public static void main(String[] args) {
            InterfaceOneMethod obj = new InterfaceOneMethod();
            //Calling the method implemented
           obj.oneMethod();
        }
    }