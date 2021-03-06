/**
 * 3.3 - Stack of Plates
 * Imagine a stack of plates, if the stack gts too high, it might topple
 * Therefore in real life, we would like to start a new stack when the previous
 * stack exceeds some threshold. Implement a data structure SetOfStacks. Should be composed
 * of several stacks and sould create a new stack once the previous exceeds
 * capacity. SetOfStacks.push() and SetOfStacks.pop() should behave identically to
 * a single stack
 * Follow Up
 * Implement a function popAt(int index) which performs a pop operation on a specific
 * sub-stack
 */

class SetOfStacks {
	ArrayList<Stack> stack = new ArrayList<Stack();
	public void push(int v) {
		Stack last = getLastStack();
		if (last && !last.isFull()) {
			last.push(v);
		}
		else {
			Stack stack = new Stack(capacity);
			stack.push(v);
			stacks.add(stack);
		}
	}
	public int pop() {
		Stack last = getLastStack();
		if (!last)	throw new EmptyStackException();
		int v = last.pop(); 
		if (last.size == 0)
			stacks.remove(stacks.size()-1);
		return v;
	}
}