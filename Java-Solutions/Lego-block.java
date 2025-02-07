package com.hackerrank.test.prepare.algorights.lego_blocks;

import java.util.*;

public class Solution {
  private static final int MOD = 1000000007; // 10^9+7
  private static final int MAX_SIZE = 1000 + 1; // 1 <= n, m <= 1000
  private static final int UNKNOWN = -1;

  static int[][] allSolutions = new int[MAX_SIZE][MAX_SIZE];
  static int[][] solidSolutions = new int[MAX_SIZE][MAX_SIZE];

  static {
    for (int i = 1; i < MAX_SIZE; i++) {
      Arrays.fill(allSolutions[i], UNKNOWN);
      Arrays.fill(solidSolutions[i], UNKNOWN);
    }
  }

  static int getAllSolutions(final int height, final int width) {
    if (allSolutions[height][width] != UNKNOWN) {
      return allSolutions[height][width];
    }

    long count;
    if (width == 1) {
      count = 1;
    } else if (height == 1) {
      if (width <= 4) {
        count = 2 * getAllSolutions(1, width - 1);
      } else { // width > 4
        count = 0;
        for (int i = 1; i <= 4; i++) {
          count += getAllSolutions(1, width - i);
          count %= MOD;
        }
      }
    } else { // width > 1 && height > 1
      int oneRowSolutions = getAllSolutions(1, width);

      count = 1;
      for (int h = 0; h < height; h++) {
        count *= oneRowSolutions;
        count %= MOD;
      }
    }

    allSolutions[height][width] = (int) count;
    return allSolutions[height][width];
  }

  static int getSolidSolutions(final int height, final int width) {
    if (solidSolutions[height][width] != UNKNOWN) {
      return solidSolutions[height][width];
    }

    long count;
    if (width == 1) {
      count = 1;
    } else {
      count = getAllSolutions(height, width);
      for (int i = 1; i < width; i++) {
        long a = getAllSolutions(height, i);
        long b = getSolidSolutions(height, width - i);
        count -= (a * b) % MOD;
        if (count < 0) {
          count += MOD;
        }
      }
    }
    solidSolutions[height][width] = (int) count;
    return solidSolutions[height][width];
  }

  public static void main(String[] args) {
    try (final Scanner scanner = new Scanner(System.in)) {
      int testCases = scanner.nextInt();
      while (testCases-- > 0) {
        final int height = scanner.nextInt();
        final int width = scanner.nextInt();
        System.out.println(getSolidSolutions(height, width));
      }
    }
  }
}
