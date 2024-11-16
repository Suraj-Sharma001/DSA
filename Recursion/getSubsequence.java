import java.util.*;
class getSubsequence {

    public static ArrayList<String> getSubSequence(String str){
        if(str.length() == 0){
            ArrayList<String> list = new ArrayList<String>();
            list.add(" ");
            return list;
        }
        char ch = str.charAt(0); // a
        String sub = str.substring(1); // bc
        ArrayList<String> ros = getSubSequence(sub); // [- - -],[- - c],[- b -],[- b c]

        ArrayList<String> ans = new ArrayList<>();
        for(String val : ros){
            ans.add(" - " + val);
            ans.add((ch + val));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> seq = getSubSequence(str);
        // "abc" -> [[- - -],[- - c],[- b -],[- b c],[a - -],[a - c],[a b -],[a b c]]
        System.out.println(seq);
    }
}
