package com.tp.practiceOne;

public class CharlesXavier {

    public static int[] winningPossible(int playerCount, int[][] mathMatrix) {
        int[] winning = new int[playerCount];
        int max = 0;
        for (int j = 0; j < mathMatrix.length; j++) {
            int win = 0, future = 0;
            for (int i = 0; i < mathMatrix[j].length; j++) {
                if (mathMatrix[j][i] == 1) win++;
                else if (mathMatrix[j][i] == 2) future++;
            }
            winning[j] = win + future;
            max = Math.max(max, winning[j]);
        }

        int[] finalRes = new int[playerCount];
        for (int i = 0; i < playerCount; i++) {
            finalRes[i] = (winning[i] == max) ? 1 : 0;
        }
        return finalRes;
    }
}
