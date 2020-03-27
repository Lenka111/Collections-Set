// Elena Voinu
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //create set 1
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(4);
        //display set elements
        System.out.println("set1 =" + set1);
        
        //create set2
        Set<Integer>set2 = new HashSet<>();
        set2.add(3);
        set2.add(1);
        
        //display the elements 
        System.out.println("set2 =" + set2);
        
        //union of two sets
        set1.addAll(set2);
        System.out.println("union of the sets is: "+set1);

        //intersection of the sets
        set1.retainAll(set2);
        System.out.println("intersection is: "+set1);



    }
}
