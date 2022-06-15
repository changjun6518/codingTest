package 구현.팔진수와이진수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 8진수가 주어졌을때 2진수로 변환
        // 334 -> 11011100
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            int num = Integer.parseInt(String.valueOf(c));
            sb.append(num / 4);
            num %= 4;
            sb.append(num / 2);
            num %= 2;
            sb.append(num);
        }

        while (sb.charAt(0) == '0' && sb.length() != 1) {
            sb.deleteCharAt(0);
        }

        System.out.println(sb);
    }

}
