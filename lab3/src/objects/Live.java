package objects;

import enums.Condition;
import exceptions.ConflictException;

import java.util.Objects;

public  class Live extends Obj {

    public Live(String name, int x, int y){
        super(name, x, y);
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Live live = (Live) object;
        return Objects.equals(name, live.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void feeling () {
        System.out.println(name +" "+ "чувствует, что");
    }



    public void feeling (Condition condition){
        feeling();
    switch (condition){
            case  MADNESS :
                System.out.println("потерял рассудок");
                break;
            case FUN:
                System.out.println("смеется");
                break;
            case DESPAIR:
                System.out.println("в отчаянии");
                break;
        case DETERMINATION  :
            System.out.println("решился");
            break;
        case TIRED:
            System.out.println("силы оставили его");
            break;
        case CONFUSION :
            System.out.println("не знает, что предпринять");
            break;
        case HUNGRY:
            System.out.println("слюни потекли");
            break;
        }

    }
}
