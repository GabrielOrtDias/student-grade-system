public class Student {
    String name;
    int[] grade = new int[3];

    double getAverage()  {
        return (grade[0] + grade[1] + grade[2]) / 3.0;
    }

    void getGrades() {
        if(name != null){
            System.out.print(name + " grades: ");
            for (int i = 0; i < 3; i++) {
                System.out.print(grade[i] + " ");
            }
            System.out.println("\n");
        }
    }
}
