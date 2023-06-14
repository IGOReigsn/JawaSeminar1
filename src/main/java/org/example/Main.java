package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! Игорь");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
           System.out.println("i = " + i);
        }
    }
}


//-------------------------------------------------------------------------------
/*
import java.util.Random;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i = 't';
        float f = .543f;
        long l;
        double d;
        short sh;
        byte b;
        char ch = 'g';
        boolean b1 = false;

        //---------------------------------

        int[] ints = new int[12];
        Random random = new Random();
        for (int j = 0; j < ints.length; j++) ints[j] = random.nextInt(2000);

        int[] tmp = new int[ints.length + 3];
        System.arraycopy(ints, 0, tmp, 0, ints.length);
        ints = tmp;

        i = 0;
        for (int j = 0, tm = 12; j < 12; j++, tm -= 23, i += j) ;
        System.out.println(i);

        if (b1) System.out.println(b1);

        String str = "РџСЂРёРІРµС‚ РњРёСЂ!";
        str += "?";

        System.out.println(str.substring(1, str.length() - 1));
        System.out.println("HI!".toLowerCase().repeat(3).length());

        Scanner scanner = new Scanner(System.in);

        String s;
        do {
            s = scanner.nextLine();
            System.out.println(s);
        } while (!s.equals("q"));


    }

}*/