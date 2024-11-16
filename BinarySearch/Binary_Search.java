package BinarySearch;

public class Binary_Search {
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,15,20,24,45,50,77};
       
                int key = 20;
        
                int low = 0;
                int high = arr.length-1;
        
                while(low<=high){
                    int mid = (low+high)/2;
                    if(key > arr[mid]){
                        low = mid+1;
                    } else if(key < arr[mid]){
                        high = mid-1;
                    } else {
                        System.out.println(mid);
                        return;
                    }
                }
                System.out.println("Not found");
            }
        }
