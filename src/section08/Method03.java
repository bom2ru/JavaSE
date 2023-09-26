package section08;

public class Method03 {
	public static void main(String[] args) {
		
		printPokemon("001", "아기자기", 700);
		
		String no = "002";
		String name = "수빈";
		int hp = 900;
		
		printPokemon(no, name, hp);
		
		System.out.println("=========================");
		
		printPokemon("001", "아기자기", "물타입");
	}
	
	// 3. 인자 O - 여러개 여러타입 매개변수, 리턴 X
	public static void printPokemon(String no, String name, int hp) {
		System.out.println("No. " + no);
		System.out.println("Name : " + name);
		System.out.println("HP : " + hp);
	}
	
	//
	public static void printPokemon(String no, String name, String type) {
		System.out.println("No. " + no);
		System.out.println("Name : " + name);
		System.out.println("Type : " + type);
		
	}
}
