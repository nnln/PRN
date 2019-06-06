package three;

public class Polish {
	private char[] c;
	private Stack<Character> stack=new Stack<Character>();
	private String out = new String();
	public Polish(String s){
		this.c=s.toCharArray();
	}
	
	/* 锟斤拷缀转锟斤拷缀 */
	public String change(){
		for(int i=0;i<c.length;i++){
			//锟叫讹拷锟角凤拷为锟斤拷锟斤拷
			if(c[i]>='0'&&c[i]<='9'){
				out+=c[i];
			//锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
			}else if(c[i]=='+'||c[i]=='-'||c[i]=='*'||c[i]=='/'){
				if(stack.gettop()!=null&&stack.gettop()!='('){
				    char temp;
					temp=stack.gettop();
					recursion(c[i],temp);					
				}else{
				    stack.push(c[i]);
				}
				
			//锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟脚ｏ拷锟斤拷锟斤拷压栈锟斤拷
			}else if(c[i]=='('){
				stack.push(c[i]);
			//锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟脚ｏ拷锟斤拷时锟借将栈锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷蔚锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷直锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷[锟斤拷锟斤拷锟脚碉拷锟斤拷锟斤拷锟斤拷锟斤拷锟絔锟斤拷
			}else if(c[i]==')'){
				while(stack.gettop()!=null&&!(stack.gettop()=='(')){
					out+=stack.pop();
				}
				stack.pop();
			}else{
			}
		}
		while(!stack.isempty()){
			out+=stack.pop();
		}
		return out;
	}
	/* 锟捷癸拷冉锟�*/
	public void recursion(char left,char right){
	    if(!compare(left,right)){
	        out+=stack.pop();
	        if(stack.gettop()!=null){
	            recursion(left,stack.gettop());
	        }else{
	            stack.push(left);
	        }
	    }else{
	        stack.push(left);
	    }
	}
	/* 锟叫讹拷锟斤拷锟斤拷锟斤拷锟斤拷燃锟�锟斤拷叽蠓祷锟絫rue */
	public boolean compare(char left,char right){
		int a=0,b=0;
		switch(left){
		case '(':a=1; break;
		case '+':a=2; break;
		case '-':a=2; break;
		case '*':a=3; break;
		case '/':a=3; break;
		default : System.out.print("锟脚ｏ拷"); break;
		}
		switch(right){
		case '(':b=1; break;
		case '+':b=2; break;
		case '-':b=2; break;
		case '*':b=3; break;
		case '/':b=3; break;
		default : System.out.print("锟脚ｏ拷"); break;
		}
		if(a>b){
			return true;
		}else{
			return false;
		}
	}
}
