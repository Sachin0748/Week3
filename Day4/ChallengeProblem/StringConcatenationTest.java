public class StringConcatenationTest {
  public static void main(String[] args) {
      int iterations = 1_000_000;
      String text = "hello";

      // Using StringBuilder
      long startTime = System.nanoTime();
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < iterations; i++) {
          sb.append(text);
      }
      long endTime = System.nanoTime();
      System.out.println("Time taken by StringBuilder: " + (endTime - startTime) / 1_000_000 + " ms");

      // Using StringBuffer
      startTime = System.nanoTime();
      StringBuffer sbf = new StringBuffer();
      for (int i = 0; i < iterations; i++) {
          sbf.append(text);
      }
      endTime = System.nanoTime();
      System.out.println("Time taken by StringBuffer: " + (endTime - startTime) / 1_000_000 + " ms");
  }
}
