package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal cat;
    Animal dog;
    Animal goat;

    @BeforeEach
    void setUp() {
        cat = new Animal("Catty", 1, "Cat", "Miau");
        dog = new Animal("Doggy", 3, "Dog", "Wau");
        goat = new Animal("Goaty", 5, "Goat", "Meeh");
    }

    @Test
    @DisplayName("Test giveAnimalLoud")
    void giveAnimalLoud() {
        String animalLoudCat = "Miau";
        String animalLoudDog = "Wau";
        String animalLoudGoat = "Meeh";

        Assertions.assertEquals(animalLoudCat, cat.getAnimalLoud());
        Assertions.assertEquals(animalLoudDog, dog.getAnimalLoud());
        Assertions.assertEquals(animalLoudGoat, goat.getAnimalLoud());
    }

    @Test
    @DisplayName("Test getNameAndAge")
    void getNameAndAge() {
        String nameAndAgeCat = "Catty, 1";
        String nameAndAgeDog = "Doggy, 3";
        String nameAndAgeGoat = "Goaty, 5";

        Assertions.assertEquals(nameAndAgeCat, cat.getNameAndAge());
        Assertions.assertEquals(nameAndAgeDog, dog.getNameAndAge());
        Assertions.assertEquals(nameAndAgeGoat, goat.getNameAndAge());
    }

    @Test
    @DisplayName("Test ageCategory")
    void ageCategory() {
        String ageCategoryCat = "baby animal";
        String ageCategoryDog = "young animal";
        String ageCategoryGoat = "old animal";

        Assertions.assertEquals(ageCategoryCat, cat.ageCategory());
        Assertions.assertEquals(ageCategoryDog, dog.ageCategory());
        Assertions.assertEquals(ageCategoryGoat, goat.ageCategory());
    }
}