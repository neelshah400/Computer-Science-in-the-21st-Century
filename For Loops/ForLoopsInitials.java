public class ForLoopsInitials{
	public static void main(String[]args){

		// Row 1
		for(int a = 1; a < 67; a++){
			if(a==1||a==20||(a>23&&a<44)||(a>46&&a<67))
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
		// Rows 2 - 9
		for(int gap = 2; gap < 10; gap++){
			for(int a = 1; a < 67; a++){
				if(a==1||a==20||a==24||a==gap||a==47||a==66||(gap==7&&(a==53||a==59)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		// Row 10
		for(int gap = 10; gap < 11; gap++){
			for(int a = 1; a < 67; a++){
				if(a==1||a==20||(a>23&&a<44)||a==gap||a==47||a==66||a == 56)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		// Row 11 - 19
		for(int gap = 11; gap < 20; gap++){
			for(int a = 1; a < 67; a++){
				if(a==1||a==20||a==43||a==gap||a==47||a==66||(gap==13&&(a>52&&a<60)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		// Row 20
		for(int a = 1; a < 67; a++){
			if(a==1||a==20||(a>23&&a<44)||(a>46&&a<67))
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println("\n");
	}
}