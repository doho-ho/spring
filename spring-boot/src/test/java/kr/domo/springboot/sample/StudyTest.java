package kr.domo.springboot.sample;

import org.junit.jupiter.api.*;

import java.util.function.Supplier;

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
    void create_new_study_with_default() {
        Study study = new Study();
        assertNotNull(study);
//        assertEquals(StudyStatus.DRAFT, study.getStudyStatus(), new Supplier<String>() {
//            @Override
//            public String get() {
//                return "테스트가 실패했을 때 출력할 메세지를 적어주면 됩니다.";
//            }
//        });

//        assertEquals(StudyStatus.DRAFT, study.getStudyStatus(), () -> "테스트가 실패했을 때 출력할 메세지를 적어주면 됩니다.");
//        assertTrue(study.getLimit() > 0);

        assertAll(
                () -> assertNotNull(study),
                () -> assertEquals(StudyStatus.DRAFT, study.getStudyStatus(), () -> "테스트가 실패했을 때 출력할 메세지를 적어주면 됩니다."),
                () -> assertTrue(study.getLimit() > 0),
                () -> assertThrows(IllegalArgumentException.class, () -> study.updateLimit(-10))
        );
    }

    @Test
    void create_new_study_with_limit() {

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