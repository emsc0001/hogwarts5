package dk.kea.dat3js.hogwarts5.teachers;

import dk.kea.dat3js.hogwarts5.students.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    @Test
    void getFullName() {
        // arrange
        Teacher student = new Teacher("Harry", "James", "Potter", null, 1);

        // act
        var fullname = student.getFullName();

        // assert
        assertEquals("Harry James Potter", fullname);
    }

    @Test
    void getFullNameWithoutMiddleName() {
        // arrange
        Teacher student = new Teacher("Cho", null, "Chang", null, 5);

        // act
        var fullname = student.getFullName();

        // assert
        assertEquals("Cho Chang", fullname);
    }

    @Test
    void setFullNameWithMiddleName() {
        // arrange
        Teacher student = new Teacher("first", "middle", "last", null, 1);

        // act
        student.setFullName("Hermione Jean Granger");

        // assert
        var fullName = student.getFullName();
        assertEquals ("Hermione", student.getFirstName());
        assertEquals ("Jean", student.getMiddleName());
        assertEquals("Granger", student.getLastName());
    }

    @Test
    void setFullNameWithoutLastName() {
        // arrange
        Teacher student = new Teacher("first", "middle", "last", null, 1);

        // act
        student.setFullName("Ronald Bilius");

        // assert
        assertEquals("Ronald", student.getFirstName());
        assertEquals("Bilius", student.getMiddleName());
        assertEquals(null, student.getLastName());
    }

    @Test
    void setFullNameWithMultipleMiddleNames() {
        // arrange
        Teacher student = new Teacher("first", "middle", "last", null, 1);

        // act
        student.setFullName("Albus Percival Wulfric Brian Dumbledore");

        // assert
        var fullName = student.getFullName();
        assertEquals ("Albus", student.getFirstName());
        assertEquals ("Percival Wulfric Brian", student.getMiddleName());
        assertEquals("Dumbledore", student.getLastName());
    }

    @Test
    void setFullNameWithEmptyString() {
        // arrange
        Teacher student = new Teacher("first", "middle", "last", null, 1);

        // act
        student.setFullName("");

        // assert
        assertEquals("", student.getFirstName());
        assertEquals(null, student.getMiddleName());
        assertEquals(null, student.getLastName());
    }

    @Test
    void setFullNameWithNull() {
        // arrange
        Teacher student = new Teacher("first", "middle", "last", null, 1);

        // act
        student.setFullName(null);

        // assert
        assertEquals(null, student.getFirstName());
        assertEquals(null, student.getMiddleName());
        assertEquals(null, student.getLastName());
    }

    @Test
    void getFullNameWithMiddleName() {
        // arrange
        Teacher student = new Teacher("Harry", "James", "Potter", null, 1);

        // act
        var fullname = student.getFullName();

        // assert
        assertEquals("Harry James Potter", fullname);
    }
}