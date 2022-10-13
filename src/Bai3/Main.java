package Bai3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        String stringInput = scanner.nextLine();
        List<Character> min = new ArrayList<>();
        List<Character> max = new ArrayList<>();
        for (int i = 0; i < stringInput.length(); i++) {
            for (int j = 0; j < stringInput.length(); j++) {
                if (max.isEmpty()){
                    min.add(stringInput.charAt(j));
                    max.add(stringInput.charAt(j));
                    continue;
                }
                if (stringInput.charAt(j)<min.get(min.size()-1)){
                    min.clear();
                }
                min.add(stringInput.charAt(j));
                if (min.size()>max.size()){
                    max.clear();
                    max.addAll(min);
                }
            }
        }
        System.out.println(max);
    }
}
