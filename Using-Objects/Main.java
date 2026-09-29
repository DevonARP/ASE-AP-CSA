public class Main {
    
  public static void main(String args[]) {
      
    Student studentA = new Student("Maya", 11, 3.7);
    
    studentA.printProfile();
    
}

    static public class Student {
        private String name;
        private int gradeLevel;
        private double gpa;
    
        public Student(String studentName, int studentGrade, double studentGpa) {
            name = studentName;
            gradeLevel = studentGrade;
            gpa = studentGpa;
        }
    
        public void printProfile() {
            System.out.println(name + ", grade " + gradeLevel
                    + ", GPA " + gpa);
        }
    
        public void updateGpa(double newGpa) {
            gpa = newGpa;
        }
}

}

