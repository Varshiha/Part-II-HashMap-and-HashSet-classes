import java.util.ArrayList;
import java.util.Random;
import java.util.HashSet;
import java.util.HashMap;


/**
 * The responder class represents a response generator object. It is used
 * to generate an automatic response. This is the second version of this 
 * class. This time, we generate some random behavior by randomly selecting 
 * a phrase from a predefined list of responses.
 * 
 * @author   Michael Kölling and David J. Barnes
 * @version 7.2
 */
public class Responder
{
    private Random randomGenerator;
    private ArrayList<String> responses;
    private HashMap<String, String>responseMap;
    private String lastResponse;
    private HashMap<String, String> otherResponses;
   

    /**
     * Construct a Responder
     */
    public Responder()
    {
        randomGenerator = new Random();
        responses = new ArrayList<>();
        responseMap = new HashMap<>();
        fillResponses();
        fillResponseMap();
        lastResponse = null;
        otherResponses = new HashMap<>();
        otherResponses.put("why", "Can you clarify?");
        otherResponses.put("how", "Can you give more details?");
        otherResponses.put("who", "Are you asking for someone.");

        
        
       
    }
    public void fillResponseMap()
    {
      String restart= "You should try restarting the computer.";
      responseMap.put("slow", restart);
      responseMap.put("lagging", restart);
      String crash = "Tell me exactly what happened in detail.";
      responseMap.put("crashed", crash);
      responseMap.put("frozen", crash);
      responseMap.put("thank you", "You are welcome.");
      responseMap.put("bug", "Did you try unplugging it and plugging it again");
    }
    /**
     * Generate a response.
     * 
     * @return  A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> words)
    { 
    ArrayList<String> matches = new ArrayList<>();
        
    for (String word : words){
        String response = responseMap.get(word.toLowerCase());
        if (response != null){
        matches.add(response);
       }
        }
         if (matches.size() == 1) {
        return matches.get(0); // one keyword matched
       } 
        else if (matches.size() > 1) {
        return "You mentioned several issues: " + matches; // multiple matches
       } 
       else {
    
    for (String word : words) {
        word = word.toLowerCase();
        if (otherResponses.containsKey(word)) {
            return otherResponses.get(word);
        }
    }
    
    return pickDefaultResponse();
    }

     }
    
     
    
    public String generateResponse(String word) {
    HashSet<String> set = new HashSet<>();
    set.add(word);
    return generateResponse(set);
    }

    public String pickDefaultResponse()
    {
       if (responses.isEmpty()){
        return "I am not sure what you mean.";
        }
       String response;
       do{
        int index = randomGenerator.nextInt(responses.size());
         response = responses.get(index);
         }while(response.equals(lastResponse) && responses.size() > 1);
         lastResponse = response;
         return response;
       }
    /**
     * Build up a list of default responses from which we can pick one
     * if we don't know what else to say.
     */
    private void fillResponses()
    {
        responses.add("That sounds odd. Could you describe this in more detail?");
        responses.add("""
        No other customer has ever complained about this before.
                      What is your system configuration?
                      """);
        responses.add("I need a bit more information on that.");
        responses.add("Have you checked that you do not have a dll conflict?");
        responses.add("That is covered in the manual. Have you read the manual?");
        responses.add("""
                      Your description is a bit wishy-washy. Have you got an expert
                      there with you who could describe this more precisely?
                      """);
        responses.add("That's not a bug, it's a feature!");
        responses.add("Could you elaborate on that?");
        responses.add("Have you tried running the app on your phone?");
        responses.add("I just checked StackOverflow - they don't know either.");
    }
   

}

