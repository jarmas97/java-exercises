
// Implement the uniqueNames method. When passed two arrays of names,
// it will return an array containing the names that appear in either or both arrays.
// The returned array should have no duplicates.
//
// For example, calling MergeNames.uniqueNames(new String[]{'Ava', 'Emma', 'Olivia'}, new String[]{'Olivia', 'Sophia', 'Emma'})
// should return an array containing Ava, Emma, Olivia, and Sophia in any order.

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
         return Stream.concat(Arrays.stream(names1), Arrays.stream(names2))
                .distinct().toArray(String[]::new);

    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2)));
        // should print Ava, Emma, Olivia, Sophia
    }
}