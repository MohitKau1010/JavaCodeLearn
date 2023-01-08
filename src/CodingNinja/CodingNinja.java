package CodingNinja;

import java.util.List;
import java.util.Scanner;

public class CodingNinja {


    public void run() {
        Scanner scan = new Scanner(System.in);
        String numb0 = scan.nextLine();
        String numb1 = scan.nextLine();
        String numb2 = scan.nextLine();

        String[] numb11 = numb1.split("");
        String[] numb22 = numb2.split("");

        System.out.println(numb11[1]+numb11[0]);
        System.out.println(numb22[1]+numb22[0]);
    }
}
