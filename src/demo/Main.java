package demo;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer integer_1=1;
		Integer integer_2=2;
		Integer integer_3=3;
		Integer integer_4=1;
		Integer integer_5=128;
		Integer integer_6=128;
		Long long_1=3l;
		Double double_1=27.0;
		Double double_2=27.0;
		
		System.out.println(integer_1==integer_4);
		System.out.println(integer_5==integer_6);
		System.out.println(integer_3==(integer_1+integer_2));
		System.out.println((integer_1+integer_2)==long_1);
		System.out.println(long_1.equals(integer_1));
		System.out.println(double_1==double_2);
	}
}
