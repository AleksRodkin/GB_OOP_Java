package OOP_Java.Lesson4.Homework4;

import java.util.Comparator;

class BoxWeightComparator implements Comparator<Box> {
    @Override
    public int compare(Box o1, Box o2) {
        if ((int) o1.getWeight() < (int) o2.getWeight()) {
            return -1;
        } else if ((int) o1.getWeight() == (int) o2.getWeight()) {
            return 1;
        } else {
            return 0;
        }
    }
}
