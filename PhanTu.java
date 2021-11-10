import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
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
		List<Integer> list = new ArrayList<>();
		try {
			FileReader fileReader = new FileReader(input);
			BufferedReader buf = new BufferedReader(fileReader);
			//store first value of english word
			int number;
			while ((number = buf.read()) != -1) {
				list.add(number);
				System.out.println(number);
			}
			// close file
			Collections.sort(list);
			PrintWriter writer = new PrintWriter(output);

		    // write down data
		    for(int newNumber : list){
		        writer.println(newNumber);
		    }
		    writer.flush();
		    writer.close();
			buf.close();
		} catch (IOException e) {
			System.out.println("An error");
		} 
	}
}