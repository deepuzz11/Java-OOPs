import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericMaxFinder {
    // Generic method to find the maximum element in a list
    public static <T extends Comparable<T>> T max(List<T> elements) {
        if (elements == null || elements.isEmpty()) {
            throw new IllegalArgumentException("List is empty or null");
        }

        T max = elements.get(0);
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Example with integers
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);
        intList.add(15);
        intList.add(7);
        Integer maxInt = max(intList);
        System.out.println("Max integer: " + maxInt);

        // Example with strings
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        String maxString = max(stringList);
        System.out.println("Max string: " + maxString);

        // Example with a custom class (assuming the class implements Comparable)
        List<MyClass> customList = new ArrayList<>();
        customList.add(new MyClass(20));
        customList.add(new MyClass(10));
        customList.add(new MyClass(30));
        MyClass maxCustom = max(customList);
        System.out.println("Max custom object: " + maxCustom.getValue());
    }
}

// Example custom class that implements Comparable
class MyClass implements Comparable<MyClass> {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(MyClass other) {
        return Integer.compare(this.value, other.value);
    }
}
