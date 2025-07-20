import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] Learner = new Student[3];

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
                        if (Learner[i] == null) {
                            Learner[i] = new Student();
                            scanner.nextLine(); // Limpa o ENTER do nextInt()
                            System.out.println("What's the student name?");
                            Learner[i].name = scanner.nextLine();
                            for (int x = 0; x < 3; x++) {
                                System.out.println("register the student grade");
                                Learner[i].grade[x] = scanner.nextInt();
                            }
                            break;
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < 3; i++) {
                        if (Learner[i] != null && Learner[i].name != null){
                            Learner[i].getGrades();
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < 3; i++) {
                        if (Learner[i] != null) {
                            System.out.println(Learner[i].name + " average grade: " + Learner[i].getAverage());
                        }
                    }
                    break;

                case 4:
                    scanner.close();
                    return;

                default:
                    System.out.println("invalid option");
                    break;
            }
        }

    }
}
