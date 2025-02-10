package 수업.Day02;

public class Array04_순차검색 {
    public static void main(String[] args) {
        int[] arr = {4,6,2,9,13,24};    // 정렬 X
        int N = arr.length;
        int key = 2;

        System.out.println(searchWhileNoSort(arr, key, N));

    }

    static int searchWhileNoSort(int[] arr, int key, int N){
        int i=0;
        while(i<N && arr[i]!=key){
            i++;
        }
        if(i<N) return i;
        else return -1;

    }
}
