import java.io.*;

class WriteRollno
{
	public static void main(String []args)
	{
		BufferedWriter bw;
		BufferedReader br1,br2;

		try{
			br1 = new BufferedReader(new FileReader("Roll.txt"));
			bw = new BufferedWriter(new FileWriter("newroll.txt"));
			String s1 = br1.readLine();
			while(s1 != null)
			{
				boolean flag = false;
				br2 = new BufferedReader(new FileReader("newroll.txt"));
				String s2 = br2.readLine();
				while(s2 != null){
					if(s1.equals(s2)){
						flag = true;
						break;					}
					s2 = br2.readLine();
				}
				if(!flag){
					bw.write(s1);
					bw.newLine();
					bw.flush();
				}
				s1 = br1.readLine();
			}
		}
		catch(Exception e){}
	}
}