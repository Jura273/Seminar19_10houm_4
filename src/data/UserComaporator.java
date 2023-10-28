package data;

import data.User;

import java.util.Comparator;

public class UserComaporator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondname().compareTo(o2.getSecondname());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstname().compareTo(o2.getFirstname());
            if (resultOfComparing == 0) {
                return o1.getLastname().compareTo(o2.getLastname());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}

