public class DrawABee {
	boolean sting = true;
	public static void main(String[] args) {
		System.out.println("a bee!!");
		String james = "James Franco"; // quality initialization
		if(args.length > 0){
			james = args[0];
		}
		DrawABee buzz = new DrawABee();
		buzz.getStung(5, james);
		System.out.println("Baop");
	}
	public void getStung(int times, String victim){
		if(!sting){
			throw new NullPointerException("ayyy lmao");
		}
		for(int i = 0; i < times; i++){
			System.out.println(victim + " got stung!");
		}
	}
}
