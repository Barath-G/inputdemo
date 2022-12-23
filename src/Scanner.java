import java.io.InputStream;
import java.util.Scanner;
class Demo{
    public Scanner(InputStream in) {
    }

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name");

        String name = scanner.nextline();

        System.out.println("Hello" + name);

    }
}