package assignment_1_to_20;
public class Assignment_18 {
	public static void main(String[] args) {
		System.out.println("A system has users with roles: If username correct If password correct If role = “Admin” → “Full Access” Else if role = “User” → “Limited Access” Else → “Guest Access” Else → “Wrong password” Else → “Invalid username”\n");
		String username= "grotechminds";
		String password= "2026";
		String role= "Guest";
		if(username=="grotechminds") {
			if(password=="2026") {
				if(role=="Admin")
				{
					System.out.println("Admin: Full Access");
				}
				else if(role=="User")
				{
					System.out.println("User: Limited Access");
				}
				else
				{
					System.out.println("Guest: Guest Access");
				}
			}
			else {
				System.out.println("Wrong Password");
			}
		}
		else {
			System.out.println("Invalid Username");
		}
	  }
	}