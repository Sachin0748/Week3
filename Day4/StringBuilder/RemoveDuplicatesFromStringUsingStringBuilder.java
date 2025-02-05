import java.util.HashSet;

public class RemoveDuplicatesFromStringUsingStringBuilder {
    public static void main(String[] args) {

        String str = "saaachinsssaa";
        StringBuilder sb = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();

        for(char ch : str.toCharArray()){
            if(!hs.contains(ch)){
                sb.append(ch);
            }
            hs.add(ch);
        }
        System.out.println(sb.toString());
    }
}
