package Recursion;

import java.util.*;
class KetPadComb {

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKeypadcomb(String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add("");
            return list;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getKeypadcomb(ros);
        ArrayList<String> fres = new ArrayList<>();
        String codeforch = codes[ch - '0'];
        for(int i = 0; i < codeforch.length(); i++){
            char chCode = codeforch.charAt(i);
            for(String rstr : rres){
                fres.add(chCode + rstr);
            }
        }
        return fres;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = getKeypadcomb(str);
        System.out.println(words);
    }
}
