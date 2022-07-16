/**
 * 04.Create two interfaces with one method each. Implement these two interfaces in one
 * class.
 */


interface fun4 
{
        void methodOne();
    }
    
    //interface 2
    interface fun_4 
    {
        void methodTwo();
    }
    
    //Implemented these two interfaces in one class
    public class TwoInterfaceOneMethod implements fun4, fun_4 
    {
      
        public void methodOne() 
        {
            System.out.println("This is Method one");
        }
    
    
        public void methodTwo()
        {
            System.out.println("This is Method two");
        }
    
        //main method
        public static void main(String[] args) 
        {
            TwoInterfaceOneMethod obj = new TwoInterfaceOneMethod();
            //Calling the methods implemented
            obj.methodOne();
            obj.methodTwo();
        }
}