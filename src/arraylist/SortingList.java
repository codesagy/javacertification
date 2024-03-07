package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Sagar Adhalge
 */
public class SortingList {

    public static void main(String[] args) {
        List<String> numsList = new ArrayList<>();
        numsList.add("500");
        numsList.add("10");
        numsList.add("9");
        numsList.add("50");
        numsList.add("40");

        System.out.println(numsList);
        Collections.sort(numsList);
        System.out.println(numsList);

        List<Integer> numbers = Arrays.asList(5, 4, 8, 10, 11, 7, 3);
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);
       
        // Comparing with Array for sorting
        Integer numArray[] = {6,4,8,1};
        Arrays.sort(numArray);
        System.out.println(Arrays.asList(numArray));
    }
}
