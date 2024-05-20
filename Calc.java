import java.util.*;

interface Calc{
	int cal(int a, int b);
}
class Test implements Calci{
	public int cal(int a,int b){
		return a+b;
	}
}

class CalcDriver{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Elements");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Test t1=new Test();// Upcasting
		System.out.println(t1.cal(a,b));
		System.out.println();
	}
}