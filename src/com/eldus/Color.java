package com.eldus;

import java.util.regex.Pattern;

public enum Color {
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE("0000ff"), WHITE("ffffff"), BLACK(0, 0, 0);
    String hex;
    int r, g, b;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
        StringBuilder hexBuilder = new StringBuilder();
        if (r < 16) {
            hexBuilder.append("0");
        }
        hexBuilder.append(Integer.toHexString(r));
        if (g < 16) {
            hexBuilder.append("0");
        }
        hexBuilder.append(Integer.toHexString(g));
        if (b < 16) {
            hexBuilder.append("0");
        }
        hexBuilder.append(Integer.toHexString(b));
        hex = hexBuilder.toString();
    }

    Color(String hex) {
        this.hex = hex;
        r = Integer.parseInt(hex.substring(0, 2), 16);
        g = Integer.parseInt(hex.substring(2, 4), 16);
        b = Integer.parseInt(hex.substring(4, 6), 16);
    }
}
