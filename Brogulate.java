public class Brogulate {
	public static void main(String[] args) {
		System.out.println("Brogulators!!");
		CSstudent timmy;
		if(args.length > 0){
			timmy = new CSstudent(5, "timmayy", args);
		}
		else{
			timmy = new CSstudent(5, "timmayy");	
		}
		String zinger = timmy.getLmaoed();
		System.out.println("\n"+ zinger + "\n");
	}
}