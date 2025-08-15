public class randompattern{
    public static void main(String[] args) {
        int a = 8;
        for (int i = 1; i <= a; i++) {
            if (i <= 3) {
                System.out.print(" ");
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } 
            else if (i == 4) {
                System.out.print("* * *      ");
            } 
            else if (i == 5) {
                System.out.print("      * * *");
            } 
            else {
                System.out.print(" ");
                for (int j = 1; j <= (a - i + 1); j++) {
                    System.out.print("*");
                }
            }
            System.out.println(); // ✅ move to next line for each row
        }
    }
}
public class randompattern{
    public static void main(String[] args) {
        int a = 8;
        for (int i = 1; i <= a; i++) {
            if (i <= 3) {
                System.out.print(" ");
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } 
            else if (i == 4) {
                System.out.print("* * *      ");
            } 
            else if (i == 5) {
                System.out.print("      * * *");
            } 
            else {
                System.out.print(" ");
                for (int j = 1; j <= (a - i + 1); j++) {
                    System.out.print("*");
                }
            }
            System.out.println(); // ✅ move to next line for each row
        }
    }
}
public class randompattern{
    public static void main(String[] args) {
        int a = 8;
        for (int i = 1; i <= a; i++) {
            if (i <= 3) {
                System.out.print(" ");
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } 
            else if (i == 4) {
                System.out.print("* * *      ");
            } 
            else if (i == 5) {
                System.out.print("      * * *");
            } 
            else {
                System.out.print(" ");
                for (int j = 1; j <= (a - i + 1); j++) {
                    System.out.print("*");
                }
            }
            System.out.println(); // ✅ move to next line for each row
        }
    }
}
