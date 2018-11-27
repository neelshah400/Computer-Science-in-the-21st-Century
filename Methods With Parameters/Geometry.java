import java.util.Scanner;

public class Geometry{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		//Rectangle
		System.out.print("Enter the length of a rectangle: ");
		double LengthRectangle = neel.nextDouble();
		System.out.print("Enter the width of a rectangle: ");
		double WidthRectangle = neel.nextDouble();

		System.out.println("Area of rectangle: " + AreaRectangle(LengthRectangle, WidthRectangle));
		System.out.println();
		//Square
		System.out.print("Enter the side length of a square: ");
		double SideSquare = neel.nextDouble();

		System.out.println("Perimeter of square: " + PerimeterSquare(SideSquare));
		System.out.println();
		//Triangle
		System.out.print("Enter the base length of a triangle: ");
		double BaseTriangle = neel.nextDouble();
		System.out.print("Enter the height of a triangle: ");
		double HeightTriangle = neel.nextDouble();

		System.out.println("Area of triangle: " + AreaTriangle(BaseTriangle, HeightTriangle));
		System.out.println();
		//Circle 1
		System.out.print("Enter the diameter of a circle: ");
		double CircleDiameter = neel.nextDouble();

		System.out.println("Circumference of circle: " + CircleCircumference1(CircleDiameter));
		System.out.println();
		//Circle 2
		System.out.print("Enter the radius of a circle: ");
		double CircleRadius = neel.nextDouble();

		System.out.println("Circumference of circle: " + CircleCircumference2(CircleRadius));
		System.out.println();

	}

	public static double AreaRectangle(double LengthRectangle, double WidthRectangle){

		double AreaRectangle = ((double)(Math.round((LengthRectangle * WidthRectangle) * 100)) / 100);
		return AreaRectangle;

	}

	public static double PerimeterSquare(double SideSquare){

		double PerimeterSquare = ((double)(Math.round((SideSquare * 4) * 100)) / 100);
		return PerimeterSquare;

	}

	public static double AreaTriangle(double BaseTriangle, double HeightTriangle){

		double AreaTriangle = ((double)(Math.round((0.5 * BaseTriangle * HeightTriangle) * 100)) / 100);
		return AreaTriangle;

	}

	public static double CircleCircumference1(double CircleDiameter){

		double CircleCircumference1 = ((double)(Math.round((3.14 * CircleDiameter) * 100)) / 100);
		return CircleCircumference1;

	}

	public static double CircleCircumference2(double CircleRadius){

		double CircleCircumference2 = ((double)(Math.round((3.14 * 2.0 * CircleRadius) * 100)) / 100);
		return CircleCircumference2;

	}

}