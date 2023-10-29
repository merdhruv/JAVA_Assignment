import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;

class SortByMarks implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		 return s1.marks - s2.marks;
	}
}


class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int sid;
	String sname;
	int marks;
	String subject;
	
	Student(int sid, String sname, int marks, String subject){
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		this.subject = subject;
	}

	public void display() {
		System.out.println(sid+sname+marks+subject);
	}
	
	
}
class ObjectFileManager{
	static void studentFileWriting() throws IOException {
		Student s1 = new Student(1001, "dhruv", 70,  "dac");
		Student s2 = new Student(1002, "abhinav", 40, "dac");
		Student s3 = new Student(1003, "aryan", 60, "dac");
		
		FileOutputStream fo = new FileOutputStream("dac");
		
		ObjectOutputStream os = new ObjectOutputStream(fo);
		
		os.writeObject(s1);
		os.writeObject(s2);
		os.writeObject(s3);
		System.out.println("Object written");
		
		os.close();
		fo.close();
	}
	
	static void studentFileRead() throws IOException, ClassNotFoundException {
		FileInputStream fi = new FileInputStream("dac");
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Student s;
		try {
			
			while((s = (Student) oi.readObject()) != null) {
				s.display();
			}
		}
		catch(EOFException e) {
			System.out.println(e.getMessage());
			//System.out.println("File not Found");
		}
		fi.close();
		oi.close();
	}
	static void sortObject() throws ClassNotFoundException, IOException {
		FileInputStream fi = new FileInputStream("dac");
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Student s;
		ArrayList<Student> sl = new ArrayList<>();
		try {
			while((s = (Student) oi.readObject()) != null) {
			
				sl.add(s);
			}
		}
		catch(EOFException e) {
			System.out.println("File not Found");
		}
		try {
			SortByMarks sm = new SortByMarks();
			Collections.sort(sl,sm);
		}
		catch(ConcurrentModificationException e) {
			System.out.println("not sorted");
		}
		
		
		for(Student st : sl) {
			st.display();
		}
	}
	
	static void getResult() throws ClassNotFoundException, IOException {
		FileInputStream fi = new FileInputStream("dac");
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Student s;
		ArrayList<Student> sl = new ArrayList<>();
		try {
			while((s = (Student) oi.readObject()) != null) {
				sl.add(s);
			}
		}
		catch(EOFException e) {
			System.err.println(e.getMessage());
			//System.out.println("File not Found");
		}
		
		ArrayList <String> result = new ArrayList<>();
		
		for(int i = 0; i < sl.size(); i++) {
			if( sl.get(i).marks < 50) {
				result.add("fail") ;
			}
			else {
				result.add("Pass");
			}	
		}
		
		for(int i = 0; i < sl.size(); i++) {
			sl.get(i).display();
			System.out.println(result.get(i));
		}	
		
	}
	
	static void noOfPassed(String sub) throws ClassNotFoundException, IOException {
		FileInputStream fi = new FileInputStream("dac");
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Student s;
		ArrayList<Student> sl = new ArrayList<>();
		try {
			while((s = (Student) oi.readObject()) != null) {
			
				sl.add(s);
			}
		}
		catch(EOFException e) {
			System.out.println(e.getMessage());
		}
		int passed=0 , failed=0;
		for(Student st : sl) {
			if(st.subject == sub) {
				if(st.marks < 50) {
					failed++;
				}
				else {
					passed++;
				}
			}
		}
		System.out.println("No of Student passed in "+ sub + " "+ passed);
		System.out.println("No of Student failed in "+ sub + " "+ failed);
	}
	
}


public class ObjectFileHandling {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectFileManager.studentFileWriting();
		System.out.println("-----------------------------------");
//		ObjectFileManager.studentFileRead();
		ObjectFileManager.sortObject();	
//		System.out.println("------------------------------------");
//		ObjectFileManager.getResult();	
//		ObjectFileManager.noOfPassed("dac");	
	}
}
