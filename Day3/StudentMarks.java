public class StudentMarks {

    // Method to sort the array using Bubble Sort
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwap = false; // Flag to check if swapping occurred
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // Swap if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwap = true;
                }
            }
            // If no swapping occurred, the array is already sorted
            if (!isSwap) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        // Array of student marks
        int marks[] = {60, 96, 42, 86, 37};
        
        // Sorting the marks in ascending order
        sort(marks);

        // Printing the sorted marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
