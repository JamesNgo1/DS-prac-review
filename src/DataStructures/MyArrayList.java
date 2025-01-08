package DataStructures;

/**
 *
 * @param <t> so this is a type parameter is used to specify that the class will work with
 *           any type of object. T is placeholder actual type use when
 *           creating instance of the class
 */
public class MyArrayList<t> {

    private Object[] elements;
    private int size; //store the size of the
    private static int default_size = 10;

    public MyArrayList(){
        elements = new Object[default_size];
        size = 0;

    }
}
