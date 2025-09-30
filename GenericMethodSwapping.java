package ragav;
public class GenericMethod {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swap: ");
        for (Integer num : intArray) {
            System.out.print(num + " ");
        }
        swap(intArray, 1, 3);
        System.out.println("\nAfter swap: ");
        for (Integer num : intArray) {
            System.out.print(num + " ");
        }
        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("\n\nBefore swap: ");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
        swap(strArray, 0, 2);
        System.out.println("\nAfter swap: ");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
    }
}


