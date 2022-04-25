import java.util.Scanner;

/**
   Converts a numeric pin to an equivalent word using the digit to
   letter mapping on a standard telephone keypad.
 */
public class PinWordEnumerator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a pin number-> ");
        String num = scan.nextLine();
        System.out.println();
        System.out.printf("The keypad encodings for %s are:%n",num);
        enumerateWords(num);
        enumerateWords(num, " ");
    }

    /**
       A wrapper for a recursive method that enumerates all the
       phone keypad encodings for a number.
       @param n a string representing the number
     */
    public static void enumerateWords(String n)
    {
         // Implement a recursive method that generates
         // all possible phone keypad encodings for a
         // number. Implement additional auxiliary methods
         // if necessary.
         
         //52
         
         
         String[] map = {"0","1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
         
         if (n.length() == 0)
         {
             System.out.print("\n");
             
            }
         else{
                int firstDigit = Integer.parseInt(n.substring(0,1));
                for (int i = 0; i < map[firstDigit].length(); i++)
                {
                    
                    System.out.print(map[firstDigit].charAt(i));
                    enumerateWords(n.substring(1)); //cut off
                }
            }
    }

    /**
           Recursively generates all possible 'words' that represent
           the telephone keypad encoding of a number.
           @param pin the number
           @param word representing the encoding a the pin
         */
        public static void enumerateWords(String pin, String word)
        {
            
        }

    /*if (pin.length() == 0)
            {
                System.out.printf("%s%n",word);
            }
            else
            {
                String[] map = {"0","1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
                    for(int i = 0; i <= map[Integer.parseInt(pin.substring(0,1))].length(); i++)
                    {
                        String newWord = word + map[Integer.parseInt(pin.substring(0,1))].charAt(i);
                        enumerateWords(pin.substring(1), newWord);
                    }
            }
*/
    }
