
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int ran1 = (int) (Math.random() * lim);
		int ran2 = (int) (Math.random() * lim);
		int ran3 = (int) (Math.random() * lim);
		int max = Math.max(ran1, Math.max(ran2, ran3));
		int min = Math.min(ran1, Math.min(ran2, ran3));
		int mid = (ran1 + ran2 + ran3) - (min + max);
		System.out.println(ran1 + " " + ran2 + " " + ran3 + "\n" + min + " " + mid + " " + max);
	}
}
