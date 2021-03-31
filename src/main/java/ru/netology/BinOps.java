package ru.netology;

public class BinOps {
    private String a;
    private String b;

    public String sum(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2)
                + Integer.parseInt(b, 2));
    }

    public String multi(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) *
                Integer.parseInt(b, 2));
    }
}
