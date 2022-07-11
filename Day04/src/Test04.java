
public class Test04 {
	static final double PI = 3.141592;
	public static void main(String[] args) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			double sq = 엄(a, b,c ) ;
			System.out.println("입력한 사각형의 넓이는"+ sq);
			double rd = round(a,b, c);
			System.out.println("입력한 사각형의 둘레는 " + rd);
			
			}

	private static double round(int a, int b, int c) {
		double rd = (a+b+c)*2*PI;
		return rd;
	
	
	}

	private static double 엄(int a, int b, int c) {
		
		double sq = a*b*c;
		return sq;
		
	}

	
	}


