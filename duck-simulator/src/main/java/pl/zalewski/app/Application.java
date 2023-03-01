package pl.zalewski.app;

import pl.zalewski.duck.interfaces.fly.FlyWithRocketPropulsion;
import pl.zalewski.duck.model.Duck;
import pl.zalewski.duck.model.DuckModel;
import pl.zalewski.duck.model.FlyingDuck;
import pl.zalewski.duck.model.RubberDuck;
import pl.zalewski.items.model.DuckWhistle;
import pl.zalewski.items.model.Whistle;

public class Application {
    public static void main(String[] args) {
        Duck flyingDuck = new FlyingDuck();
        flyingDuck.fly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.fly();

        DuckModel duckModel = new DuckModel();
        duckModel.fly();
        // Change flying interface
        duckModel.setFlying(new FlyWithRocketPropulsion());


        Whistle whistle = new DuckWhistle();
        whistle.display();
        whistle.whistle();
    }
}
