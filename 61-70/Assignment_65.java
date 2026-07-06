package assignment_61_to_70;

public class Assignment_65 {

	public static void main(String[] args) {
		System.out.println("WAP to check if 2 arrays are equal");
		
		int a[] = {11, 12, 13, 14, 15};
		
		int b[] = {21, 22, 23, 24, 25};
		
		//int b[] = {11, 12, 13, 14, 15};
		
		int d=0; boolean k= false;
		if((a.length != b.length))
		{
			System.out.println("NOT Equal");
		}
		else {
			
			for(int i=0; i<a.length; i++)
			{
				if((a[i]==b[i]))
				{
				 k=true;
				}
			}	
			if(k)
				{
					System.out.println("a and b are Equal");
				}
				else {
					System.out.println("Not Equal");
				}
		}
	}
}
