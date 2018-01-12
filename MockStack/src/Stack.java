import java.util.EmptyStackException;

/**
 *
 * @param <E>
 * @author Beesham
 */
public class Stack<E> implements StackADT{

    private E array[];
    private int sizeOfStack;
    private final int INIT_SIZE_OF_ARRAY = 5;

    public Stack() {
        //Empty Constructor
        sizeOfStack = INIT_SIZE_OF_ARRAY;
    }

    /**
     * Inserts an element
     * @param object object to be added to top of stack
     */
    public void push(Object object) {
     //TODO
    }

    /**
     * Removes and returns the last inserted element
     * @return the last inserted element
     */
    public E pop() throws EmptyStackException{
        //TODO
        return null;
    }

    /**
     * Returns the last inserted element without removing it
     * @return object
     */
    public E top() throws EmptyStackException{
        //TODO
        return null;
    }

    /**
     * Returns the number of elements stored
     * @return size of stack
     */
    public int size() {
        //TODO
        return sizeOfStack;
    }

    /**
     * Indicated whether no elements are stored
     * @return true: empty otherwise false
     */
    public boolean isEmpty() {
        //TODO
        return false;
    }

}
