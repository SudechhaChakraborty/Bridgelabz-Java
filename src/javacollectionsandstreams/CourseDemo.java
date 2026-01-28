package javacollectionsandstreams;

import java.util.ArrayList;
import java.util.List;

// ---------- Abstract Course Type ----------
abstract class CourseType {
    String courseName;

    CourseType(String courseName) {
        this.courseName = courseName;
    }

    abstract void evaluate();
}

// ---------- Exam Based Course ----------
class ExamCourse extends CourseType {

    ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    void evaluate() {
        System.out.println(courseName + " - Evaluation: Written Exam");
    }
}

// ---------- Assignment Based Course ----------
class AssignmentCourse extends CourseType {

    AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    void evaluate() {
        System.out.println(courseName + " - Evaluation: Assignments");
    }
}

// ---------- Research Based Course ----------
class ResearchCourse extends CourseType {

    ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    void evaluate() {
        System.out.println(courseName + " - Evaluation: Research Work");
    }
}

// ---------- Generic Course Class ----------
class Course<T extends CourseType> {

    private T course;

    Course(T course) {
        this.course = course;
    }

    T getCourse() {
        return course;
    }
}

// ---------- Main Class ----------
public class CourseDemo {

    // Wildcard method
    static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            c.evaluate();
        }
    }

    public static void main(String[] args) {

        // Courses
        ExamCourse maths = new ExamCourse("Mathematics");
        AssignmentCourse java = new AssignmentCourse("Java Programming");
        ResearchCourse ai = new ResearchCourse("AI Research");

        // Generic course containers
        Course<ExamCourse> c1 = new Course<>(maths);
        Course<AssignmentCourse> c2 = new Course<>(java);
        Course<ResearchCourse> c3 = new Course<>(ai);

        // List of different course types
        List<CourseType> courseList = new ArrayList<>();
        courseList.add(c1.getCourse());
        courseList.add(c2.getCourse());
        courseList.add(c3.getCourse());

        // Display all courses
        displayCourses(courseList);
    }
}
