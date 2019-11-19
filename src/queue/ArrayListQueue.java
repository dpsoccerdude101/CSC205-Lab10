package queue;

import java.util.*;

public class ArrayListQueue<T> implements IQueue<T>
{
    ArrayList<T> body;
    public ArrayListQueue()
    {
        body = new ArrayList<T>();
    }
    public boolean isEmpty()
    {
        return (body.size()== 0);
    }
    public void insert(T item)
    {
        body.add(item);
    }
    public T delete()
    {
        if (isEmpty())
            return null;
        T item = body.get(0);
        body.remove(0);
        return item;
    }
    public T front()
    {
        if (isEmpty())
            return null;
        T item = body.get(0);
        return item;
    }
    public void printQueue()
    {
        for(int i = 0; i < body.size(); i++)
        {
            System.out.print(body.get(i) + "    ");
        }
        System.out.println();
    }
}
