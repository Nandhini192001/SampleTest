package student_package;
class ArthimeticOperation{
	public int add(int a,int b){
		System.out.println("addition");
		return a+b;
		
	}
}
public class Test {
	public static void main(String args[]) {
		ArthimeticOperation addObj= new ArthimeticOperation();
		addObj.add(10,20);
		
	}
}
