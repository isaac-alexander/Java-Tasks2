// 14. Write a Java program to create a class called "School"
// with attributes for students, teachers, and classes,
// and methods to add and remove students and teachers,
// and to create classes.

public class Task14School {

    // Static inner class Student
    static class Student {
        String name;

        // Constructor to set student name
        Student(String name) {
            this.name = name;
        }
    }

    // Static inner class Teacher
    static class Teacher {
        String name;

        // Constructor to set teacher name
        Teacher(String name) {
            this.name = name;
        }
    }

    // Static inner class ClassRoom
    static class ClassRoom {
        String className;

        // Constructor to set class name
        ClassRoom(String className) {
            this.className = className;
        }
    }

    // Static inner class School
    static class School {

        Student[] students = new Student[10];   // Store students
        Teacher[] teachers = new Teacher[10];   // Store teachers
        ClassRoom[] classes = new ClassRoom[10]; // Store classes

        int studentCount = 0;
        int teacherCount = 0;
        int classCount = 0;

        // Method to add a student
        void addStudent(Student student) {
            students[studentCount] = student;
            studentCount++;
        }

        // Method to remove a student by name
        void removeStudent(String name) {
            for (int i = 0; i < studentCount; i++) {
                if (students[i].name.equalsIgnoreCase(name)) {
                    students[i] = students[studentCount - 1];
                    students[studentCount - 1] = null;
                    studentCount--;
                    break;
                }
            }
        }

        // Method to add a teacher
        void addTeacher(Teacher teacher) {
            teachers[teacherCount] = teacher;
            teacherCount++;
        }

        // Method to remove a teacher by name
        void removeTeacher(String name) {
            for (int i = 0; i < teacherCount; i++) {
                if (teachers[i].name.equalsIgnoreCase(name)) {
                    teachers[i] = teachers[teacherCount - 1];
                    teachers[teacherCount - 1] = null;
                    teacherCount--;
                    break;
                }
            }
        }

        // Method to create a class
        void createClass(ClassRoom classRoom) {
            classes[classCount] = classRoom;
            classCount++;
        }
    }

    public static void main(String[] args) {

        // Create a School object
        School mySchool = new School();

        // Add students
        mySchool.addStudent(new Student("Alex"));
        mySchool.addStudent(new Student("Bella"));

        // Add teachers
        mySchool.addTeacher(new Teacher("Mr. John"));
        mySchool.addTeacher(new Teacher("Mrs. Smith"));

        // Create classes
        mySchool.createClass(new ClassRoom("Math"));
        mySchool.createClass(new ClassRoom("English"));

        // Remove a student and a teacher
        mySchool.removeStudent("Alex");
        mySchool.removeTeacher("Mr. John");

        // Display remaining students
        System.out.println("Students:");
        for (int i = 0; i < mySchool.studentCount; i++) {
            System.out.println(mySchool.students[i].name);
        }

        // Display remaining teachers
        System.out.println("Teachers:");
        for (int i = 0; i < mySchool.teacherCount; i++) {
            System.out.println(mySchool.teachers[i].name);
        }

        // Display classes
        System.out.println("Classes:");
        for (int i = 0; i < mySchool.classCount; i++) {
            System.out.println(mySchool.classes[i].className);
        }
    }
}
