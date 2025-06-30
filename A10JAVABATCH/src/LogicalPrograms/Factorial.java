package LogicalPrograms;

public class Factorial {
	static void disp()
	{
		int no=4;
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact =fact*i;
		}
		System.out.println(fact);
	}
public static void main(String[] args) {
	disp();
}
}
