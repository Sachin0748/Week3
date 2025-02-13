import java.util.Arrays;

public class SearchATargetInALargeDataset {

    // Function for linear search: Returns the index of the target if found, otherwise returns -1
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found, return the index
            }
        }
        return -1; // Target not found
    }

    // Function for binary search: Returns the index of the target if found, otherwise returns -1
    public static int BinarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int mid;
        while(start <= end) {
            mid = start + (end - start) / 2; // Calculate middle index
            if(arr[mid] == target) {
                return mid; // Target found, return the index
            }
            if (arr[mid] > target) {
                end = mid - 1; // Search in the left half
            }
            else {
                start = mid + 1; // Search in the right half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {

        // For dataset of size 1,000
        System.out.println("\nFor dataset of 1,000 size......\n");
        int[] arr1 = new int[1000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random()*100); // Fill array with random values between 0 and 100
        }
        int target = (int)(Math.random()*100); // Random target to search for
        System.out.println("Target element is : " + target);

        // Measure time taken by Linear Search
        double startTimeOfLinearSearch = System.nanoTime();
        int index = linearSearch(arr1, target);
        double endTimeOfLinearSearch = System.nanoTime();
        System.out.println("Target found at index by linear search : " + index);
        System.out.println("Time taken by Linear search : " + (endTimeOfLinearSearch - startTimeOfLinearSearch));

        // Sort array for Binary Search
        Arrays.sort(arr1);

        // Measure time taken by Binary Search
        double startTimeOfBinarySearch = System.nanoTime();
        index = BinarySearch(arr1, target);
        double endTimeOfBinarySearch = System.nanoTime();
        System.out.println("Target found at index by binary search : " + index);
        System.out.println("Time taken by Binary search : " + (endTimeOfBinarySearch - startTimeOfBinarySearch));

        // For dataset of size 10,000
        System.out.println("\nFor dataset of 10,000 size......\n");
        int[] arr2 = new int[10000];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int)(Math.random()*1000); // Fill array with random values between 0 and 1000
        }
        target = (int)(Math.random()*1000); // Random target to search for
        System.out.println("Target element is : " + target);

        // Measure time taken by Linear Search
        startTimeOfLinearSearch = System.nanoTime();
        index = linearSearch(arr2, target);
        endTimeOfLinearSearch = System.nanoTime();
        System.out.println("Target found at index by linear search : " + index);
        System.out.println("Time taken by Linear search : " + (endTimeOfLinearSearch - startTimeOfLinearSearch));

        // Sort array for Binary Search
        Arrays.sort(arr2);

        // Measure time taken by Binary Search
        startTimeOfBinarySearch = System.nanoTime();
        index = BinarySearch(arr2, target);
        endTimeOfBinarySearch = System.nanoTime();
        System.out.println("Target found at index by binary search : " + index);
        System.out.println("Time taken by Binary search : " + (endTimeOfBinarySearch - startTimeOfBinarySearch));

        // For dataset of size 1,000,000
        System.out.println("\nFor dataset of 1,000,000 size......\n");
        int[] arr3 = new int[1000000];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int)(Math.random()*10000); // Fill array with random values between 0 and 10000
        }
        target = (int)(Math.random()*10000); // Random target to search for
        System.out.println("Target element is : " + target);

        // Measure time taken by Linear Search
        startTimeOfLinearSearch = System.nanoTime();
        index = linearSearch(arr3, target);
        endTimeOfLinearSearch = System.nanoTime();
        System.out.println("Target found at index by linear search : " + index);
        System.out.println("Time taken by Linear search : " + (endTimeOfLinearSearch - startTimeOfLinearSearch));

        // Sort array for Binary Search
        Arrays.sort(arr3);

        // Measure time taken by Binary Search
        startTimeOfBinarySearch = System.nanoTime();
        index = BinarySearch(arr3, target);
        endTimeOfBinarySearch = System.nanoTime();
        System.out.println("Target found at index by binary search : " + index);
        System.out.println("Time taken by Binary search : " + (endTimeOfBinarySearch - startTimeOfBinarySearch));
    }
}
