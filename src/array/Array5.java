package array;

public class Array5 {
	    public static void main(String[] args) {
	       //��ʼ����ά���飬
	       int[][] a = new int[2][3]; //������һά���飬ÿ��һά����ĳ�����3
	       a[1][2] = 5;  //����ֱ�ӷ���һά���飬��Ϊ�Ѿ������˿ռ�
	          
	       //ֻ�����˶�ά����
	       int[][] b = new int[2][]; //������һά���飬ÿ��һά����ĳ�����δ����
	       b[0]  =new int[3]; //�������ȷ��䳤�ȣ��ſ��Է���
	       b[0][2] = 5;
	        
	       //ָ�����ݵ�ͬʱ������ռ�
	       int[][] c = new int[][]{
	               {1,2,4},
	               {4,5},
	               {6,7,8,9}
	       };
	 
	    
	}
}