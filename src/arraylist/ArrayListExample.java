package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sagar Adhalge
 */
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        ArrayList<Object> myList2 = new ArrayList<Object>();

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(); // diamond operator
        List<String> list3 = new ArrayList<>(); // using interface as type

//        ArrayList<String> list4 = new List<>(); // does not compile

        List<String> list5 = new ArrayList<>(20);
        
        System.out.println(list5.toString());
    }
}
