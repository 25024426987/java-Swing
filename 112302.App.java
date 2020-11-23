package pac;

public class App1 {
	public static void main(String[] args) throws InterruptedException {
		int arr[][] = {
				{77,88},{4,6},{554,800},{444,9}
		};
		while (true) {
			Thread.sleep(1000);
			System.out.println("一秒已经过去了！");
			int rdm = (int)(Math.random()*10%4);
			System.out.println(arr[rdm][0]+","+arr[rdm][1]);
		}
	}
}
