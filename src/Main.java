public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Habibe");
        student1.setMail("habibe@gmail.com");
        student1.setPassword("123");
        student1.setRollCall(true);

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Hasan");
        //student2.setRollCall(false);

        Instructor instructor1 = new Instructor();
        instructor1.setName("Engin Demirog");

        UserManager userManager = new UserManager();
        User[] users = {student1, instructor1};
        userManager.addMultiple(users);
        userManager.login(student1.getMail(), student1.getPassword());

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addLesson("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)");
        instructorManager.addLesson("Yazılım Geliştirici Yetiştirme Kampı (Java + REACT)");
        instructorManager.addLesson("Programlamaya Giriş İçin Temel Kurs");


        StudentManager studentManager = new StudentManager();
        Student[] students = {student1, student2};

        studentManager.takeAttendance(students);


    }
}
