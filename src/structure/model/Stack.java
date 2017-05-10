package structure.model;

import java.util.ArrayList;

public class Stack<Type> {
ArrayList<Type> data = new ArrayList<Type>();

public Stack()
{
	
}

public Type peek()
{
	return data.get(0);
}

public Type pop()
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

public void push(Type in)
{
	data.add(0, in);
}

public int getSize()
{
	return data.size();
}

}