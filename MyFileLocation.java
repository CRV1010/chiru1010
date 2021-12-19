import java.io.File;
import java.util.Scanner;

class Location 
{
	String file;
	Location(String file)
	{
		this.file=file;
	}
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
				try{
					allFiles(fna,cont[i]);
				}catch(Exception e) {}
			}
			if(ff.isFile())
			{
				if(cont[i].equals(file))
				{
					System.out.println(file+" IS FOUND AT "+f.getAbsolutePath());
					System.exit(0);
				}
			}	
		}
	}
}

public class MyFileLocation
{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		String fna,file;
		System.out.print(" ENTER FILE NAME :");
		file=scan.next();
		System.out.print(" ENTER DRIVE NAME TO FIND FILE :");
		fna=scan.next();
		
		Location l=new Location(file);
		String s=":";
		l.allFiles(fna,s);
	}
}
