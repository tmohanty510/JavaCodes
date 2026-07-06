package assignment_36_40;
class  GRANDPARENT{
		GRANDPARENT(){
			System.out.println("This is Non Parameterized Constructor of GRANDPARENT CLASS");
			
		}
		GRANDPARENT(int a){
			System.out.println("This is Parameterized Constructor of GRANDPARENT CLASS");
		}
}
	class PARENT extends GRANDPARENT{
		PARENT(){
			super('r');				//supercalling statement
			System.out.println("This is Non Parameterized Constructor of PARENT CLASS");
		}
		PARENT(char a){
			System.out.println("This is Parameterized Constructor of PARENT CLASS");
		}
	}
	class CHILD extends PARENT{
		CHILD(){
			super('A');				//supercalling statement
			System.out.println("This is Non Parameterized Constructor of CHILD CLASS");
		}
		CHILD(boolean k){
			System.out.println("This is Parameterized Constructor of CHILD CLASS");
		}
	}
public class Assignment_36 {
    public static void main(String[] args) {
        new CHILD(true);
    }
}
        
        
        
        
        
        
        
        
        