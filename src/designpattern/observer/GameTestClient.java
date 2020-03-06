package designpattern.observer;

import java.util.EventObject;

public class GameTestClient {
    public Person person;
    public Sun sun;
    public Dog dog;
    public Cat cat;
    public Robot robot;
    public Game game;

    public void setup() {
        person = new Person();
        dog = new Dog();
        cat = new Cat();
        robot = new Robot();

        sun = new Sun();
        game = new Game(sun);
    }

    public void everyoneGoesOut() {
        person.goOutdoors();
        robot.goOutdoors();
        dog.goOutdoors();
        cat.goOutdoors();
        EventObject  e;
    }

    public void everyoneOutdoorsComesIn() {
        if(person.isOutdoors())
            person.goIndoors();
        if(robot.isOutdoors())
            robot.goIndoors();
        if(cat.isOutdoors())
            cat.goIndoors();
        if(dog.isOutdoors())
            dog.goIndoors();
    }

    public void tickOnce() {
        game.tick();
    }

    public void tickTwice() {
        game.tick();
        game.tick();
    }

    public boolean outdoorsCharactersFeelWarm() {
        if(person.isOutdoors() && !person.isFeelingWarm())
            return false;
        if(cat.isOutdoors() && !cat.isFeelingWarm())
            return false;
        if(dog.isOutdoors() && !dog.isFeelingWarm())
            return false;
        if(robot.isOutdoors() && !robot.isFeelingWarm())
            return false;

        if(!person.isOutdoors() && person.isFeelingWarm())
            return false;
        if(!cat.isOutdoors() && cat.isFeelingWarm())
            return false;
        if(!dog.isOutdoors() && dog.isFeelingWarm())
            return false;
        if(!robot.isOutdoors() && robot.isFeelingWarm())
            return false;

        return true;
    }

    public boolean allFeelCold() {
        return !person.isFeelingWarm() && !cat.isFeelingWarm() && !dog.isFeelingWarm() && !robot.isFeelingWarm();
    }
}