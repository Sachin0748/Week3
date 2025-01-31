public class ExamMarks {

  // Method to sort the array using Selection Sort
  public static void sort(int marks[]) {
    
    // Iterate through the array
    for (int i = 0; i < marks.length - 1; i++) {
      int smallestIdx = i; // Assume the current index holds the smallest element

      // Find the smallest element in the unsorted part of the array
      for (int j = i + 1; j < marks.length; j++) {
        if (marks[j] < marks[smallestIdx]) {
          smallestIdx = j; // Update index of the smallest element
        }
      }

      // Swap the smallest element with the first element of the unsorted part
      int temp = marks[i];
      marks[i] = marks[smallestIdx];
      marks[smallestIdx] = temp;
    }
  }

  public static void main(String[] args) {
    // Array of student marks
    int marks[] = { 56, 89, 45, 33, 66, 21 };

    // Sorting the marks in ascending order
    sort(marks);

    // Printing the sorted marks
    for (int i = 0; i < marks.length; i++) {
      System.out.print(marks[i] + ",");
    }
  }
}
