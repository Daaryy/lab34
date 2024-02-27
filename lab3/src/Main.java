import exceptions.ConflictException;
import exceptions.DegreeException;
import exceptions.HandsException;
import exceptions.ShipExceptionn;
import objects.*;
import enums.Condition;
import enums.Gender;
import enums.Nationality;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ConflictException, DegreeException, HandsException, ShipExceptionn {
        People jo = new People("Йохансен", Gender.MALE, Nationality.NORVEGIAN,2, 4);
        People br = new People("Брайден", Gender.MALE, Nationality.UNKNOWN, 2, 4);
        Monster monster= new Monster("Существо", 4, 5);
        Ship ship= new Ship("Бдительная", 10, 10);
        Ship.Motor motor= new Ship.Motor();
        Ship.Deck deck= ship.new Deck("палуба");
        Ship.SteeringWheel steeringWheel = ship.new SteeringWheel();
        List<People> comandOnShip = new ArrayList<>();
        comandOnShip.add(jo);
        comandOnShip.add(br);
        People.Hands hands1= jo.new Hands();
        People.Hands hands2= jo.new Hands();
        People.Hands hands3= br.new Hands();
        People.Hands hands4= br.new Hands();
        motor.start(jo);
        jo.startMoving(ship,br);
        monster.feeling(Condition.HUNGRY);
        br.feeling(Condition.MADNESS);
        steeringWheel.turn (jo, 90);
        if(comandOnShip.isEmpty()) throw new ShipExceptionn ("Корабль не может плыть сам по себе");
        else  ship.move() ;
        for (People people: comandOnShip){
            System.out.println(people.getName());}
        ship.getCoordinat();
        br.feeling(Condition.FUN);
        br.die();
        jo.feeling(Condition.DESPAIR);
        jo.walk(deck);
        jo.feeling(Condition.CONFUSION);
        jo.feeling(Condition.DETERMINATION);
        monster.harassment(jo);
        jo.feeling(Condition.TIRED);
        jo.conflict(monster);
        monster.die();
        Water sea = new Water("Неизвестное море");
        Water waves = new Water("Волны") {
             public void swim() {
              System.out.println(" колышутся");
           }
        };
            sea.storm(waves);

    }
}
