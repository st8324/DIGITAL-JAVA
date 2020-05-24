package cashbook2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CashbookMain {
	
	public static void main(String[]args) {
		//실제 파일을 불러오는 기능을 하진 않지만 있다고 했을 때
		List<CashBook> list = FileManager.fileLoad("cashbook.txt");
		CashBookManager cm = new CashBookManager(list);
		cm.run();
		FileManager.fileSave(cm.getList());
	}
}
class FileManager{
	static List<CashBook> fileLoad(String fileName){
		return new ArrayList<CashBook>();
	}
	static void fileSave(List<CashBook> list) {
		
	}
}

