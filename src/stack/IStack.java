package stack;

/**
 * Write a description of interface IStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface IStack<T>
{
	public boolean isEmpty();
	public void push(T item);
	public T pop();
	public T top();
}