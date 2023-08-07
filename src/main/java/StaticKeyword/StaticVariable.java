package StaticKeyword;

public class StaticVariable {
    int rollNo;//instance variable
    String name;
    static String college = "BIT";//static variable
    //constructor
    StaticVariable(int r, String n){
        rollNo = r;
        name = n;
    }
    //method to display the values
    void display (){System.out.println(rollNo+" "+name+" "+college);}
}
