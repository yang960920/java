package 상속;

public class 영웅사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.name = "홍길동";
		p.age = 100;
		System.out.println(p);
		p.eat();
		
		맨 m = new 맨();
		m.run();
		
		슈퍼맨 s = new 슈퍼맨();
		s.name = "클라크";
		s.age = 25000;
		s.power = 500000;
		s.fly = true;
		s.eat();
		s.run();
		s.sleep();
		System.out.println(s);
		
		원더우먼 w = new 원더우먼();
		w.name = "이하늬";
		w.age = 35;
		w.power = 350000;
		w.cry = false;
		w.jump();
		w.thro();
		w.eat();
		System.out.println(w);
	}

}
