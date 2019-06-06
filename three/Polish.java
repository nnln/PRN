package three;

public class Polish {
	private char[] c;
	private Stack<Character> stack=new Stack<Character>();
	private String out = new String();
	public Polish(String s){
		this.c=s.toCharArray();
	}
	
	/* 中缀转后缀 */
	public String change(){
		for(int i=0;i<c.length;i++){
			// 判断是否为0-9的整数
			if(c[i]>='0'&&c[i]<='9'){
				out+=c[i];
			// 判断是否是运算符号
			}else if(c[i]=='+'||c[i]=='-'||c[i]=='*'||c[i]=='/'){
				if(stack.gettop()!=null&&stack.gettop()!='('){
				    char temp;
					temp=stack.gettop();
					recursion(c[i],temp);					
				}else{
				    stack.push(c[i]);
				}
				
			// 判断是否为"("
			}else if(c[i]=='('){
				stack.push(c[i]);
			// 判断是否为")"
			}else if(c[i]==')'){
				while(stack.gettop()!=null&&!(stack.gettop()=='(')){
					out+=stack.pop();
				}
				stack.pop();
			}else{
			}
		}
		// 表达式结束
		while(!stack.isempty()){
			out+=stack.pop();
		}
		return out;
	}
	/* 递归比较优先级*/
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
	/* 优先级定义及比较 */
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
