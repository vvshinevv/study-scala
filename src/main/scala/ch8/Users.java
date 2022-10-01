package ch8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Users implements Iterable<User> {
    private List<User> users = new ArrayList<>();



    @Override
    public Iterator iterator() {
        return users.iterator();
    }
}
