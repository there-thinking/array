package array;

public class Array1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
         
        System.out.println("�����еĸ����������:");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
         
        System.out.println("����ϰ��Ŀ���ǣ��ҳ���С��һ��ֵ: ");
        
        for(int j = 0; j<(a.length-1); j++) {
        	if(a[j] < a[j+1]) {
        		int b = a[j];
        		a[j+1] =b;
        	}
        }
        System.out.println(a[a.length-1]);
    }
}
