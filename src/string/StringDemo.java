package string;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String();
		String s2 = "abc";
		char[] chararray = {'a', 'e', 'i', 'o', 'u'};
		String s3 = new String(chararray);
		System.out.println(s1);
		System.out.println(s2);
		int i = 123;
		System.out.println(s2.concat(" def"));
		s2 = s2.concat(" def");
		System.out.println(s2);
		System.out.println(String.valueOf(123));
		System.out.println(String.valueOf(123.345));
		System.out.println(String.valueOf('c'));
		
	}
	
}
