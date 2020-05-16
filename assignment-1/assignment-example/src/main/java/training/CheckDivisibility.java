package training;

/**
Result would be obtained only if divisor is not zero
**/

public class CheckDivisibility 
{
    public static void main( String[] args )
    {
       System.out.println(isDivisible(8, 4));
	 }
	 public static boolean isDivisible(int dividend, int divisor)
	 {
	 	return dividend % divisor == 0 ? true : false;
	 }
}

