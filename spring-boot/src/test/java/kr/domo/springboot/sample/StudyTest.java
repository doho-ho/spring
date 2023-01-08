package kr.domo.springboot.sample;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class StudyTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }
    @Test
    void create_new_study() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create");
    }

    @Test
    void create_new_study_again() {
        System.out.println("create1");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("After all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each");
    }

}