
public class Test04 {
	static final double PI = 3.141592;
	public static void main(String[] args) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			double sq = ��(a, b,c ) ;
			System.out.println("�Է��� �簢���� ���̴�"+ sq);
			double rd = round(a,b, c);
			System.out.println("�Է��� �簢���� �ѷ��� " + rd);
			
			}

	private static double round(int a, int b, int c) {
		double rd = (a+b+c)*2*PI;
		return rd;
	
	
	}

	private static double ��(int a, int b, int c) {
		
		double sq = a*b*c;
		return sq;
		
	}

	
	}


