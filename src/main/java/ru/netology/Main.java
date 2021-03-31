package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bops = new BinOps();
        System.out.println(bops.sum("000101", "0100001"));
        System.out.println(bops.multi("1010", "1001"));
    }
}
