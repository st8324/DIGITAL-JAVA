package cashbook;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CashbookMain {

	public static void main(String[] args) {
		List<CashBook> list = new ArrayList<CashBook>();
		Scanner scan = new Scanner(System.in);
		CashBook cashBook = inputCashBook(scan);
		registerCashBook(list, cashBook);
		cashBook = inputCashBook(scan);
		registerCashBook(list, cashBook);
		cashBook = inputCashBook(scan);
		registerCashBook(list, cashBook);
		System.out.println(list);
	}
	/* 기능 : 주어진 가계부 내역(CashBook)을 가계부(list)에 저장하는 메소드 
	 * 매개변수 : 가계부, 가계부 내역 => List<CashBook> list, CashBook cashBook
	 * 리턴타입 : 등록 여부 => boolean
	 * 메소드명 : registerCashBook
	 * */
	public static boolean registerCashBook(List<CashBook> list, CashBook cashBook) {
		if(list == null || cashBook == null) 
			return false;
		list.add(cashBook);
		list.sort(new Comparator<CashBook>() {
			@Override
			public int compare(CashBook o1, CashBook o2) {
				/*
				int year1 = Integer.parseInt(o1.getDate().substring(0,4));
				int year2 = Integer.parseInt(o2.getDate().substring(0,4));
				int month1 = Integer.parseInt(o1.getDate().substring(5,7));
				int month2 = Integer.parseInt(o2.getDate().substring(5,7));
				int day1 = Integer.parseInt(o1.getDate().substring(8,10));
				int day2 = Integer.parseInt(o2.getDate().substring(8,10));
				*/
				String arr1[] = o1.getDate().split("-");
				String arr2[] = o2.getDate().split("-");
				for(int i = 0; i<arr1.length ; i++) {
					//arr의 0번지 : 년도
					//arr의 1번지 : 월
					//arr의 2번지 : 일
					if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i]))
						return -1;
					else if(Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i]))
						return 1;
				}
				return 0;
			}
		});
		return true;		
	}
	/* 기능 : 스캐너를 통해 가계부 내역을 입력받아 가계부 내역을 반환하는 메소드
	 * 매개변수 : 스캐너 => Scanner scan
	 * 리턴타입 : 가계부 내역 => CashBook
	 * 메소드명 : inputCashBook
	 * */
	public static CashBook inputCashBook(Scanner scan) {
		System.out.print("수입(0), 지출(1) 여부 : ");
		int income = scan.nextInt();
		Pattern p = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
		Matcher m;
		String date;
		//날짜 패턴이 다른 경우 맞을 때 까지 입력받음
		do {
			System.out.print("날짜(예:2020-05-22) : ");
			date = scan.next();
			m = p.matcher(date);
		}while(!m.matches());
		
		System.out.print("분류                             : ");
		String type = scan.next();
		System.out.print("내용                             : ");
		String content="";
		while((content = scan.nextLine()).trim().length() == 0);
		System.out.print("금액 (원)           : ");
		int money = scan.nextInt();
		CashBook cashBook = new CashBook(income,date,type,content,money);
		return cashBook;
	}
	/* 기능 : 가계부에서 확인하려는 종류에 맞는 검색 결과를 리스트로 반환하는 메소드
	 * 매개변수 : 가계부, 종류, 검색어 => List<CashBook>list, int kind, String search
	 *        kind = 1 : 일시 기준 분류 
	 *        kind = 2 : 수입/지출 기준 분류
	 *        kind = 3 : type 기준 분류 
	 * 리턴타입 : 검색된 가계부 => List<CashBook>
	 * 메소드명 : searchCashBook
	 * */
	public static List<CashBook> searchCashBook(List<CashBook>list, int kind, String search){
		List<CashBook> searchList = new ArrayList<CashBook>();
		switch(kind) {
		case 1:
			Pattern p = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
			Matcher m = p.matcher(search);
			if(!m.matches()) {
				System.out.println("날짜 형태의 검색어가 아닙니다.");
				return null;
			}
			for(CashBook tmp : list) {
				if(tmp.getDate().equals(search))
					searchList.add(tmp);
			}
			return searchList;
		case 2:
			if(!search.equals("수입") && !search.equals("지출")) {
				System.out.println("검색어는 수입 또는 지출이어야 합니다.");
				return null;
			}
			boolean isIncome = search.equals("수입"); 
			for(CashBook tmp : list) {
				if(tmp.isIncome() == isIncome)
					searchList.add(tmp);
			}
			return searchList;
		}
		return null;
	}
}

