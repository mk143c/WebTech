import java.io.*;

class ReadandWrite{
	public static void main(String []args){
		BufferedReader br,br1;
		BufferedWriter bw;
		try{
			br = new BufferedReader(new FileReader("1.txt"));
			br1 = new BufferedReader(new FileReader("2.txt"));
			bw = new BufferedWriter(new FileWriter("3.txt"));
			String s = br.readLine();
			while(s != null) 
			{
				bw.write(s);
				bw.newLine();
				s = br.readLine();
			}
			String s2 = br1.readLine();
			while(s2 != null)
			{
				bw.write(s2);
				bw.newLine();
				s2 = br1.readLine();
			}
			bw.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}