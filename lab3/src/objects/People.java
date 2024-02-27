package objects;

import enums.Gender;
import enums.Nationality;
import exceptions.ConflictException;
import exceptions.HandsException;
import exceptions.NameException;

import interfaces.Conflict;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class People extends Live implements  Conflict {
    private int numberOfHands = 0;
    private int allHands = 0;
    private Gender gender;
    private Nationality nationality;

    public People(String name, Gender gender, Nationality nationality,int x, int y) {
        super(name,x,y);
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.x=x;
        this.y=y;
    }
    public Nationality getNationality() {
        return nationality;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public int getAllHands() {
        return allHands;
    }

    public void conflict(Live object) throws ConflictException {
        if (this.equals(object)) {
            throw new ConflictException("Объект не может конфликтовать сам собой");
        }
        System.out.printf("%s конфликт произошел c %s.%n", this, object);

    }
    @Override
    public void conflict(Obj object) throws ConflictException {
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Live live = (Live) o;
        return Objects.equals(name, live.name);
    }



    private static HashSet<String> allName = new HashSet<String>();

    public People(String name, int x, int y) {
        super(name, x, y);
        this.gender = null;
        this.nationality = null;


        if (allName.contains(name)) {
            throw new NameException("Объект с именем" + name + " уже был создан");
        } else this.name = name;
        allName.add(name);
    }

    @Override
    public String toString() {
        return  name;
    }

    public String getName() {
        return name;
    }


    public void startMoving( Ship ship, People people) {
        if ( allHands + people.getAllHands()< 4){
            System.out.printf("%s не смог всего с %s руками в наличие отплыть от берега на корабле %s.%n",this, allHands + people.getAllHands(), ship);
        } else if ( allHands + people.getAllHands()>4){
            System.out.printf (" Рук для отплытия прекрасно хватало в количестве %s штук: %s смог отплыть от берега на корабле %s.%n",this, allHands + people.getAllHands(), ship);
        }
        else {System.out.printf(" %s несмотря на явную нехватку рук в количестве штук: %s смог отплыть от берега на корабле %s.%n", this,allHands + people.getAllHands() , ship);
        }
    }
    public void walk(Ship.Deck deck){
        this.x= +10;
        this.y=+10;
        System.out.printf("%s прогуливается по %s%n",this, deck.name);
    }
    public void die(){
        System.out.printf("%s погиб от морального истощения %n",this);

    }


    public class Hands {
        public Hands() throws HandsException {
            allHands++;
            if (numberOfHands < 2) {
                numberOfHands++;
            } else {
                throw new HandsException(" У человека может быть только 2 руки");
            }


        }
    }
}


