import java.util.HashMap;
import java.util.Map;
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    private HashMap<String, String> phoneBook;
    

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
      phoneBook = new HashMap<>();  
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void enterNumber(String name, String number)
    {
       phoneBook.put(name, number);
    }
    public String lookupNumber(String name)
    {
        return phoneBook.get(name);
        
    }
    public boolean containsKey(String name)
    {  
        for (String key : phoneBook.keySet()){
            if(key.equals(name)){
                System.out.println(name + " is in the map");
                return true;
            }
               
               }
               System.out.println(name + " is not in the map");
               return false;
               }
    public void printAllKeys()
    {
      System.out.println("All keys in the map: " + phoneBook.keySet());
    }
}