package lesson_1;

public class Task_1 {
    public  static void fibonacci(){
        int[] arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println(arr[i]);
        }
    }

    public static void sumDiagonal() {
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }};
        int s = 0;
        for(int i=0; i<a.length; ++i){
            for(int j=0; j<a[i].length; ++j){
                if(i == j){
                    s += a[i][j];
                }
            }
        }
        System.out.println(s);
    }
}
