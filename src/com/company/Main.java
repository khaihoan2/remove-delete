package com.company;

import java.util.Scanner;

public class Main {

    public static void creatArr(int arr[], int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        creatArr(arr,size);

        System.out.print("Mảng vừa nhập là: ");
        display(arr);
        System.out.println();


        System.out.println("Nhập vị trí muốn xóa:");
        int deletedIndex = sc.nextInt();
        int[] newArray = removeElementFromArray(arr, deletedIndex);
        System.out.println("Mảng sau khi xóa:");
        display(newArray);


    }

    public static void display(int arr[]) {
        for (int list : arr) {
            System.out.print(list + " ");
        }
    }

    public static void deleteIndex(int arr[], int index){
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void deleteElement(int element, int arr[]) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == element) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        arr[arr.length - 1] = 0;
    }

    public static int[] removeElementFromArray(int[] arr, int deletedIndex) {
        int[] newArray = new int[arr.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < deletedIndex) {
                newArray[i] = arr[i];
            } else {
                newArray[i] = arr[i + 1];
            }
        }
        return newArray;
    }
}
