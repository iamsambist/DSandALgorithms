import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class StartOfMaps{
    public static void main(String[] args) {
      // creating a Map
        Map<Integer,String> voter=new HashMap<>();
    // Input
    voter.put(1,"sam");
    voter.put(2,"Nabin");
    voter.put(3,"Dharmendra");
    voter.put(4,"Anil");
    voter.put(5,"Jenny");

    // Searching
    // Through voter id 
    // find value associated with id 5
        System.out.println(voter.get(5));

        // Accessing using Entry Interface
        Set set=voter.entrySet();
        Iterator i=set.iterator();
        while(i.hasNext()){
            Map.Entry me=(Map.Entry)i.next();
            System.out.print(me.getKey()+" "+":");
            System.out.println(" "+me.getValue());
        }
        // update 3 as a Ram 
        String num=voter.get(3);
        voter.replace(3, num, "Ram");
        System.out.println(voter);
    }

}