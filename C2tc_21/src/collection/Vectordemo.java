package collection;

import java.util.Vector;

public class Vectordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create a Vector with an initial capacity of 5
        Vector<Integer> vector = new Vector<>(5);

        // Add elements to the vector
        vector.add(1);
        vector.add(2);
        vector.add(3);

        // Display the current size and capacity of the vector
        System.out.println("Size of the vector: " + vector.size());
        System.out.println("Capacity of the vector: " + vector.capacity());

        // Add more elements to the vector
        vector.add(4);
        vector.add(5);
        vector.add(6);

        // Display the current size and capacity of the vector
        System.out.println("Size of the vector: " + vector.size());
        System.out.println("Capacity of the vector: " + vector.capacity());

        // Add one more element to exceed the initial capacity
        vector.add(7);

        // Display the current size and capacity of the vector
        System.out.println("Size of the vector: " + vector.size());
        System.out.println("Capacity of the vector: " + vector.capacity());
    }
}
