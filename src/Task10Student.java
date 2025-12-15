// 10. Write a Java program to create a class called "Student" with a name,
// grade, and courses attributes, and methods to add and remove courses.

public class Task10Student {

    static class Student {
        String name;
        String grade;
        String[] courses = new String[10]; // simple fixed-size list of courses
        int courseCount = 0;               // keeps track of how many courses are added

        // Constructor
        Student(String name, String grade) {
            this.name = name;
            this.grade = grade;
        }

        // Method to add a course
        void addCourse(String course) {
            if (courseCount < courses.length) {
                courses[courseCount] = course;
                courseCount++;
                System.out.println("Course added: " + course);
            } else {
                System.out.println("Cannot add more courses.");
            }
        }

        // Method to remove a course
        void removeCourse(String course) {
            for (int i = 0; i < courseCount; i++) {
                if (courses[i].equals(course)) {
                    System.out.println("Removing course: " + course);

                    // Shift courses to the left
                    for (int j = i; j < courseCount - 1; j++) {
                        courses[j] = courses[j + 1];
                    }

                    courses[courseCount - 1] = null;
                    courseCount--;
                    return;
                }
            }
            System.out.println("Course not found: " + course);
        }

        // Method to display student details
        void displayStudent() {
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.print("Courses: ");

            for (int i = 0; i < courseCount; i++) {
                System.out.print(courses[i] + " ");
            }
            System.out.println();
        }
    }

}
