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
	public boolean full()
	{
		return size==cap;
	}
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
	public T dequeue()
	{
		if (head>array.length)
			head=0;
		T item2=array[head];
		this.head++;
		this.size--;
		return item2;
	}
	public void enqueue(T item)
	{
		if(this.tail>=array.length)
			growarray();
		this.size++;
		this.array[tail]=item;
		this.tail++;
		//this.head--;

	}
	public boolean empty()
	{
		return size==0;
	}
}