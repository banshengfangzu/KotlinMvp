package com.hazz.kotlinmvp.api;

public class TestFile {
    public static void main(String[] args) {
//        int temp[] = {1, 2, 3, 5, 10, 20, 30};

        int i1 = 1;

        int  beilv;
        int shengchang;

        inner:
        for (
                ; i1 < 76; i1++) {

            double temp=0;
            out:
            for (int i = 0; i < 31; i++) {

                double result = getResult(i, i1);
                if (result <= 1) continue out;
                System.out.println("倍率:" + i + "胜场:" + i1 + "收益倍数:" + result);
                temp=result>temp?result:temp;

                beilv=i;
                shengchang=i1;
            }

        }
    }

    /**
     * @param x 倍率
     * @param y 胜场 以100为总场次
     * @return
     */
    public static double getResult(int x, int y) {
        return Math.pow(0.05 * x + 1, y) * Math.pow(1 - 0.02 * x, 100 - y);
    }
}
