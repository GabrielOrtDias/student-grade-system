import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] names = new String[3];
        int[][] grade = new int[3][3];


        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("\nStudent Register");
            System.out.println("1. register new student?");
            System.out.println("2. visualize students grade?");
            System.out.println("3. visualize students average grade?");
            System.out.println("4. close");
            int choice = scanner.nextInt();
            switch (choice) {

                case 1:
                    scanner.nextLine();
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] == null) {
                            System.out.println("what's the student name?");
                            names[i] = scanner.nextLine();
                            for (int x = 0; x < 3; x++) {
                                System.out.println("register the student grade");
                                grade[i][x] = scanner.nextInt();
                            }
                            break;
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < names.length; i++) {
                        if(names[i] != null) {
                        System.out.print(names[i]+ " ");
                        for (int j = 0; j < 3; j++) {
                                System.out.print(grade[i][j]+ " ");
                            }
                            System.out.println("\n");
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] != null) {
                            System.out.println(names[i] + " average grade: ");
                            double average = (grade[i][0] + grade[i][1] + grade[i][2])/3.0;
                            System.out.print(average);
                        }
                    }
                    break;

                case 4:
                    scanner.close();
                    return;
            }
        }
    }
}
