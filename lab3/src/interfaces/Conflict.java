package interfaces;

import exceptions.ConflictException;
import objects.Obj;

public interface Conflict {
    void conflict(Obj obj) throws ConflictException;


}
