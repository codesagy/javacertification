package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sagar Adhalge
 */
public class UsingWrappersInList {

    public static void main(String[] args) {
//        List<double> doubleList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();

        doubleList.add(10.5); // autoboxing
        doubleList.add(new Double(55.10));
        doubleList.remove(55.10); // autoboxing
        double first = doubleList.get(0); // unboxing to primitive

        System.out.println(doubleList);
        System.out.println(first);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(null);

        System.out.println(numbers);

//        int number = numbers.get(0); // null pointer exception int can't hold/be null


        List<Integer> nums = new ArrayList<>();
        nums.add(14); // index 0
        nums.add(28); // index 1
        nums.add(13);
        System.out.println(nums); // 1

        nums.remove(1);
//        nums.remove(new Integer(1));

        System.out.println(nums); // 1
    }
}
