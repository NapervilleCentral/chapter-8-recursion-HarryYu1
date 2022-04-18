
/**
 * Write a description of class PyramidScheme here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PyramidScheme
{
    public static void main(String args[])
    {
        collect(1000);
    }
    
    public static int collect(int goal)
    {
        if (goal/10  == 0)
        {
            return 1;
        }
        else{
            for (int i = 0; i < 10; i++)
            {
                System.out.print(goal/10);
            }
            return collect(goal/10);
        }
    }
}
