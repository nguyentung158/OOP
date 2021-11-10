import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;




public class PhanTu<T> {
	private T t;
	
	public boolean isGreaterThan(T a) {
		return ((Comparable<T>) t).compareTo(a) > 0;
	}
	
	public void handleFile(String input, String output) {
		List<String> list = new ArrayList<>();
		try {
			FileReader fileReader = new FileReader(input);
			BufferedReader buf = new BufferedReader(fileReader);
			//store first value of english word
			String number;
			while ((number = buf.readLine()) != null) {
				list.add(number);
				System.out.println(number);
			}
			// close file
			
			buf.close();
		} catch (IOException e) {
			System.out.println("An error");
		} 
		//Collections.sort(list);
		try {
			FileWriter fileWriter = new FileWriter(output);
			BufferedWriter buf = new BufferedWriter(fileWriter);
			// write to file from current dictionary
			for (String word : list) {
				buf.write(word);
				buf.newLine();
			}
			buf.close();
		} catch (Exception e) {
			System.out.println("Something went wrong: " + e);
		}
	}
}
