package com.company;

public class Main {

    public static void main(String[] args) {
        solution(1000, 5);
    }
    public static void solution(int s, int p) {
        int k = 0;
        double sum = s;
        while (sum < 2 * s) {
            k++;
            sum = sum + sum * p / 100.0;
        }
        System.out.println(k);
        System.out.println(sum);
    }
}