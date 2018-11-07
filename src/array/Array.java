package array;

public class Array {
    public static void main(String[] args) {
        //声明一个引用
        int[] a;
        //创建一个长度是5的数组，并且使用引用a指向该数组
        a = new int[5];
         
        int[] b = new int[5]; //声明的同时，指向一个数组
        
        a[0]= 1;  //下标0，代表数组里的第一个数
        a[1]= 2;
        a[2]= 3;
        a[3]= 4;
        a[4]= 5;
        
        System.out.println(a.length); //打印数组的长度
    }
}