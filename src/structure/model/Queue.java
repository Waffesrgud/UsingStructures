package structure.model;

import java.util.ArrayList;

public class Queue<Type> {
ArrayList<Type> data = new ArrayList<Type>();

public Queue()
{
	
}

public Type viewFront()
{
	return data.get(0);
}

public Type viewEnd()
{
	return data.get(data.size() - 1);
}

public Type dequeue()
{
if(data.size() > 0)
{
return data.remove(0);
}
else
{
return null;
}
}

public void enqueue(Type in)
{
	data.add(in);
}

public int getSize()
{
	return data.size();
}

}
