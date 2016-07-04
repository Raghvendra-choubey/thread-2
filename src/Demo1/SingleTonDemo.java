package Demo1;

public class SingleTonDemo {
	private static SingleTonDemo singletonA = null;

	private SingleTonDemo() {
	}

	public static SingleTonDemo getObj() {
		if (singletonA == null) {
			singletonA = new SingleTonDemo();
		}
		return singletonA;
	}

	protected int output(int a, int b) {
		return a + b;
	}
}
