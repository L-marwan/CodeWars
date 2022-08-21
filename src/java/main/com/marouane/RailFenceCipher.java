package com.marouane;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

/**
 * 
 * https://www.codewars.com/kata/58c5577d61aefcf3ff000081
 */
public class RailFenceCipher {

    static String encode(String s, int n) {
        if ("".equals(s))
            return "";

        // HELLO, WORLD!
        // H O O !
        // E L , W R D
        // L _ L
        String[] rails = new String[n];
        Arrays.fill(rails, "");
        int i = 0;
        boolean up = true;
        for (String ch : s.split("")) {
            rails[i] += ch;
            if (i == n - 1)
                up = false;
            if (i == 0)
                up = true;
            if (up)
                i++;
            else
                i--;
        }
        return String.join("", rails);
    }

    static String decode(String s, int n) {
        if ("".equals(s))
            return "";

        List<Deque<Integer>> railsInt = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            railsInt.add(new ArrayDeque<>());
        }

        int i = 0;
        boolean up = true;
        char[] res = new char[s.length()];
        for (int index = 0; index < s.length(); index++) {
            railsInt.get(i).add(index);
            if (i == n - 1)
                up = false;
            if (i == 0)
                up = true;
            if (up)
                i++;
            else
                i--;
        }

        int j = 0;
        for (Deque<Integer> q : railsInt) {
            while (!q.isEmpty()) {
                res[q.remove()] = s.charAt(j);
                j++;
            }
        }

        return String.copyValueOf(res);
    }
}
