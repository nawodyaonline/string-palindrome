import java.util.Scanner;

class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.next();

        int lenght = value.length();
        String character = null;      
        
        for (int x = lenght - 1; x >= 0; x--) {
            character = character + value.charAt(x);
        }
        String real = character.substring(4);

        if(value.equals(real))
            System.out.println("This is a palindrom");
        
        else
            System.out.println("this is not a palindrome");

    }
}