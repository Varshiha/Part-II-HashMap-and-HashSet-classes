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
    private HashMap<String, String> responses;
    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
      phoneBook = new HashMap<>();  
      responses = new HashMap<>();
      fillResponsesMap();
    }
    public void fillResponsesMap()
    {
      responses.put("lagging", "You should try restarting the computer.");
      responses.put("crashed", "Tell me exactly what happened in detail.");
      responses.put("Thank you", "You are welcome.");
    }
    public String generateResponse(String word)
    {
       if (responses.containsKey(word)){
        return responses.get(word);
        }else{
        return pickDefaultResponse();
        }
    }
    public String pickDefaultResponse()
    {
       return "Could you give me more details? I am not sure what you mean.";
    }
    /**
     * 
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