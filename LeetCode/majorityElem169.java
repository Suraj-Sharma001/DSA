package LeetCode;

import java.util.Scanner;

public class majorityElem169 {

    // Boyer Moore Voting Algorithm
    /*
    Set first element as majority and its count to be 1.
    Go through the loop and if same element found inc the count else dec the count.
    At any time if count become 0 -> set majority = arr of that elem and count = 1.
    At the end we return the majority, and we don`t need to verify because acc to ques maj will always exist.
     */

    static int MajorityElement(int []arr) {
        int n = arr.length;
        int maj = arr[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i] == maj) {
                count++;
            } else {
                count--;
                if(count == 0){
                    maj = arr[i];
                    count = 1;
                }
            }
        }
        return maj;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maj = MajorityElement(arr); // n/2 times
        System.out.println("Majority n/2 in array is: " + maj);
    }
}
