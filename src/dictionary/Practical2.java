package dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Practical2 {

	public static void main(String[] args) {

		doesFileExist(null);

	}

	public static void doesFileExist(String path) {
		String path1 = "src\\data\\textFile";

		File f = new File(path1);
		FileReader fr;

		try {

			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);

				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}