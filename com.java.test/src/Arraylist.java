import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Arraylist {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random rand = new Random();

        // add elements
        list.add(rand.nextInt(100));
        list.add(rand.nextInt(100));
        list.add(rand.nextInt(100));
        list.add(rand.nextInt(100));
        list.add(rand.nextInt(100));
        list.add(rand.nextInt(100));
        list.add(rand.nextInt(100));
        list.add(rand.nextInt(100));
        list.add(rand.nextInt(100));

        // print the list
        System.out.println(list);

        // add elements in particular location
        list.add(5,7);
        System.out.println(list);

        //get elemet of list
        int element = list.get(5);
        System.out.println(element);

        //set element
        list.set(5, 11);
        System.out.println(list);

        //delete element
        list.remove(5);
        System.out.println(list);

        //size of list
        int size = list.size();
        System.out.println(size);

        //sort the list
        Collections.sort(list);
        System.out.println(list);
    }
}
