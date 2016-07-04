package Demo1;

public class App1 {

	public static void main(String[] args) {
			
		SingleTonDemo s1 = SingleTonDemo.getObj();
		int c = s1.output(10, 4);
		System.out.println(c);
	}

}
