package BinarySearch;

import java.util.Scanner;

public class bookAllocation {

    public static boolean isPossible(int[] books, int n, int s, int minPage) {
            int totalStud = 1;
            int totalPages = 0;
            for(int i = 0; i < n; i++) {
                if(totalPages + books[i] <= minPage) {
                    totalPages += books[i];
                } else {
                    totalStud++;
                    if(totalStud > s || books[i] > minPage) {
                        return false;
                    }
                    totalPages = books[i];
                }
            }
        return true;
    }

    public static int AllocateBooks(int[] books, int n, int s) {
            int sum = 0;
            for(int i = 0; i < n; i++) {
                sum += books[i];
            }
            int st = 0;
            int end = sum;
            int ans = -1;
            while(st <= end) {
                int mid = st+(end-st)/2;
                if(isPossible(books, n, s, mid)) {
                    ans = mid;
                    end = mid-1;
                } else {
                    st = mid+1;
                }
            }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of books: ");
        int n = sc.nextInt();
        System.out.print("Enter the pages of each books: ");
        int[] books = new int[n];
        for(int i = 0; i < n; i++) {
            books[i] = sc.nextInt();
        }
        System.out.print("Enter the no of student: ");
        int s = sc.nextInt();

        int minPages = AllocateBooks(books, n, s);
        System.out.println("Maximum no of pages s.t. students are minimum: " + minPages);
    }
}
