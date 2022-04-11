/**
   Computes the sum of a set of data values.
*/
public class DataSet
{
   private int[] values;
   private int first;
   private int last;
   int index = 0;
   int sum;

   /**
      Constructs a DataSet object.
      @param values the data values
      @param first the first value in the data set
      @param last the last value in the data set
   */
   public DataSet(int[] values, int first, int last)
   {
      this.values = values; 
      this.first = first;
      this.last = last;
   }

   /**
      Gets the sum in the set of data values
      @return the sum value in the set
   */
   public int getSum()
   { 
      if (index > last)
      {
          index = 0;
          return sum;
        }
        
      else
      {
          sum += values[index];
          index++;
          return getSum();
        }
      
   }
}
