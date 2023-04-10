import java.util.Scanner;

public class Main {

    final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args)   {
        getInput();
    }
    public static void getInput() {
        System.out.println("Enter n :");
        int n = scanner.nextInt();
        int[] arr_numbers = new int[n];
        String[] arr_string = new String[n];
        System.out.println("Enter numbers :");
        for(int i=0;i<n;i++){
            arr_numbers[i] = scanner.nextInt();
        }
        System.out.println("Enter strings");

        for(int i=0;i<n;i++){
            arr_string[i] = scanner.next();
        }

        scanner.close();

        displayOutput(arr_numbers,arr_string);


    }

    private static void displayOutput(int[] arrNumbers, String[] arrString) {
        System.out.println("Displaying numbers");
        for(int k:arrNumbers){
            System.out.println(k);
        }
        System.out.println("Displaying strings");
        for (String s:arrString){
            System.out.println(s);
        }
    }
}