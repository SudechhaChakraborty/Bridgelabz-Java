package javacollectionsandstreams.javagenerics;


import java.util.ArrayList;
import java.util.List;

// ---------- Abstract Job Role ----------
abstract class JobRole {
    String candidateName;

    JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    abstract void evaluate();
}

// ---------- Software Engineer ----------
class SoftwareEngineer extends JobRole {

    SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    @Override
    void evaluate() {
        System.out.println(candidateName + " screened for Software Engineer role");
    }
}

// ---------- Data Scientist ----------
class DataScientist extends JobRole {

    DataScientist(String candidateName) {
        super(candidateName);
    }

    @Override
    void evaluate() {
        System.out.println(candidateName + " screened for Data Scientist role");
    }
}

// ---------- Product Manager ----------
class ProductManager extends JobRole {

    ProductManager(String candidateName) {
        super(candidateName);
    }

    @Override
    void evaluate() {
        System.out.println(candidateName + " screened for Product Manager role");
    }
}

// ---------- Generic Resume Class ----------
class Resume<T extends JobRole> {

    private T jobRole;

    Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    T getJobRole() {
        return jobRole;
    }
}

// ---------- Main Class ----------
public class ResumeScreeningDemo {

    // Generic method
    static <T extends JobRole> void processResume(T role) {
        System.out.println("Processing resume...");
        role.evaluate();
    }

    // Wildcard method
    static void screeningPipeline(List<? extends JobRole> roles) {
        System.out.println("\n--- Screening Pipeline ---");
        for (JobRole role : roles) {
            role.evaluate();
        }
    }

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>(new SoftwareEngineer("Alice"));

        Resume<DataScientist> r2 =
                new Resume<>(new DataScientist("Bob"));

        Resume<ProductManager> r3 =
                new Resume<>(new ProductManager("Charlie"));

        // Individual processing
        processResume(r1.getJobRole());
        processResume(r2.getJobRole());
        processResume(r3.getJobRole());

        // Screening pipeline (multiple roles together)
        List<JobRole> pipeline = new ArrayList<>();
        pipeline.add(r1.getJobRole());
        pipeline.add(r2.getJobRole());
        pipeline.add(r3.getJobRole());

        screeningPipeline(pipeline);
    }
}
