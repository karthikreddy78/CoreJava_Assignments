package LambdaAssignment;

@FunctionalInterface
interface Subtraction
{
    int subtract(int a,int b);
}

@FunctionalInterface
interface Addition
{
    int add(int a,int b);
}
@FunctionalInterface
interface Multiplication
{
    int multiply(int a,int b);
}


@FunctionalInterface
interface Division
{
    int divide(int a,int b);
}

@FunctionalInterface
interface Square
{
    int calculate(int x);
}
 
public class BasicArithmeticOperations
{
    public static void main(String args[])
    {
        int a = 10;
        int b=20;
 
        // lambda expression to define the calculate method
        
        Addition a1=(int s1,int t)->s1+t;
        Subtraction b1=(int sa1,int sa2)->sa1-sa2;
        Multiplication m=(int sa1,int sa2)->sa1*sa2;
        Division d=(int sa1,int sa2)->sa1/sa2;
        //System.out.println(s);
        // parameter passed and return type must be
        // same as defined in the prototype
        
        System.out.println("Addition is:"+a1.add(a, b));
        System.out.println("Subtraction is:"+b1.subtract(a, b));
        System.out.println("Multiplication is:"+m.multiply(a, b));
        System.out.println("Division is:"+d.divide(b, a));
        
    }
}


