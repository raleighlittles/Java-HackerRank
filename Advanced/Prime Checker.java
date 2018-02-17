import  static java.lang.System.*;

// From wikipedia: Static import is a feature introduced in the Java programming language that allows members (fields and methods) defined in a class as public static to be used in Java code; without specifying the class in which the field is defined.
// Since you can't edit the code below to add "System" before In, you have to use a static import


class Prime
{
    void checkPrime(int ... numbers)
    { // use the biginteger probable prime function?
        for (int number: numbers)
        {
            if (BigInteger.valueOf(number).isProbablePrime(1))
            {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}