package Demo1;
class Runner extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++){	
			System.out.println("hello " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
	
	
}
public class App {

	public static void main(String[] args) {
	
		Runner r1 = new Runner();
		r1.start();
		
		Runner r2 = new Runner();
		r2.start();
			
	}

}
