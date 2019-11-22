package stack;

import java.util.*;
/**
 * Implementation of a stack using an ArrayList to hold the
 * elements of the stack
 * @author trao
 *
 * @param <T>
 */
public class ArrayListStack<T> implements IStack<T>
{
    //--------------------------------------------------
    // Body of the stack is held in an ArrayList
    private ArrayList<T> stackBody;

    //--------------------------------------------------
    /**
     * Constructor: Instantiates the body
     */
    public ArrayListStack()
    {
        stackBody = new ArrayList<T>();
    }
    //--------------------------------------------------
    /**
     * Test for emptiness: size == 0 means stack is empty
     */
    public boolean isEmpty()
    {
        return (stackBody.size() == 0);
    }
    //--------------------------------------------------
    /**
     * Insert a new item at the top of the stack
     */
    public void push(T item)
    {   
        stackBody.add(item);
    }
    //--------------------------------------------------
    /**
     * Delete the top-most element of the stack
     * Report error and return null if stack is empty
     */
    public T pop()
    {
        if (isEmpty())
        {
            System.out.println("Error in ArrayStack.pop() Stack Empty ");
            return null;
        }
        else
        {
            T topElement = stackBody.get(stackBody.size()-1);
            stackBody.remove(stackBody.size()-1);
            return topElement;
        }
    }
    //--------------------------------------------------
    /**
     * Fetch the top-most element of the stack without
     * removing it. Report error and return null if stack 
     * is empty
     */
    public T top()
    {
        if (isEmpty())
        {
            System.out.println("Error in ArrayStack.top() Stack Empty ");
            return null;
        }
        else
        {
            T topElement = stackBody.get(stackBody.size()-1);
            return topElement;
        }
    }
    //----------------------------------------------------
    /**
     * Checks to see if two stacks have exactly the 
     * the same elements and if those elements are
     * in the same order 
     */
    public boolean equals(ArrayListStack otherStack){

        if (otherStack.size() != stackBody.size()){
            return false;
        } else {
            int i = 0;
            while  (i < otherStack.size()){
                if(this.stackBody.get(i).equals(otherStack.stackBody.get(i))){
                    i++;
                } else {
                    return false;
                }
            }
            return true;
        }
    }
    //---------------------------------------------------
    /**
     * Returns the size of the arraylist
     */
    public int size(){ return stackBody.size();}

}