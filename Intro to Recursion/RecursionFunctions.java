
/**
 * Write a description of class RecursionFunctions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecursionFunctions
{
    public static void main(String[] args)
    {
        //nto0(5);
        //zeroton(5);
        //System.out.println(reverse("This String"));
        //System.out.println(isPrime(18));
        System.out.println(fibNocc(7));
    }
    
    public static void nto0(int n)
    {
        if (n == 0)
            System.out.println(0);
        else
        {
            System.out.println(n);
            nto0(n-1);
        }
    }
    
    public static void zeroton(int n)
    {
        if (n == 0)
            System.out.println(0);
        else
        {
            zeroton(n-1);
            System.out.println(n);
        }
    
    }
    
    public static String reverse(String sentence)
    {
        if (sentence.length() == 1)
        {
            return sentence;
        }
        else
        {
            return reverse(sentence.substring(1, sentence.length())) + sentence.charAt(0);
        }
    }
    
    public static boolean isPrime(int num)
    {
        return helperPrime(num, num-1);
    }
    
    public static boolean helperPrime(int num, int divisor)
    {
        if (divisor == 1)
        {
            return true;
        }
        else if (num % divisor == 0)
        {   return false; }
        else
        {
            return helperPrime(num, divisor-1);
        }
    }
    
    public static int fibNocc(int num)
    {
        if (num == 1)
        {
            return 1;
        }
        else if (num == 2)
        {
            return 2;
        }
        else
        {
            return fibNocc(num-1) + fibNocc(num-2);
        }
    }
}
