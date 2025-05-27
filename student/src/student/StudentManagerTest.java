package student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentManagerTest {
	
	StudentManager sm;

	@BeforeEach
	void setUp() throws Exception {
		sm = new StudentManager();
		sm.addStudent("곽성렬");
	}

	@Test
	void testAddStudent() {
		sm.addStudent("홍길동");
		assertTrue(sm.hasStudent("홍길동"));
	}

	@Test
	void testRemoveStudent() {
		sm.removeStudent("곽성렬");
		assertFalse(sm.hasStudent("곽성렬"));
	}

	@Test
	void testAddStudentException() {
		assertThrows(IllegalArgumentException.class, () -> {
			sm.addStudent("곽성렬");
		});
	}

	@Test
	void testRemoveStudentException() {
		assertThrows(IllegalArgumentException.class, () -> {
			sm.removeStudent("홍길동");
		});
	}
//TEST

}
