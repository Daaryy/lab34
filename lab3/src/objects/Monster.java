package objects;

import exceptions.ConflictException;

public class Monster extends Live {
    public Monster(String name, int x, int y) {
        super(name, x, y);
        this.x=x;
        this.y=y;
    }


    public void conflict (Obj object) throws ConflictException {

    }


    public void die() {
        System.out.printf("%s погиб от столкновения с яхтой \n", this);
    }

    public void harassment(People people) {
        System.out.printf("%s преследует %s.%n", this, people);
    }


}
