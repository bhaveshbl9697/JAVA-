import java.io.*;

class BW

{

       

      public static void main(String args[]) throws Exception

      {
		Writer w=null;
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a string to wrote in file:");
			String t=br.readLine();
			File f=new File("wr.text");
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
	}
}	