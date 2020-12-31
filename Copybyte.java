import java.io.*;
class Copybyte

{
	public static void main(String args[])
	{
		FileInputStream infile=null;
		FileOutputStream outfile=null;
		byte byteRead;
		Writer w=null;
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a string to write in file:");
			String t=br.readLine();
			File f=new File("in.txt");
            		w=new BufferedWriter(new FileWriter(f));
			w.write(t);
		}
		catch(Exception e)
		{
			System.out.println("File not found");
		}
		try

 	           {
			if(w!=null)
			{
				w.close();
			}
		   }
		catch(IOException e)
		{
			System.out.println(e);
		}
		try 
		{
			infile=new FileInputStream("in.txt");
			outfile=new FileOutputStream("out.txt");
			do
			{
				byteRead=(byte)infile.read();
				outfile.write(byteRead);
				outfile.flush();
			}while(byteRead!=-1);
			
		}
		catch(FileNotFoundException e) 
		{
			System.out.print("File not found");
		} 
		catch(IOException e) 
		{
			System.out.print("IOError");
		}
		finally
		{
			try
			{
				infile.close();
				outfile.close();
			}
			catch(Exception e) 
			{
				System.out.print(e);
			}
		}

      }

} 
 