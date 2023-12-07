package practice1121;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// obj1 = new String();
		/*
		MyClass m = new MyClass();
		System.out.println(m.toString());
		*/
		/*
		Object obj1 = new Object();
		Object obj2 = new Object(); //둘 다 false 값 출력
		
		String obj1 = new String();
		String obj2 = new String(); // equals는 true 값 출력
		
		Object obj1 = new String("Hi");
		Object obj2 = new String("Hi");//자식이 출력
		
		Object obj1 = new MyClass(123);
		Object obj2 = new MyClass(123); 
		
		System.out.println(obj1 == obj2); 
		System.out.println(obj1.equals(obj2)); 
		 */
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		Key k1 = new Key(1);
		Key k2 = new Key(1);
							
		//System.out.println(k1.equals(k2));
		
		hashMap.put(k1, "HongGilDong");
		String value = hashMap.get(k2);
		System.out.println(value);
	}

}
