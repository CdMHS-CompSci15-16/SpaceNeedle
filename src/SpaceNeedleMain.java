//By Ryan Chan
//CDM AP Computer Science 2015
//10/7/2015
public class SpaceNeedleMain {
	final static int SPACE_NEEDLE_SCALE=4;		//Scale variable
	public static void main(String[] args) {
		needle();		//Prints the thin needle at the top
		top();			//Prints the upper portion of the disc
		bot();			//Prints the bottom portion of the disc
		bar();			//Prints the bar connecting the disc to the base
		top();			//Prints the base of the space needle
	}
	public static void needle(){	//Prints the thin needle at the top
		for (int i=1;i<=SPACE_NEEDLE_SCALE;i++){		//Adjusts needle length depending on scale
			for (int j=1;j<=3*SPACE_NEEDLE_SCALE;j++){	//Aligns needle depending on scale
				System.out.print(" ");
			}
			System.out.println("||");
		}
	}
	public static void top(){		//Prints the upper portion of the disc, can also be used as the base
		for (int i=1;i<=SPACE_NEEDLE_SCALE;i++){	//Adjusts the number of rows based on scale
			for (int j=1;j<=SPACE_NEEDLE_SCALE*3-(i*3);j++){	//Aligns the disc based on scale and line number
				System.out.print(" ");
			}
			System.out.print("__/");
			for (int j=1;j<=(i-1)*3;j++){		//Adjusts the number of interior colons depending on the row
				System.out.print(":");
			}
			System.out.print("||");
			for (int j=1;j<=(i-1)*3;j++){		//Adjusts the number of interior colons depending on the row
				System.out.print(":");
			}
			System.out.println("\\__");			//Right boundary and carriage return
		}
		System.out.print("|");
		for (int i=1;i<=SPACE_NEEDLE_SCALE*6;i++){	//Adjusts the length of the bottom row based on scale
			System.out.print("\"");
		}
		System.out.println("|");
	}
	public static void bot(){	//Prints the bottom portion of the disc
		for (int i=1;i<=SPACE_NEEDLE_SCALE;i++){	//Adjusts the number of rows based on scale
			for (int j=1;j<=(i-1)*2;j++){			//Aligns disc based on row number
				System.out.print(" ");
			}
			System.out.print("\\_");
			for (int j=1;j<=(3*SPACE_NEEDLE_SCALE+1)-2*i;j++){	//Adjusts the length of /\ in a row depending on scale and line number
				System.out.print("/\\");
			}
			System.out.println("_/");	//Right boundary and carriage return
		}
	}
	public static void bar(){	//Prints the bar connecting the disc to the base
		needle();	//Prints the thin bar extending from the bottom of the disc
		for (int i=1;i<=SPACE_NEEDLE_SCALE*SPACE_NEEDLE_SCALE;i++){	//Adjusts vertical bar length depending on scale
			for (int j=1;j<=SPACE_NEEDLE_SCALE*3-(SPACE_NEEDLE_SCALE-1);j++){	//Aligns the bar based on scale
				System.out.print(" ");
			}
			System.out.print("|");
			for (int j=1;j<=SPACE_NEEDLE_SCALE-2;j++){	//Adjusts the number of interior %'s based on scale
				System.out.print("%");
			}
			System.out.print("||");
			for (int j=1;j<=SPACE_NEEDLE_SCALE-2;j++){	//Adjusts the number of interior %'s based on scale
				System.out.print("%");
			}
			System.out.println("|");
		}

	}
}
