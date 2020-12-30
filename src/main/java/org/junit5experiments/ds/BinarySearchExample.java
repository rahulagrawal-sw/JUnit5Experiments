package org.junit5experiments.ds;

public class BinarySearchExample {
    public static void main(String[] args) {
        int [] arr = new int[] {1,5,8,20,50};
        int itemToFind = 500;

        int left = 0;
        int right = arr.length-1;
        int mid = (left + right) / 2;

        while (right >= left) {
            if(itemToFind == arr[mid]) {
                System.out.println("found at : " + mid);
                return;
            }
            else if(itemToFind < arr[mid]) {
                right = mid -1;
            }
            else if(itemToFind > arr[mid]) {
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }
        System.out.println("Not found");
    }
}
