package array;

public class Array3{
    public static void main(String[] args) {
        int values [] = new int[]{18,62,68,82,65,9};
        //�������
        for (int i = 0; i < values.length; i++) {
			int each = values[i];
			System.out.println(each);
		}
        
        //��ǿ��forѭ������
        for (int each : values) {
			System.out.println(each);
		}
        
    }
}

