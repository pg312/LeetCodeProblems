package org.learnings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {

    public  int lonelyinteger(List<Integer> a) {
        // Write your code here

        int lonelyInteger = 0;
        HashMap<Integer,Integer> count = new HashMap<Integer, Integer>();

        for(Integer number : a){
            if(count.get(number) == null){
                count.put(number, 1);
            }
            else
                count.put(number, count.get(number)+1);
        }
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            if(entry.getValue() == 1)
                lonelyInteger = entry.getKey();
        }
        return lonelyInteger;

    }

}