package section07;

public class Var02 {
	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card();
		
		System.out.println("card1 type: " + card1.type);
		System.out.println("card1 num: " + card1.num);
		System.out.println("card1 width: " + card1.width);
		System.out.println("card1 height: " + card1.height);
		
		System.out.println("card2 type: " + card2.type);
		System.out.println("card2 num: " + card2.num);
		System.out.println("card2 width: " + card2.width);
		System.out.println("card2 height: " + card2.height);
		
		System.out.println("======================================");
		
		card1.num = "K";
		card1.width = 72;
		
		System.out.println("card1 type: " + card1.type);
		System.out.println("card1 num: " + card1.num);
		System.out.println("card1 width: " + card1.width);
		System.out.println("card1 height: " + card1.height);
		
		System.out.println("card2 type: " + card2.type);
		System.out.println("card2 num: " + card2.num);
		System.out.println("card2 width: " + card2.width);
		System.out.println("card2 height: " + card2.height);
	}
}
