package objects;


import exceptions.NameException;

import java.util.HashSet;
import java.util.Set;

public abstract class Obj {
    public int getX() {
        return x;
    }

    int x;
    int y;

    String name;
    private static  HashSet<String> allName = new HashSet<String>();

    public int getY() {
        return y;
    }

    public Obj(String name, int x, int y) {
        if (allName.contains(name)) {
            throw new NameException("Объект с именем" + name + " уже был создан");
        } else this.name = name;
        allName.add(name);
        this.x = x;
        this.y = y;
    }

    public void getCoordinat() {
        System.out.printf("%s имеет широту:%s и высоту %s.%n", this, x ,y);
    }
    public void doSomething(String s) {
        System.out.printf("%s %s %n", this, s);
    }



    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

}



