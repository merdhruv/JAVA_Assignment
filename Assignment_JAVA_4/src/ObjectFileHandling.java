import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortByMarks implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		 if(s1.marks > s2.marks) {
			 return 1;
		 }
		 else
			 return 0;
	}
}


class Student implements Serializable {
	
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
		Student s2 = new Student(1002, "abhinav", 40, "dbda");
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
	
	static void studentFileRead(String str) throws IOException, ClassNotFoundException {
		FileInputStream fi = new FileInputStream(str);
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Student s;

		while((s = (Student) oi.readObject()) != null) {
			s.display();
		}
		fi.close();
		oi.close();
	}
	static void sortObject(String str) throws ClassNotFoundException, IOException {
		FileInputStream fi = new FileInputStream(str);
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Student s;
		ArrayList<Student> sl = new ArrayList<>();
		while((s = (Student) oi.readObject()) != null) {
			sl.add(s);
		}
		for(Student st : sl) {
			SortByMarks sm = new SortByMarks();
			Collections.sort(sl,sm);
		}
		
		for(Student st : sl) {
			st.display();
		}
	}
}


public class ObjectFileHandling {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
//		ObjectFileManager.studentFileWriting();
//		ObjectFileManager.studentFileRead("dac");
		ObjectFileManager.sortObject("dac");	
	}
}
