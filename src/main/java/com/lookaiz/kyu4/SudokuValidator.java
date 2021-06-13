package com.lookaiz.kyu4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SudokuValidator {

    private static final List<Integer> ALL_DIGITS = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    private enum Direction {LINE, COLUMN, SQUARE}

    public static boolean check(int[][] sudoku) {
        List<int[]> toValid = new ArrayList<>();

        for (int idx = 0; idx < 9; idx++) {
            // lines
            toValid.add(getSubgrid(sudoku, idx, 0, Direction.LINE));

            // columns
            toValid.add(getSubgrid(sudoku, 0, idx, Direction.COLUMN));
        }

        for (int idx = 0; idx <= 6; idx+=3) {
            toValid.add(getSubgrid(sudoku, idx, 0, Direction.SQUARE));
            toValid.add(getSubgrid(sudoku, idx, 3, Direction.SQUARE));
            toValid.add(getSubgrid(sudoku, idx, 6, Direction.SQUARE));
        }

        System.out.println(toValid.size() + " blocks to be validated");

        for (int[] block : toValid) {
            if (!isValid(block)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValid(int[] block) {
        List<Integer> digits = IntStream.of(block)
                .boxed()
                .distinct()
                .collect(Collectors.toList());

        if (digits.size() != 9) {
            return false;
        }

        return ALL_DIGITS.containsAll(digits);
    }

    private static void displayGrid(int[][] grid) {
        System.out.println(Arrays.deepToString(grid).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }

    private static String displayBlock(int[] block) {
        return Arrays.toString(block);
    }

    private static int[] getSubgrid(int[][] grid, int i, int j, Direction direction) {
        int[] subgrid = new int[9];
        switch (direction) {
            case LINE: subgrid = grid[i]; break;
            case COLUMN:
                for (int idx = 0; idx < 9; idx++) {
                    subgrid[idx] = grid[idx][j];
                }
                break;

            case SQUARE:
                int cpt = 0;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        subgrid[cpt] = grid[i+k][j+l];
                        cpt++;
                    }
                }
                break;

            default: break;
        }
        return subgrid;
    }

}
