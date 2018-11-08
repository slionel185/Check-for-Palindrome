import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String temp = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            temp = temp + input.charAt(i);
        }

        if(input.equals(temp)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
