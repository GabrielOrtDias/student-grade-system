import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        student[] Students = new student[3];

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
                    for (int i = 0; i < 3; i++) {
                        if (Students[i] == null) {
                            Students[i] = new student();
                            scanner.nextLine(); // Limpa o ENTER do nextInt()
                            System.out.println("What's the student name?");
                            Students[i].name = scanner.nextLine();
                            for (int x = 0; x < 3; x++) {
                                System.out.println("register the student grade");
                                Students[i].grade[x] = scanner.nextInt();
                            }
                            break;
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < 3; i++) {
                        if (Students[i] != null && Students[i].name != null){
                            System.out.print(Students[i].name + " ");
                            for (int j = 0; j < 3; j++) {
                                System.out.print(Students[i].grade[j]+ " ");
                            }
                            System.out.println("\n");
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < 3; i++) {
                        if (Students[i] != null) {
                            System.out.print(Students[i].name + " average grade: ");
                            double average = (Students[i].grade[0] + Students[i].grade[1] + Students[i].grade[2])/3.0;
                            System.out.print(average + "\n");
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
