package java_class_work;
import java.util.Date;
public class Future_Time {

	public static void main(String[] args) {				
				Date d1=new Date();
				System.out.println(d1.getTime());
				String dateformat = d1.toString(); 
				
				System.out.println(dateformat);
				
				Date d2=new Date(d1.getTime()-(1000*60*60*24*2l));
				System.out.println(d2);

	}

}
