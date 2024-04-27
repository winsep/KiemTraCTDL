package Advance.dev;

import java.util.Arrays;

public class Bai2 {
//Trần Quốc Thắng_23CDTH41
	
	// a. Đem phan tu Chan trong mang
    public static int demPhanTuChan(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    
    // b. kiem tra mang co dc sap xep tang dan hay k
    public static boolean sapXepTangDan(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
    // c. dem so phan tu co gias tri tu 4 den 12
    public static int chonPhanTu(int[] arr, int start, int end) {
        int count = 0;
        for (int num : arr) {
            if (num >= start && num <= end) {
                count++;
            }
        }
        return count;
    }
    
    // d. tinh tong
    public static int tinhTong(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    // e. tinh tong ptu le
    public static int tinhTongLe(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }
    
    // f. sap xep mang tang dan theo giai thuat noi bot
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    // g. tim gia tri lon nhat
    public static int timGiaTriLonNhat(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 6, 4, 12, 5, 8};
        
        // a. dem phan tu chan trong mang
        System.out.println("Số phần tử chẵn trong mảng: " + demPhanTuChan(arr));
        
        // b. kiem tra sap xep tang dan
        System.out.println("Mảng có được sắp xếp tăng dần không: " + sapXepTangDan(arr));
        
        // c. dem phan tu co gia tri tu 4 den 12
        System.out.println("Số phần tử có giá trị từ 4 đến 12: " + chonPhanTu(arr, 4, 12));
        
        // d. tinh tong
        System.out.println("Tổng các phần tử của mảng: " + tinhTong(arr));
        
        // e. tinh tong cac phan tu le
        System.out.println("Tổng các phần tử có giá trị lẻ: " + tinhTongLe(arr));
        
        // f. sap xep tang dan bang bubbleSort
        bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(arr));
        
        // g. tim gia tri lon nhat
        System.out.println("Giá trị lớn nhất của mảng: " + timGiaTriLonNhat(arr));
    }
}