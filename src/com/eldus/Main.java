package com.eldus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static String findMailDomain(String s) {
        Pattern pattern = Pattern.compile("[a-z]+@[a-z]+\\.[a-z]+");
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            pattern = Pattern.compile("[a-z]+\\.[a-z]+");
            matcher = pattern.matcher(s);
            matcher.find();
            return matcher.group();
        } else {
            return "Это не адрес электронной почты";
        }
    }

    public static void main(String[] args) {

        Pattern p1 = Pattern.compile("\\d+\\/(10|11|12|[1-9])\\/(30|31|[1-2]?[1-9]) ([0-1][0-9]|2[1-3]):([0-5][0-9])");
        Matcher m1 = p1.matcher("2020/12/23 05:30");
        System.out.println(m1.matches());
        Matcher m2 = p1.matcher("2020/33/77 99:99");
        System.out.println(m2.matches());
        Pattern p2 = Pattern.compile("");
        System.out.println(findMailDomain("abc@mail.com"));
        System.out.println(findMailDomain("zzz@ccc.v"));

        Color[] colors = new Color[5];
        colors[0] = Color.RED;
        colors[1] = Color.GREEN;
        colors[2] = Color.BLUE;
        colors[3] = Color.WHITE;
        colors[4] = Color.BLACK;
        for (Color i : colors) {
            System.out.println(i.hex);
            System.out.println(i.r + " " + i.g + " " + i.b);
        }
    }
}
