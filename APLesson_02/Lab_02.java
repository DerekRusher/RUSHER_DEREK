public class Lab_02 
{
	public static void main(String[]args)
	{
		int a = 3;
		int b = 7;
		int AB = (3 * 7);
		
		System.out.println(a + " multiplied by " + b + " is " + AB);
		
		String Name = "Martin Thomas";
		String address = "413 Generic Street";
		String City = "LOLAR";
		String zip = "00612.";
		
		System.out.println(Name + "\n" + address + "\n" + City + ", " + zip);
		
		int Length = 6;
		int Height = 7;
		int Width = 8;
		int LH = Length*Height*2;
		int LW = Length*Width*2;
		int HW = Height*Width*2;
		int SA = LH + LW + HW;
		
		System.out.println("The surface area of your rectangle is " + SA);
	}
}