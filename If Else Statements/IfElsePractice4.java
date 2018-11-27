public class IfElsePractice4{
	public static void main(String[]args){

		int weighta = weight();
		boolean movinga = moving();
		System.out.print("A ");
		System.out.print(weighta);
		System.out.print(" pound person with ");
		System.out.print(movinga == true ? "an active lifestyle" : "a sedentary lifestyle");
		System.out.print(" should eat ");
		System.out.print(calories(movinga, weighta));
		System.out.print(" calories each day.");
		System.out.print("\n\n");
	}

	public static int weight(){

		int weight = ((int)(Math.random()*211)+70);
		return weight;

	}

	public static boolean moving(){

		boolean move;
		move = true;
		if((int)(Math.random()*2)+1 == 1)
			move = true;
		else
			move = false;
		return move;

	}

	public static int calories(boolean movinga, int weighta){

		int cals;
		if(movinga == true)
			cals = (15 * weighta);
		else
			cals = (13 * weighta);
		return cals;

	}

}