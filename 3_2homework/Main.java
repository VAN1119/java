/* public class Main {
	public static void main(String[] args) {
		Transferable sw = new Switch();
		Transferable ro = new Router();
		
		sw.transfer();
		ro.transfer();
	}
} */
public class Main {
	public static void main(String[] args) {
		Transferable[] parts = {
			new Switch(),
			new Router()
		};
		for (Transferable work : parts) {
			work.transfer();
		}
	}
}