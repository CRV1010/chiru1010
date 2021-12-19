import java.io.File;
import java.util.Scanner;

class Drive 
{
	void allFiles(String fff,String s)
	{
		String fna=fff+s+"//";
		File f=new File(fna);
		String cont[]=f.list();
		for(int i=0;i<cont.length;i++)
		{
			File ff=new File(fna,cont[i]);
			if(ff.isDirectory())
			{
				System.out.println("("+cont[i]+") IS FOLDER ");
				try{
					allFiles(fna,cont[i]);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			if(ff.isFile())
			{
				System.out.println(cont[i]+" IS FILE");
			}
			
		}
	}
}
public class MyDriveFiles 
{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		String fna;
		System.out.print(" ENTER DRIVE NAME :");
		fna=scan.next();
		
		Drive dd=new Drive();
		String s=":";
		dd.allFiles(fna,s);
	}
}
