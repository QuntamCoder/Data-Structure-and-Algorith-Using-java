public class SmallestLetter {
    public static char GreatestCharacter(char arr[], char key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }

    public static void main(String args[]) {
        char letters[] = {'a', 'b', 'c', 'd'};
        char key = 'e';
        char result = GreatestCharacter(letters, key);
        System.out.println(result);
    }
}
