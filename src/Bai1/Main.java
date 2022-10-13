package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi :");
        String inputData = sc.nextLine();
        String output = " ";
        for (int i = 0; i <inputData.length() ; i++) {
            if (output.length()==0){
                output+= inputData.charAt(i);
            }else {
                if (output.charAt(output.length()-1)<inputData.charAt(i)){
                    output+= inputData.charAt(i);
                }
            }
        }
        System.out.println(output);
    }
}
