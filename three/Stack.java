package three;
import java.util.ArrayList;
public class Stack<T> {
	ArrayList<T> stack=new ArrayList<T>();
	  /*  �ж�ջ�Ƿ�Ϊ��     */
	public boolean isempty(){
		return stack.isEmpty();
	}
	  /*  ��ջ     */
	public void push(T t){
		stack.add(t);
	}
	  /*  ��ջ    */
	public T pop(){
		if(!stack.isEmpty()){
			T t1=stack.get(stack.size()-1);
			stack.remove(stack.size()-1);
			return t1;
		}else{
			return null;
		}
	}
	/* �õ�ջ��Ԫ�� */
	public T gettop(){
		if(stack.size()==0){
			return null;
		}else{
			return stack.get(stack.size()-1);
		}
	}
	/* ��ȡջ��Ԫ�ظ��� */
	public int length(){
		return stack.size();
	}
}
