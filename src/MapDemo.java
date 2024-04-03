import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        // map is interface not extends with collection - hashmap and linked hashmap and tree map classes available
        // it contains key and value pair. this pair is known as an entry

        Map<String,Integer> phoneNumber=new TreeMap<>();
//        Map<String,Integer> phoneNumber=new HashMap<>();
        phoneNumber.put("Nicolas",111111111);
        phoneNumber.put("Tranvolta",222222222);
        phoneNumber.put("Stalon",333333333);
        System.out.println(phoneNumber.get("Stalon"));
        System.out.println(phoneNumber.containsKey("Stalon"));
        System.out.println(phoneNumber.isEmpty());
        System.out.println(phoneNumber.keySet());
        System.out.println(phoneNumber.values());
        //maps don't have iterators
        //keyset returns a set of all keys in the map
        //valuesset returns a collection of all values in the map

        Set<String > nameSet=phoneNumber.keySet();
        for(String key:nameSet){
            System.out.print("name "+key);
        }
        System.out.println();
        Collection<Integer> phoneCollection=phoneNumber.values();
        for(Integer num:phoneCollection){
            System.out.print("number "+num);
        }

        System.out.println();
        for(String name:phoneNumber.keySet()){
            Integer number=phoneNumber.get(name);
            System.out.println(name +" : "+number);

        }

        //tree map
        //hashmap- hashmap faster than treemap , store any type data, key store random
        //treemap - keys are sorted order


    }
}
