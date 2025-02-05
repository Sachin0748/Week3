public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb = new StringBuilder();

        sb.append(str);
        sb.reverse();
        str = sb.toString();
        System.out.println(str);
    }
}
