import java.util.Scanner;

public class Physics{
	public static void main(String[]args){

	Scanner neel = new Scanner(System.in);

	//Penny
	System.out.print("Enter the time (s) the penny is in the air: ");
	double PennyT = neel.nextDouble();
	System.out.print("Enter the height (m) of the building: ");
	double PennyB = neel.nextDouble();
	System.out.println("Height of penny: " + PennyH(PennyT, PennyB) + " m");
	System.out.println();

	//Projectile
	System.out.print("Enter the initial velocity (m/s) of a projectile: ");
	double ProjectileV0 = neel.nextDouble();
	System.out.print("Enter the time (s) that has elapsed: ");
	double ProjectileT = neel.nextDouble();
	System.out.println("Velocity of projectile: " + ProjectileV(ProjectileV0, ProjectileT) + " m/s");
	System.out.println();

	//Particle
	System.out.print("Enter the initial time (s) of the particle: ");
	double ParticleA = neel.nextDouble();
	System.out.print("Enter the final time (s) of the particle: ");
	double ParticleB = neel.nextDouble();
	System.out.print("Enter the initial position (m) of the particle: ");
	double ParticleX1 = neel.nextDouble();
	System.out.print("Enter the final position (m) of the particle: ");
	double ParticleX2 = neel.nextDouble();
	System.out.println("Average velocity of particle: " + ParticleV(ParticleA, ParticleB, ParticleX1, ParticleX2) + " m/s");
	System.out.println();

	}

	//Penny
	public static double PennyH(double PennyT, double PennyB){

		double PennyH = ((-4.9 * PennyT * PennyT) + PennyB);
		return PennyH;

	}

	//Projectile
	public static double ProjectileV(double ProjectileV0, double ProjectileT){

		double ProjectileV = (ProjectileV0 - (9.8 * ProjectileT));
		return ProjectileV;

	}

	//Particle
	public static double ParticleV(double ParticleA, double ParticleB, double ParticleX1, double ParticleX2){

		double ParticleV = ((ParticleX2 - ParticleX1) / (ParticleB - ParticleA));
		return ParticleV;

	}

}