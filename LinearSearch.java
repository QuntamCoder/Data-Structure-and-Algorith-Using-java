public class LinearSearch {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;  // Return the index if the target is found
            }
        }
        return -1;  // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 7, 2, 9, 5, 8};
        int target = 5;

        int result = linearSearch(array, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
