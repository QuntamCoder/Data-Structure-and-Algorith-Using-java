

public class Floor_Of__Number_Using_BinarySearch  {
    public static int BinarySearchAlgo(int tar, int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == tar) {
                // System.out.println("Found at Index "+arr[mid]);
                return mid;
            } else if (arr[mid] < tar) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // If the target is not found, you may want to return a special value,
        // for example, -1 to indicate that the target is not in the array.
        return arr[right];
    }

    public static void main(String args[]) {
        int array[] = {2, 3, 4, 5, 7, 8};
        int key = 6;
        int result = BinarySearchAlgo(key, array);
        if (result != -1) {
            System.out.println("Target Found at Index " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}

