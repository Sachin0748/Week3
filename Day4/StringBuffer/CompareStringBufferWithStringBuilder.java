public class CompareStringBufferWithStringBuilder {
  public static void main(String[] args) {
    String str = " hello";
    StringBuilder sbd = new StringBuilder();
    StringBuffer sbf = new StringBuffer();

    long startTimeOfBuilder = System.nanoTime();
    for(int i = 0; i < 1_000_000; i++){
      sbd.append(str);
    }
    long endTimeOfBuilder = System.nanoTime();
    long executionTimeOfBuilder = endTimeOfBuilder - startTimeOfBuilder;
    System.out.println("ExecutionTime for StringBuilder : " + executionTimeOfBuilder);

    long startTimeOfBuffer = System.nanoTime();
    for(int i = 0; i < 1000000; i++){
      sbf.append(str);
    }
    long endTimeOfBuffer = System.nanoTime();
    long executionTimeOfBuffer = endTimeOfBuffer - startTimeOfBuffer;
    System.out.println("ExecutionTime for StringBuffer : " + executionTimeOfBuffer);
  }
}
