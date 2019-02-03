import java.util.Scanner; 

public class ArrayDemo {
	public static void main (String[] args){
		int maxSize = 5;
		String[] name = new String[maxSize];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < maxSize; i++){
			System.out.print("Please enter a name:");
			name[i] = sc.nextLine();
		}


		for (int i = 0; i < name.length; i++)
		System.out.println("Hello " + name[i] + "!");
	}
}