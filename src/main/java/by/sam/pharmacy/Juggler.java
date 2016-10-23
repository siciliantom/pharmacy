package by.sam.pharmacy;

/**
 * Created by Kate on 22.10.2016.
 */
public class Juggler implements Performer{
    //private int beanBags = 3;
    public Juggler() {
    }
    //public Juggler(String phrase) {
//        this.beanBags = beanBags;
//    }
    public String perform(String text) {
        return text.toUpperCase();
    }
}
