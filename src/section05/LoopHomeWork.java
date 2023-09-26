package section05;

public class LoopHomeWork {

	public static void main(String[] args) {

		for (int k = 0; k < 3; k++) {
			System.out.println("k = " + k);
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 3; j++) {
					int dan = j + 2;
					int num = i + 1;

					if (dan > 9)
						break;
					System.out.print(dan + "x" + num + "=" + dan * num + "\t");
				}
				System.out.println(); // 개행
			}
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 3; j++) {
				int dan = j + 2;
				int num = i + 1;

				if (dan > 9)

					System.out.print(dan + "x" + num + "=" + dan * num + "\t");
			}
			System.out.println(); // 개행
		}
		System.out.println();
	}

}

//		for(int i = 0; i < 7; i++){
//			for(int j = 0; j < 7; j++) {
//				if(i < 4) {
//					if (i + j < 3) {
//						System.out.print(" ");
//					} else if(j - i > 3) {
//						System.out.print(" ");
//					} else {
//						System.out.print("*");
//					} 
//				} else {
//					if (i - j > 3) {
//						System.out.println(" ");
//					} else if ( i + j > 9) {
//						System.out.println(" ");
//					} else {
//						System.out.println("*");
//					}
//				}
//			}
//			System.out.println(); //개행
//		}
//	}	
//}
