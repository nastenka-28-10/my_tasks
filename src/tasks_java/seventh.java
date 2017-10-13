package tasks_java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class seventh {
	public static void main(String args[]) throws IOException{
		File myfile = new File(args[0]);
		long FileSize = myfile.length();
		System.out.println("File size: "+FileSize+" bytes    strings: "+FileSize/124);		
		
		ArrayList<String> list = new ArrayList<String>((int) (FileSize/124));
			
		FileReader read_file = new FileReader(myfile);
		BufferedReader reader = new BufferedReader(read_file);
		String line;
		int count_line=0;
		while ((line = reader.readLine()) != null) {
			list.add(count_line, line);
			count_line++;
		}
		reader.close();
		final Random random = new Random();    
		int num_rand = Integer.parseInt(args[1]);
		for (int i = 0; i < num_rand; i++) {
			System.out.println(list.get(random.nextInt(num_rand)));
		}
	}
}