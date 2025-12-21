// 14. Write a Java program to create a class called "School"
// with attributes for students, teachers, and classes,
// and methods to add and remove students and teachers,
// and to create classes.


// This class manages students, teachers, and classes in a school.

public class School {

    SchoolStudent[] students = new SchoolStudent[10];
    Teacher[] teachers = new Teacher[10];
    SchoolClass[] classes = new SchoolClass[10];

    int studentCount = 0;
    int teacherCount = 0;
    int classCount = 0;

    // Method to add a student
    void addStudent(SchoolStudent student) {
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
                return;
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
                return;
            }
        }
    }

    // Method to create a class
    void createClass(SchoolClass schoolClass) {
        classes[classCount] = schoolClass;
        classCount++;
    }
}
