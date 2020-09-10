package com.company;

public class Main {

    public static boolean isPalindrom(String str){

        String temp_str = str.toLowerCase().replaceAll("[(){},.:;!?<>%–\n ]", "");

        for(int i = 0; i < temp_str.length(); i++)
            if (temp_str.charAt(i) != temp_str.charAt(temp_str.length() - 1 - i))
                return false;

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrom("Аргентина: манит НЕГРА"));
        System.out.println(isPalindrom("А мене нема..."));
        System.out.println(isPalindrom("Колесо. Жалко поклаж. Оселок."));

        System.out.println(isPalindrom("Палиндром"));

    }
}
