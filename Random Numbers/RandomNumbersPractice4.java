public class RandomNumbersPractice4{
	public static void main(String[]args){

		int random = (int)(Math.random()*999501)+500;
		int days = (random / 86400);
		int hours = ((random % 86400) / 3600);
		int minutes = (((random % 86400) % 3600) / 60);
		int seconds = ((((random % 86400) % 3600) % 60));

		System.out.println("Total seconds: " + random);
		System.out.println(days + " days : " + hours + " hours : " + minutes + " minutes : " + seconds + " seconds");


	}
}