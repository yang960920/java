package ��ǰ����ϱ�;

import ��ǰ�����.TV;

public class TV����ϱ� {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.ch =10;
		tv1.vol=9;
		tv1.onOff=true;
		tv1.ä�����ٲٴ�();
		System.out.println(tv1.ch + " " + tv1.vol +" " +tv1.onOff);
		System.out.println(tv1);
		TV tv2 = new TV();
		tv2.ch =20;
		tv2.vol=15;
		tv2.onOff=false;
		tv2.��Ʃ�꺸��();
		System.out.println(tv2.ch + " " + tv2.vol +" " +tv2.onOff);
		System.out.println(tv2);
	}

}
