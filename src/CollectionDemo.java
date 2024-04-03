import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionDemo {
    public static void main(String[] args) {
        //the interface collection defines the core functionality that we expect of any collection except map.
        //Collection<String> bestApps=new ArrayList<>();
        Collection<String> bestApps=new LinkedList<>();
        bestApps.add("Master Coding");
        bestApps.add("Master Coding Pro");
        System.out.println(bestApps);
    }
}
