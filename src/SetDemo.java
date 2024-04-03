import java.util.*;

//set interface in java is present in java.util package.
public class SetDemo {
    public static void main(String[] args) {
        //set - unordered list, not allows duplicate elements





        //1. hashset - uses a hash_table for storage that places elements into specific position
        //based on integers called hash codes, add and remove is fast
        Set<String> set=new HashSet<>();
        set.add("Element1");
        set.add("Element2");
        set.add("Element2");
        set.add("Element3");
        System.out.println(set.size());
        //iterating over the collection elements
        Iterator<String> it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
       // System.out.println(set);
        //2. linked hashset- ordered version of hashset- maintain order doubly-linked list across all elements
        Set<String>  s2=new LinkedHashSet<>();
        s2.add("A");
        s2.add("B");
        s2.add("C");
        s2.add("E");
        s2.add("D");
        s2.add("C");

        Iterator<String> it2= s2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        System.out.println("-----------");
        //tree set - tree for storage, unique elements. access and retrieval time of tree set fast. add or delete - hashset is fast
        //tree set stored in ascending order.binary search tree to store elements in sorted order, data structure.
        Set<String>  s3=new TreeSet<>();
        s3.add("P");
        s3.add("Q");
        s3.add("T");

        s3.add("R");
        s3.add("R");
        s3.add("S");

        Iterator<String> it3= s3.iterator();
        while(it3.hasNext()){
            System.out.println(it3.next());
        }
    }

}
