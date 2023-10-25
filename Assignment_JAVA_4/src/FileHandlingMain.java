import java.io.*;


class FileManager{
	static void fileWriter(String str) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String cname;
		FileWriter fw = new FileWriter(str,true);
		while(!(cname = br.readLine()).equals("exit")) {
			fw.write(cname + '\n');
		}
		fw.close();
	}
	
	static void countingStrFile(String str) throws IOException {
		FileReader fr = new FileReader("bok");
		int ch;
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		while((ch = fr.read())!= -1) {
			if(!Character.isWhitespace(ch)) {
				charCount++;
			}
			if(Character.isWhitespace(ch)) {
				wordCount++;
			}
			if(ch == '\n') {
				lineCount++;
			}
		}
		System.out.println("number of char : "+charCount);
		System.out.println("number of Words : "+wordCount);
		System.out.println("number of lines : "+lineCount);
	}
	
	static void searchWord(String str, String searchWord) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String line;
		String [] words = null;
		while((line = br.readLine()) != null) {
			words = line.split(" ");
		}
		for(String w : words) {
			if(w == searchWord) {
				System.out.println("Given Word exists");
			}
			else {
				System.out.println("Given Word doesn't exists");
			}
		}
	}
}


public class FileHandlingMain {

	public static void main(String[] args) throws IOException {
//		FileManager.fileWriter("bok");
//		FileManager.countingStrFile("bok");
		FileManager.searchWord("bok" , "dac");
		
		
	}

}
