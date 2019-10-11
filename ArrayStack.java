//import java.util.Iterator;
public class ArrayStack<T> implements Stack<T>
{
	private int DEFSIZE=10;
	private int size=0;
	private T[] array;
	private int front;
	//private int Cap;
	public void growArray()
	{
		//Object array 
		// arr.size*2 so you double it. 
		T temp[]=(T[]) new Object[DEFSIZE*2];
		for (int x=0;x<DEFSIZE;x++)
		{
			temp[x]=this.array[x];
		}
		this.array=temp;
	}
	public ArrayStack()
	{
		//this.Cap=cap;
		front=0;
		this.array=(T[]) new Object[DEFSIZE];
	}
	//empty chechks to see if the front stack is equal to zero.
	public boolean empty()
	{
		if (this.front==0)
			return true;
		return false;
	}
	/*pushes new item into the stack, front increments 
	after the item is saved to the array.*/
	public void push(T item)
	{
		if (this.size==DEFSIZE)
			growArray();
		this.size++;
		this.array[front]=item;
		this.front++;
	}
	// Retrives last item in stack.
	public T peek() throws Exception
	{
		if(empty())
			throw new Exception();
		return array[front-1];
	}
	public T pop() throws Exception
	{
		if (empty())
			throw new Exception();
		this.size--;
		T item2=this.array[front];
		this.array[front]=null;
		this.front--;
		return item2;
	}

}