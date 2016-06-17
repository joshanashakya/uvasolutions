package online.uva.medium;

import java.util.Scanner;

public class LoveCalculator10424 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            System.out.format(
                    "%.2f",
                    calculate(sc.nextLine().replaceAll("[^A-Za-z]", "").toLowerCase(),
                            sc.nextLine().replaceAll("[^A-Za-z]", "").toLowerCase()));
            System.out.println(" %");
        }
        sc.close();
    }

    private static double calculate(String name1, String name2) {
        char[] charName1 = name1.toCharArray();
        char[] charName2 = name2.toCharArray();
        System.out.println(name1 + " " + name2);
        int charValue1 = getValue(charName1);
        int charValue2 = getValue(charName2);
        if (charValue1 < charValue2)
            return ((double) charValue1 / charValue2) * 100;
        else
            return ((double) charValue2 / charValue1) * 100;
    }

    private static int getValue(char[] charName) {
        int sum = 0;
        for (char ch : charName) {
            sum = sum + getCharValue(ch);
            System.out.print(getCharValue(ch) + " ");
        }

        // aadsfdmkxvczp[we
        // amcsfdfapioeur123 132124

        System.out.println(sum);
        int total = 0;
        while (sum != 0) {
            int rem = sum % 10;
            total = total + rem;
            sum = sum / 10;
        }
        int ptotal = 0;
        while (total != 0) {
            int rem = total % 10;
            ptotal = ptotal + rem;
            total = total / 10;
        }
        // System.out.println(ptotal);
        return ptotal;
    }

    private static int getCharValue(char ch) {
        switch (ch) {
        case 'a':
            return 1;
        case 'b':
            return 2;
        case 'c':
            return 3;
        case 'd':
            return 4;
        case 'e':
            return 5;
        case 'f':
            return 6;
        case 'g':
            return 7;
        case 'h':
            return 8;
        case 'i':
            return 9;
        case 'j':
            return 10;
        case 'k':
            return 11;
        case 'l':
            return 12;
        case 'm':
            return 13;
        case 'n':
            return 14;
        case 'o':
            return 15;
        case 'p':
            return 16;
        case 'q':
            return 17;
        case 'r':
            return 18;
        case 's':
            return 19;
        case 't':
            return 20;
        case 'u':
            return 21;
        case 'v':
            return 22;
        case 'w':
            return 23;
        case 'x':
            return 24;
        case 'y':
            return 25;
        case 'z':
            return 126;
        }
        return 0;
    }
}
