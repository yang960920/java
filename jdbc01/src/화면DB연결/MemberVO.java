package 화면DB연결;

public class MemberVO {
	// MemberVO 가방에 넣은 데이터는 Member테이블에 들어갈 예정
	// 각 컬럼과 일치 시켜줌
	private String id;
	private String pw;
	private String name;
	private String tel;

	// 가방에 하나씩 값을 넣어주어야 함. ==> setter
	public void setId(String id) {
		this.id = id;
	}
	
	// 가방에 하나씩 값을 꺼내주어야함. ==>getter
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPw() {
		return pw;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
	
	
	
}
