package arrays;

import java.util.Arrays;

/**
 * @author Sagar Adhalge
 */
public class VariableArguments {

//    public static void main(String[] args) {
//        System.out.println(args.length);
//        System.out.println(Arrays.toString(args));
//    }

    public static void main(String... args) {
        System.out.println(args.length);

        print(args);
        print("Java");
        print("this", "is", "my", "string", "array");
        print("variable", "arguments", "are", "nice", "and", "useful", "feature");
        
        printInt(1,2,3,4,5);
        printInt(7,8,9);
    }

    private static void print(String... myArguments) {
        System.out.println(Arrays.toString(myArguments));
    }
    
    private static void printInt(Integer...integers) {
    	System.out.println(Arrays.toString(integers));
    }
}
