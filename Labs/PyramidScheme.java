
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
        System.out.print(collect(4000));
    }
    
    public static int collect(int goal)
    {
        System.out.println(goal);
        if (goal < 10)
        {
            
            return goal;
        }
        else{
            System.out.println(goal);
            return collect(goal/10) +
            collect(goal/10) +
            collect(goal/10) +
            collect(goal/10) +
            collect(goal/10) +
            collect(goal/10) +
            collect(goal/10) +
            collect(goal/10) + 
            collect(goal/10) +
            collect(goal/10);
        }
    }
}
