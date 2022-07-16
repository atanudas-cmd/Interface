/**
 
 * 09. Create a PRIVATE or PROTECTED interface and print the values as above scenario
 * 10. Create an interface with private, public and protected fields
 * 11.  Create an interface with static final variable
 */


interface fun9 {

    public int num1 = 165;
    static final int num2 = 202;
    final int num3 = 389;
    // private int num4 = 404;  - error
    // protected int num5 = 505; - error
}

class InterfacePrivateProtected implements fun9 {

    public static void main(String[] args) {
        InterfacePrivateProtected obj = new InterfacePrivateProtected();
        System.out.println(obj.num1 + " " + obj.num2);
    }

}
