public class ConcatenateString {
    public static void main(String[] args) {
        String[] arr = {"Hello", ",", " My", " name", " is", " Sachin", "."};
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}