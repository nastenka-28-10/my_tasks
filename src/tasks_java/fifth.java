package tasks_java;

import java.io.IOException;
import java.nio.file.*;


public class fifth {
	public static void main(String args[]) throws IOException{
		Path ToSrc = Paths.get("C:\\Program Files\\Java\\jdk1.8.0_144\\src");		
		Files.walk(ToSrc).filter(file->Files.isRegularFile(file))
		.filter((p)->key(p, "transient"))
		.filter((p)->key(p, "volatile"))
		.forEach(System.out::println);	
	}
	
	public static boolean key(Path path, String word){	
		boolean HasKey;
		try {
			HasKey = Files.lines(path).anyMatch((s)->s.contains(word));
		}catch (Exception e) {
			e.printStackTrace();
			HasKey=false;
		}
		return HasKey;
	}
}