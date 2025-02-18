package 문제정리;

import java.util.Scanner;

class aaaaa {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for(int tc = 1; tc <= T; tc++) {
        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        

        int[] x = {-1,1, 0,0};
        int[] y = { 0,0,-1,1};

        int[] cntArr = new int [N*N];
        int arrCnt = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {

                int cnt = 1;
                int min2 = arr[i][j];
                int l = i;
                int p = j;
                while(true) {
                    int tmpx = 0;
                    int tmpy = 0;
                    boolean aaa = false;
                    for(int k = 0; k < 4; k++) {
                        if(x[k] + l < 0 || x[k] + l >= N
                        || y[k] + p < 0    || y[k] + p    >= N) {
                            continue;
                        }
                        if(min2 > arr[l + x[k]][p + y[k]]) {
                            min2 = arr[l + x[k]][p + y[k]];
                            tmpx = x[k];
                            tmpy = y[k];
                            aaa = true;
                        }
                    }
                    if(aaa == true) {
                        l += tmpx;
                        p += tmpy;
                        min2 = arr[l][p];
                        cnt++;
                    }else if(aaa == false) {
                        break;
                    }
                }
                cntArr[arrCnt++] = cnt;
            }
        }
        int max = 0;
        for(int i = 0; i < cntArr.length; i++) {
            if(max < cntArr[i]) {
                max = cntArr[i];
            }
        }

        System.out.println("#" + tc + " " + max);
    }


}
}


