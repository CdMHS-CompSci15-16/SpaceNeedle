//By Ryan Chan
//CDM AP Computer Science 2015
public class SpaceNeedleMain {
	final static int SPACE_NEEDLE_SCALE=4;
	public static void main(String[] args) {
		needle();
		top();
		bot();
		bar();
		top();
	}
	public static void needle(){
		for (int i=1;i<=SPACE_NEEDLE_SCALE;i++){
			for (int j=1;j<=3*SPACE_NEEDLE_SCALE;j++){
				System.out.print(" ");
			}
			System.out.println("||");
		}
	}
	public static void top(){
		for (int i=1;i<=SPACE_NEEDLE_SCALE;i++){
			for (int j=1;j<=SPACE_NEEDLE_SCALE*3-(i*3);j++){
				System.out.print(" ");
			}
			System.out.print("__/");
			for (int j=1;j<=(i-1)*3;j++){
				System.out.print(":");
			}
			System.out.print("||");
			for (int j=1;j<=(i-1)*3;j++){
				System.out.print(":");
			}
			System.out.print("\\__");
			System.out.println();
		}
		System.out.print("|");
		for (int i=1;i<=SPACE_NEEDLE_SCALE*6;i++){
			System.out.print("\"");
		}
		System.out.println("|");
	}
	public static void bot(){
		for (int i=1;i<=SPACE_NEEDLE_SCALE;i++){
			for (int j=1;j<=(i-1)*2;j++){
				System.out.print(" ");
			}
			System.out.print("\\_");
			for (int j=1;j<=(3*SPACE_NEEDLE_SCALE+1)-2*i;j++){
				System.out.print("/\\");
			}
			System.out.println("_/");
		}
	}
	public static void bar(){
		for(int i=1;i<=SPACE_NEEDLE_SCALE;i++){
			for(int j=1;j<=SPACE_NEEDLE_SCALE*3;j++){
				System.out.print(" ");
			}
			System.out.println("||");
		}
		for (int i=1;i<=SPACE_NEEDLE_SCALE*4;i++){
			for (int j=1;j<=SPACE_NEEDLE_SCALE*3-3;j++){
				System.out.print(" ");
			}
			System.out.println("|%%||%%|");
		}
	}
}
