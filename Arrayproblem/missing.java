package Arrayproblem;

public class missing {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};

        boolean[] temp = new boolean[arr.length+1];

        for(int i = 0; i < arr.length; i++) {
            temp[arr[i]-1] = true;
        }
        for(int i = 0; i < temp.length; i++){
            if(temp[i] == false) {
                System.out.println(i+1);
            }
        }
    }
}
