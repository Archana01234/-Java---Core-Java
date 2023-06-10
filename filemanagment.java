package corejava;

import java.io.File;
import java.io.IOException;

public class filemanagment {
	
	public static void main(String[] args) {
		{
			try {
				File obj=new File("my file txt");
				
				if (obj.createNewFile()) {
					System.out.println("file created:"+obj.getName());
				}
				else {
					System.out.println("file already exits ");
				}
			}
			
				catch (IOException e) {
					System.out.println("An error has occurred");
					e.printStackTrace();
					
				}
			}
		}
	}
	
	
	


