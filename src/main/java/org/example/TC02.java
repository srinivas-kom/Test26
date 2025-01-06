package org.example;

import java.util.HashMap;
import java.util.Map;

public class TC02 {
    public static void main(String[] args)
    {
        String str = "Bangalore";
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(count.containsKey(str.charAt(i)))
                count.put(str.charAt(i) , count.get(str.charAt(i))+1);
            else count.put(str.charAt(i),1);
            //increase the count of characters by 1
        }

        for (Map.Entry<Character,Integer> mapElement : count.entrySet()) {   //iterating through the unordered map
            if (mapElement.getValue() > 1)   //if the count of characters is greater than 1 then duplicate found
                System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
        }
    }
}
