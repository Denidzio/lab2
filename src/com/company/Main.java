package com.company;

public class Main {

//    public static boolean isPalindrom(String str) {
//
//        String temp_str = str.toLowerCase().replaceAll("[(){},.:;!?<>%–\n ]", "");
//
//        for(int i = 0; i < temp_str.length(); i++)
//            if (temp_str.charAt(i) != temp_str.charAt(temp_str.length() - 1 - i))
//                return false;
//
//        return true;
//    }

//    public static boolean isPalindrom(String str) {
//
//        String temp_str = str.toLowerCase().replaceAll("[(){},.:;!?<>%–\n ]", "");
//
//        return temp_str.equals(new StringBuffer(temp_str).reverse().toString());
//
//    }

    public static boolean isPalindrom(String str) {

        String temp_str = "";

        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                temp_str += Character.toLowerCase(str.charAt(i));
            }
        }

        for(int i = 0; i < temp_str.length() / 2; i++)
            if(temp_str.charAt(i) != temp_str.charAt(temp_str.length() - 1 - i))
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
