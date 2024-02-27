package objects;

import interfaces.Swaying;

import java.util.Objects;

public class Water implements Swaying {


    protected String name;

    public Water(String name) {
 this.name=name;

    }

    @Override
    public String toString() {
        return  name;
    }

    public void storm(Swaying swaying){
       System.out.println (this.name + " начался шторм" + " c "+ swaying.toString());
    }


    @Override
    public void sway() {
        System.out.println(" ");

    }
}
