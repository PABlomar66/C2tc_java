package collection;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(10);

        
       
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        
        Set<Integer> differenceResult = new HashSet<>(set1);
        differenceResult.removeAll(set2);
        System.out.println("Set Difference (Set1 - Set2): " + differenceResult);

       
        Set<Integer> intersectionResult = new HashSet<>(set1);
        intersectionResult.retainAll(set2);
        System.out.println("Set Intersection (Set1 & Set2): " + intersectionResult);

      
        Set<Integer> unionResult = new HashSet<>(set1);
        unionResult.addAll(set2);
        System.out.println("Set Union (Set1 | Set2): " + unionResult);
    }
}
