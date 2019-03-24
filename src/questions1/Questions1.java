/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import static java.util.Map.Entry.*;
import java.util.Set;
import static java.util.stream.Collectors.*;
/**
 *
 * @author Kullanıcı
 */
public class Questions1 {
    
   public void sortFunction(String[] array) {
        HashMap<String, Integer> map=new HashMap<String, Integer>();
        HashMap<String, Integer> map1=new HashMap<String, Integer>();
        HashMap<String, Integer> map2=new HashMap<String, Integer>();
        HashMap<String, Integer> map3=new HashMap<String, Integer>();
        
        for(int i=0; i<array.length; i++) {                      //  Map creation
            if(array[i].contains("a") ){                         //  In array [i], if there is a letter 'a'
                int count = 0;                                   //  count :  used to find values, how many 'a' letters
                for(int j =0; j < array[i].length(); j++){
                    if(array[i].charAt(j) == 'a'){              
                        count++;
                    }
                }
                map.put(array[i], count);                        //  created map is thrown into map1
                map1.putAll(map);                               
            } else {                                             //  In array [i], if there isn't a letter 'a'
                map2.put(array[i],array[i].length());            //  According to the length of array[i]
                map3.putAll(map2);                               //  created map2 is thrown into map3
            }       
        }

        //Sorting Map1 and sorted map1 being thrown to 'sorted'
        Map<String, Integer> sorted = map1.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
            .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        
        //  Creating an array ,  Elements of 'sorted' are transferred to array(arr1)
        String[] arr1 = new String[sorted.size()];     //
        Set entries = sorted.entrySet();
        Iterator entriesIterator = entries.iterator();
        int i = 0;
        while(entriesIterator.hasNext()){
            Map.Entry mapping = (Map.Entry) entriesIterator.next();
            arr1[i] = mapping.getKey().toString();
            i++;
        }
        
        //Sorting Map3 and sorted map3 being thrown to 'sorted1'
        Map<String, Integer> sorted1 = map3.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
            .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        
        //  Creating an array ,  Elements of 'sorted1' are transferred to array(arr2)
        String[] arr2 = new String[sorted1.size()];     
        Set entries1 = sorted1.entrySet();
        Iterator entriesIterator1 = entries1.iterator();
        int j = 0;
        while(entriesIterator1.hasNext()){
            Map.Entry mapping1 = (Map.Entry) entriesIterator1.next();
            arr2[j] = mapping1.getKey().toString();
            j++;
        }
       
        //Creating a new array, the elements of the two arrays(arr1, arr2) are thrown into the new array(arr3)
        String[] arr3 = Arrays.copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        for(int k=0; k<arr3.length; k++) {
            System.out.print(arr3[k]+" ");
        }
        
    }

}
