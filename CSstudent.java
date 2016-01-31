public class CSstudent{
	int ayyy;
	String lmao;
	String[] slang;
	public CSstudent(int a, String l){
		this.ayyy = a;
		this.lmao = l;
		slang = new String[]{"I should download more RAM.","Lol im gunna h@ck the FBI","Get turnt at S0da hall!"};
		
	}
	public CSstudent(int a, String l, String[] alakazam){
		this.ayyy = a;
		this.lmao = l;
		slang = alakazam;
	}
	public String getLmaoed(){
		String bape = this.lmao;
		for(String statement : slang){
			System.out.println(statement);
		}
		return bape + " got schwoopified"; 
	}
}