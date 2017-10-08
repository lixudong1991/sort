package cn.lxd.sort;

/**
 * Created by Tomcat on 2017/10/8.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr={6,3,7,9,1,0,8,2,4,5};
        for(int i:arr){
            System.out.print(i);
        }
        System.out.println();
        //insertSort(arr);
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i);
        }
    }
    /*
    直接插入排序
     */
    public static void insertSort(int[] argv){
        for (int j = 1; j < argv.length; j++) {
            int key=argv[j];
            int i=j-1;
            while (i>-1&&argv[i]>key){
                argv[i+1]=argv[i];
                i--;
            }
            argv[i+1]=key;
        }
    }
    /*
    冒泡排序
     */
    public static void bubbleSort(int[] argv){
        int tem=0;
        for (int j = argv.length-1; j >0 ; j--) {
            for (int i = 0; i <j ; i++) {
                if(argv[i]>argv[i+1]){
                    tem=argv[i];
                    argv[i]=argv[i+1];
                    argv[i+1]=tem;
                }
            }
        }
    }
}
