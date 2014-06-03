package edu.kit.ipd.swt1.Lecture;

/**
 * Created by Sebastian Schindler on 03.06.2014.
 */
public class Lecture {
    private Professor swtProf;
    private Student maleStudent1;
    private Student maleStudent2;
    private Student maleStudent3;
    private Student femStudent1;
    private Student femStudent2;
    private Student femStudent3;

    public Lecture() {
        this.swtProf = new Professor("Professor for SWT");
        this.maleStudent1 = new Student(true, "Male student of SWT");
        this.maleStudent2 = new Student(true, "Male student of SWT");
        this.maleStudent3 = new Student(true, "Male student of SWT");
        this.femStudent1 = new Student(false, "Female student of SWT");
        this.femStudent2 = new Student(false, "Female student of SWT");
        this.femStudent3 = new Student(false, "Female student of SWT");
    }

    public static void main(String[] args) {
        Lecture lect = new Lecture();


    }
}
