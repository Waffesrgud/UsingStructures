package structure.controller;

import structure.model.Item;
import structure.model.Queue;
import structure.model.Stack;

public class Main {
Queue<Item> queue = new Queue<Item>();
Stack<Item> stack = new Stack<Item>();

public void start()
{
	Item epic = new Item(120, "Literally dying rnow :joy:", true);
	Item notSoEpic = new Item();
	queue.enqueue(epic);
	queue.enqueue(notSoEpic);
	queue.enqueue(epic);
	queue.enqueue(notSoEpic);
	stack.push(notSoEpic);
	stack.push(epic);
	stack.push(notSoEpic);
	stack.push(epic);
	if(compareData())
	{
		System.out.println("Your thing worked! Yay, my good man!");
	} else
	{
		System.out.println("It didn't work. Literally die please.");
	}
}

public Boolean compareData()
{
	Queue<Item> tempQueue = queue;
	Stack<Item> tempStack = stack;
	if(queue.getSize() != stack.getSize())
	{
		return false;
	}
	for(int i = 0; i < queue.getSize(); i++)
	{
		Item queueItem = tempQueue.dequeue();
		Item stackItem = tempStack.pop();
		if(queueItem != stackItem)
		{
			return false;
		}
	}
	return true;
}
}
