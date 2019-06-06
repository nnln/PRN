package three;
import java.util.ArrayList;
public class Stack<T> {
	ArrayList<T> stack=new ArrayList<T>();
	  /*  判断栈是否为空     */
	public boolean isempty(){
		return stack.isEmpty();
	}
	  /*  入栈     */
	public void push(T t){
		stack.add(t);
	}
	  /*  出栈    */
	public T pop(){
		if(!stack.isEmpty()){
			T t1=stack.get(stack.size()-1);
			stack.remove(stack.size()-1);
			return t1;
		}else{
			return null;
		}
	}
	/* 得到栈顶元素 */
	public T gettop(){
		if(stack.size()==0){
			return null;
		}else{
			return stack.get(stack.size()-1);
		}
	}
	/* 获取栈的元素个数 */
	public int length(){
		return stack.size();
	}
}
