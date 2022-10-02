import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		management m=new management();
		m.init(10);
		System.out.print("ÇëÊäÈë²éÕÒµÄËŞÉáºÅ£º");
		int room=in.nextInt();
		in.close();
		m.search(room);
	}
}