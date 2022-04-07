public class Palindromes
{
   public static void main(String[] args)
   {
      String sentence1 = "Madam, I'm Adam!";
      System.out.println(sentence1);
      System.out.println("Palindrome: " + isPalindrome(sentence1));
      String sentence2 = "Sir, I'm Eve!";
      System.out.println(sentence2);
      System.out.println("Palindrome: " + isPalindrome(sentence2));
      
      String sentence3 = "racecar";
      System.out.println(sentence3);
      System.out.println("Palindrome: " + isPalindrome(sentence3));
   }

   /**
    * Test to see if a thing is a palindrome
    * @param a String to test
    * @return true or false, true if palindrome
    */
   public static boolean isPalindrome(String sentence)
   {
       int length = sentence.length();
           if (length <= 1)
           {
               return true;
            }

             char first = Character.toLowerCase(sentence.charAt(0));
             char last = Character.toLowerCase(sentence.charAt(length-1));
       if (Character.isLetter(first) && Character.isLetter(last))

 
           {
  
               
               if (first == last)
               {
                   String shorter = sentence.substring(1, length - 1);
                   
                   return isPalindrome (shorter);
                }
            }
            
       else if (!Character.isLetter(last))
       {
           String shorter = sentence.substring(0,length-1);
           return isPalindrome(shorter);
        }
       else if (!Character.isLetter(first))
       {
           String shorter = sentence.substring(1);
           return isPalindrome(shorter);
        }
           return false;
    }
}
