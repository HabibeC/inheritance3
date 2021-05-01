public class StudentManager {
    public void takeAttendance(Student[] students) {
        for (Student student : students) {
            if (student.isRollCall() == true) {
                System.out.println(student.getName() + " Yoklamanız alındı. Derse dönebilirsiniz.");
            }
        }
    }

}
