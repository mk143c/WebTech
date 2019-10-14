import java.io.*;


class NewFileForExtra
{
	public static void main(String[] args) {
		File f;
		BufferedReader br1,br2;
		BufferedWriter bw;
		try{
			f = new File("xyz.txt");
				if(!f.exists()){
					f.createNewFile();
				}
			br1 = new BufferedReader(new FileReader("Roll.txt"));
			bw = new BufferedWriter(new FileWriter(f));
			String line1 = br1.readLine();
			while(line1 != null){
				boolean flag = true;
				br2 = new BufferedReader(new FileReader("newroll.txt"));
				String line2 = br2.readLine();
				while(line2 != null){
					if(line1.equals(line2)){
						flag = false;
						break;
					}
					line2 = br2.readLine();
				}
				if(flag){
					bw.write(line1);
					bw.newLine();
					bw.flush();
				}
				line1 = br1.readLine();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}