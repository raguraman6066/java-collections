import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    /*iterator is an object that implements the interface iterator
    public Iterator<E>{
        boolean hasNext();
        E next();
        void remove();
    }*/

    //purpose to provide a uniform way of accessing collection elements sequentially.

    /*
    * iterable , anything that extends or implements interface iterable - produce an iterator
    * public Iterable<T>{
    *    Iterator<T> iterator();
    * }
    *
    * java collection extends iterable interface
    * */


    public static void main(String[] args) {

        ArrayList<String>  list=new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        //using iterators
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //for each - use for all collection
        System.out.println("___________");

        for(String st:list){
            System.out.println(st);
        }

    }
}
