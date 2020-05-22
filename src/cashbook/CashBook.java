package cashbook;


public class CashBook {
	//일시, 내용, 수입/지출, 금액, 분류를 등록
	private String date;//일시
	private String content;//내용
	private boolean income;//수입 지출 여부=>true : 수입, false : 지출
	private int money;//금액
	private String type;//분류
	
	public CashBook(int income, String date, String type, String content, 
			int money) {
		this.income = income == 0 ? true : false;
		this.date = date;
		this.type = type;
		this.content = content;
		this.money = money;
	}
	public CashBook() {}
	@Override
	public String toString() {
		return "CashBook [date=" + date + ", content=" + content + ", income=" + income + ", money=" + money + ", type="
				+ type + "]";
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isIncome() {
		return income;
	}
	public void setIncome(boolean income) {
		this.income = income;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
