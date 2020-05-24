package cashbook2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CashBookManager {
	private List<CashBook> list = new ArrayList<CashBook>();
	private Scanner scan = new Scanner(System.in);
	
	public List<CashBook> getList() {
		return list;
	}

	public CashBookManager(List<CashBook> list) {
		this.list = list;
	}
	
	//가게부 실행
	public void run() {
		int menu;		//메뉴
		do {
			menu = printMenu();
			switch(menu) {
			case 1:		FunctionRegister();			break;
			case 2:		FunctionModify();			break;
			case 3:		FunctionSearch();			break;
			case 4:
				System.out.println("──────────────────────────────");
				System.out.println("프로그램을 종료합니다.");
				System.out.println("──────────────────────────────");
				return;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}while(true);
		
	}
	
	private void FunctionRegister() {
		CashBook cashBook = inputCashBook();
		System.out.println("──────────────────────────────");
		if(registerCashBook(list, cashBook)) 
			System.out.println("가계내역을 등록했습니다.");	
		else
			System.out.println("가계내역 등록에 실패했습니다.");
		System.out.println("──────────────────────────────");
	}
	private void FunctionModify() {
		int index;
		char subMenu;
		System.out.println("──────────────────────────────");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i+1+". "+list.get(i));
		}
		System.out.println("──────────────────────────────");
		do{
			System.out.print("수정할 가계 내역을 선택하세요 : ");
			index = scan.nextInt();
			System.out.println(list.get(index-1) +" 항목이 맞습니까?(y/n)");
			subMenu = scan.next().charAt(0);
		}while(subMenu == 'n');
		CashBook cashBook = inputCashBook();
		System.out.println("──────────────────────────────");
		if(modifyCashBook(list, index, cashBook)) 
			System.out.println("가계내역을 등록했습니다.");	
		else
			System.out.println("가계내역 등록에 실패했습니다.");
		System.out.println("──────────────────────────────");
	}
	private void FunctionSearch() {
		int kind;
		String search;
		List<CashBook> subList = null;
		System.out.println("──────────────────────────────");
		System.out.println("1. 일시 ");
		System.out.println("2. 수입/지출 ");
		System.out.println("3. 분류");
		System.out.println("──────────────────────────────");
		do{
			System.out.print("기준을 선택하세요 : ");
			kind = scan.nextInt();
		}while(kind > 3 || kind < 1);
		System.out.print("검색어를 입력하세요 : ");
		while((search = scan.nextLine()).trim().length() == 0);
		
		subList = searchCashBook(list, kind, search);
		System.out.println("──────────────────────────────");
		if(subList != null)
			for(int i = 0; i<subList.size(); i++) {
				System.out.println(i+1+". "+subList.get(i));
			}
		else
			System.out.println("검색된 내역이 없습니다.");
		System.out.println("──────────────────────────────");
	}
	private int printMenu() {
		System.out.println("┌─────────────────────────────");
		System.out.println("│1  가계내역 등록                   ");
		System.out.println("│2  가계내역 수정                   ");
		System.out.println("│3  가계내역 확인                   ");
		System.out.println("│4  프로그램 종료                   ");
		System.out.println("└─────────────────────────────");
		System.out.print("메뉴를 선택하세요 : ");
		int menu = scan.nextInt();
		System.out.println("──────────────────────────────");
		return menu;
	}
	/* 기능 : 주어진 가계부 내역(CashBook)을 가계부(list)에 저장하는 메소드 
	 * 매개변수 : 가계부, 가계부 내역 => List<CashBook> list, CashBook cashBook
	 * 리턴타입 : 등록 여부 => boolean
	 * 메소드명 : registerCashBook
	 * */
	private boolean registerCashBook(List<CashBook> list, CashBook cashBook) {
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
	private CashBook inputCashBook() {
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
	private List<CashBook> searchCashBook(List<CashBook>list, int kind, String search){
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
			if(list == null || list.size() == 0 ) return null;
			for(CashBook tmp : list) {
				if(tmp.isIncome() == isIncome)
					searchList.add(tmp);
			}
			return searchList;
		case 3:
			for(CashBook tmp : list) {
				if(tmp.getType().equals(search))
					searchList.add(tmp);
			}
			return searchList;
		}
		return null;
	}
	/* 기능 : 가계부에서 수정할 위치를 알려주면 수정 항목으로 수정하는 메소드
	 * 리턴타입 : 수정 여부 => boolean
	 * 메소드명 : modifyCashBook
	 * 매개변수 : 가계부, 수정할 위치, 수정항목 => List<CashBook>list, int index, CashBook cashBook
	 * */
	private boolean modifyCashBook(List<CashBook>list, int index, CashBook cashBook) {
		if(list == null || cashBook == null || list.size() < index)
			return false;
		//list.set(index-1, cashBook);
		list.remove(index-1);
		registerCashBook(list, cashBook);
		return true;
	}
}
