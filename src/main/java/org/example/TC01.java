package org.example;

import java.util.HashMap;

public class TC01 {
    public static void main(String[] args) {
        String str = "Komrelly Srinivas Reddy";
        HashMap<Character,Integer> hmap  = new HashMap<Character,Integer>();
        char[] ch = str.toCharArray();
        for(char c : ch) {
            if(hmap.containsKey(c)) {
                hmap.put(c,hmap.get(c)+1);
            }else  hmap.put(c,1);
        }

    }
}
