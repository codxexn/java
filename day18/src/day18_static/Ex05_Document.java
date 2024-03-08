package day18_static;

class Document {
	
	// static 필드
	static int cnt = 0;
	
	// non-static 필드
	String fileName;
	
	Document() {
		fileName = "새 텍스트 문서" + (++cnt) + ".txt";
	}
	
	Document(String fileName) {
		this.fileName = fileName;
	}
	
	// Method
	void PrintDoc() {
		System.out.println(fileName);
	}
}


public class Ex05_Document {
	public static void main(String[] args) {
	
	Document doc1 = new Document();				//새 텍스트 문서 1.txt
	Document doc2 = new Document();				//새 텍스트 문서 2.txt
	Document doc3 = new Document();				//새 텍스트 문서 3.txt
	Document doc4 = new Document("자바.txt");		//cnt 증가 안하고 자바.txt
	Document doc5 = new Document();				//새 텍스트 문서 4.txt
	
	doc1.PrintDoc();
	doc2.PrintDoc();
	doc3.PrintDoc();
	doc4.PrintDoc();
	doc5.PrintDoc();
	

	}
}
