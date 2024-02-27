package objects;

import exceptions.DegreeException;
import interfaces.Conflict;

import java.util.List;

public class Ship extends NotLive implements Conflict {


    private String name;
    int x;
    int y;

    @Override
    public String toString() {
        return  name ;
    }

    public Ship(String name, int x, int y) {
        super(name, x, y);
        this.name = name;
        this.x=x;
        this.y=y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
    public void getCoordinat() {
        System.out.printf("%s имеет широту:%s и высоту %s.%n", this, x, y);
    }
    public void move() {
         this.x +=102;
         this.y +=102;
        System.out.printf("%s плывет под управлением команды %n", this);

    }
    public static class Motor{
        public void start(People people){
            System.out.println(people.name + " запустил мотор");
        };
    }

    public class Deck {

        public Deck(String name) {
            this.name = name;
        }

        public String name;
    }

    public class Bridge {
    }

    public class Feed {
    }

   public class Bow {
    }

    public class Bowsprit {
    }

   public class Сabin {
    }

    public class SteeringWheel {
        public int degree;
        public SteeringWheel () {
            this.degree=0;

        }

        public void turn(People people,int degrees) throws DegreeException {
            int turnDegree= degree+ degrees;
            if (degrees < 0 ) {
                throw new DegreeException("Штурвал нельзя так повернуть");
            }
            else if
            (degrees > 360 ) {
                throw new DegreeException("Штурвал нельзя так повернуть");
            }
            else

            System.out.printf( "%s  повернул штурвал на  %s градусов.%n", people, degrees);
            }

        }

    @Override
    public void conflict(Obj object) {
    }
}