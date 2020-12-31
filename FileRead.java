import java.io.*;
class FileRead
{
	public static void main(String args[])
	{
		try 
		{
			FileInputStream fstream=new FileInputStream("textfile.txt");
			DataInputStream in=new DataInputStream(fstream);
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			String strLine;
			while((strLine=br.readLine())!=null)
			{
				System.out.print(strLine);
			}
			in.close();
		}
   		  catch(Exception e) 
		{
			System.out.print("Error:"+e.getMessage());
		}

      }

} 
 