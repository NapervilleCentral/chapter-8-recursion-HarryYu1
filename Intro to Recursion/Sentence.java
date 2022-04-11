
/**
 * Write a description of class Sentence here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sentence
{
    String text;
    String backup;
    
    public Sentence(String t)
    {
        this.text = t;
        backup = t;
    }
    
    public boolean find(String word)
   {
       if (text.length() < word.length())
       {
           text = backup;
           return false;
        }
       else
       {
           if (word.equals(text.substring(0,word.length())))
           {
               text = backup;
               return true;
            }
           else 
            {
                this.text = text.substring(1, text.length());
                return find(word);
            }
        
        }
        
    }
}
