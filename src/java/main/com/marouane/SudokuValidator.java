package com.marouane;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://www.codewars.com/kata/529bf0e9bdf7657179000008
 *
 */
public class SudokuValidator {

    public static boolean check(int[][] sudoku) {

        for (int i = 0; i < 9; i++) {

            // columns
            Set<Integer> column = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0)
                    return false;
                if (!column.add(sudoku[i][j]))
                    return false;
            }
            if (9 != column.size())
                return false;

            // rows
            if (9 != Arrays.stream(sudoku[i]).distinct().count()) {
                return false;
            }
        }

        for (int c = 1; c < 3; c++) {
            for (int r = 1; r < 3; r++) {
                Set<Integer> chunkSet = new HashSet<>();
                for (int i = (3 * (c - 1)); i < (3 * c); i++) {
                    for (int j = (3 * (r - 1)); j < (3 * r); j++) {
                        if (!chunkSet.add(sudoku[i][j]))
                            return false;
                    }
                } //
                if (9 != chunkSet.size())
                    return false;
            }

        }

        return true;
    }
}
