public class ArrayQueue<T> implements Queue<T>
{
	private int DEFSIZE=10;
	private int size=0;
	private T[] array;
	private int head=0;
	private int tail=0;
	private int cap;
	public ArrayQueue()
	{
		cap=DEFSIZE;
		this.array=(T[]) new Object[DEFSIZE];

	}
	/*Checks the to see if the Queue is full.*/
	public boolean full()
	{
		return size==cap;
	}
	/*Adds size to the Array if the size is too small.*/
	public void growarray()
	{
		//Object array 
		// arr.size*2 so you double it. 
		T temp[]=(T[]) new Object[array.length*2];
		for (int x=0;x<array.length;x++)
		{
			temp[x]=array[x];
		}
		array=temp;
	}
	/*Remove item from the head from the stack*/
	public T dequeue()
	{
		if (head>array.length)
			head=0;
		T item2=array[head];
		this.head++;
		this.size--;
		return item2;
	}
	/*Adds item to the queue.*/
	public void enqueue(T item)
	{
		if(this.tail>=array.length)
			growarray();
		this.size++;
		this.array[tail]=item;
		this.tail++;
		//this.head--;

	}
	/*Checks to see if the queue is empty*/
	public boolean empty()
	{
		return size==0;
	}
}