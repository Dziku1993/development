package pl.zalewski.duck.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DuckTest {

    private Duck duck;

    @BeforeEach
    public void init() {
        duck = new DuckModel();
    }

    @DisplayName("Creating flying duck")
    @Test
    public void createFlyingDuck() {
        duck = new FlyingDuck();
        Assertions.assertEquals(duck.getClass(), FlyingDuck.class);
    }

    @DisplayName("Creating rubber duck")
    @Test
    public void createRubberDuck() {
        duck = new RubberDuck();
        Assertions.assertEquals(duck.getClass(), RubberDuck.class);
    }
}