package edu.kit.ipd.swt1.Lecture;

import java.util.LinkedList;

/**
 * Created by Sebastian Schindler on 03.06.2014.
 */
public class Lecture {
    private Professor swtProf;
    private LinkedList<Student> StudentList;

    public Lecture() {
        this.swtProf = new Professor("Professor for SWT");
        this.StudentList = new LinkedList<Student>();
        for (int i = 0; i < 3; i++) {
            this.StudentList.add(new Student(true, "Male student of SWT"));
            this.StudentList.add(new Student(false, "Female student of SWT"));
        }
        for (int i = 0; i < StudentList.size(); i++) {
            swtProf.addObserver(StudentList.get(i));
        }
    }

    public static void main(String[] args) {
        Lecture lect = new Lecture();
        for (int i = 0; i < 5; i++) {
            lect.swtProf.setChapter("Definition");
            lect.swtProf.notifyObservers(lect.swtProf.getChapter());

            lect.swtProf.setChapter("Pattern");
            lect.swtProf.notifyObservers(lect.swtProf.getChapter());

            lect.swtProf.setChapter("Example");
            lect.swtProf.notifyObservers(lect.swtProf.getChapter());
        }

    }

}
