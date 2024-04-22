package dk.kea.dat3js.hogwarts5.students;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getFullName() {
        // arrange
        Student student = new Student("Harry", "James", "Potter", null, 1);

        // act
        var fullname = student.getFullName();

        // assert
        assertEquals("Harry James Potter", fullname);
    }

    @Test
    void getFullNameWithoutMiddleName() {
        // arrange
        Student student = new Student("Cho", null, "Chang", null, 5);

        // act
        var fullname = student.getFullName();

        // assert
        assertEquals("Cho Chang", fullname);
    }

    @Test
    void setFullNameWithMiddleName() {
        // arrange
        Student student = new Student("first", "middle", "last", null, 1);

        // act
        student.setFullName("Hermione Jean Granger");

        // assert
        var fullName = student.getFullName();
        assertEquals ("Hermione", student.getFirstName());
        assertEquals ("Jean", student.getMiddleName());
        assertEquals("Granger", student.getLastName());



    }
}