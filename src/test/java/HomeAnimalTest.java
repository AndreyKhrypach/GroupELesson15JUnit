import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class HomeAnimalTest {
    HomeAnimal animal;

    @BeforeEach
    void setUp() {
        animal = new HomeAnimal("Cat", "Tom", 4, true);
    }

    @AfterEach
    void tearDown() {
        animal = null;
    }

    @Test
    void getAnimalType() {
//        HomeAnimal animal = new HomeAnimal("Cat", "Tom", 4, true);
        assertEquals("Cat", animal.getAnimalType());
    }

    @Test
    void setAnimalType() {
//        HomeAnimal animal = new HomeAnimal("Cat", "Tom", 4, true);
        animal.setAnimalType("Super Cat");
        assertEquals("Super Cat", animal.getAnimalType());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Cat", "Dog", "Bird", "Fish"})
    @NullSource
    void getAnimalTypes(String animalKind) {
        HomeAnimal homeAnimals = new HomeAnimal(animalKind, "Tom", 4, true);
        assertEquals(animalKind, homeAnimals.getAnimalType());
    }

    @Test
    void getBark() {
//        HomeAnimal animal = new HomeAnimal("Cat", "Tom", 4, true);
        assertEquals("Tom", animal.getBark());
    }

    @Test
    void setBark() {
//        HomeAnimal animal = new HomeAnimal("Cat", "Tom", 4, true);
        animal.setBark("Matroskin");
        assertEquals("Tom", animal.getBark());
    }

    @Test
    void setBarkEmpty() {
        HomeAnimal animalEmptyBark = new HomeAnimal("Cat", "", 4, true);
        animalEmptyBark.setBark("Matroskin");
        assertEquals("Matroskin", animalEmptyBark.getBark());
    }

    @Test
    void getAge() {
//        HomeAnimal animal = new HomeAnimal("Cat", "Tom", 4, true);
        assertEquals(4, animal.getAge());
    }

    @Test
    void setAge() {
//        HomeAnimal animal = new HomeAnimal("Cat", "Tom", 4, true);
        animal.setAge(5);
        assertEquals(5, animal.getAge());
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 4, 5, 6})
    void getAges(int animalAge) {
        HomeAnimal animals = new HomeAnimal("Cat", "Tom", animalAge, true);
        assertEquals(animalAge, animals.getAge());
    }

    @Test
    void isSex() {
//        HomeAnimal animal = new HomeAnimal("Cat", "Tom", 4, true);
        assertTrue(animal.isSex());
    }

    @Test
    void setSex() {
//        HomeAnimal animal = new HomeAnimal("Cat", "Tom", 4, true);
        animal.setSex(false);
        assertFalse(animal.isSex());
    }
}