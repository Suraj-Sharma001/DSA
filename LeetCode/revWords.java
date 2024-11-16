public class revWords {

    public static void reverseString(String str){
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        // step1 = reverse complete string
        sb.reverse();
        // step 2 = now reverse each word
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i< n; i++){
            String word =  "";
            while(i < n && sb.charAt(i) != ' '){
                word += sb.charAt(i);
                i++;
            }
            
        }
        
    }
    public static void main(String[] args) {
        String str = "the sky is blue";
        reverseString(str);
    }
}
