import java.io.*;

class ReadandWriteLinebyLine
{
	public static void main(String []args)
	{
		BufferedReader br1;
		BufferedReader br2;
		BufferedWriter bw;
		try{
			br1 = new BufferedReader(new FileReader("1.txt"));
			br2 = new BufferedReader(new FileReader("2.txt"));
			bw = new BufferedWriter(new FileWriter("3.txt"));
			String s1 = br1.readLine();
			String s2 = br2.readLine();
			while(s1 != null && s2 != null){
				bw.write(s1);
				bw.newLine();
				bw.write(s2);
				bw.newLine();
				s1 = br1.readLine();
				s2 = br2.readLine();
			}
			bw.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}