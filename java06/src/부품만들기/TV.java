package ��ǰ�����;

public class TV {
	//��� ����, ������ Ŭ���� �ٷ� �Ʒ��� �Ǿ��ֱ� ������
	//Ŭ���� ��ü �������� �� ������ ����� �� ����
	//��������(=global����, �۷ι� ����)
	//��������� �ڵ� �ʱ�ȭ�� ������ , ���������� �ڵ��ʱ�ȭ
	public int ch; //0���� �ڵ� �ʱ�ȭ
	public int vol; //0���� �ڵ� �ʱ�ȭ
	public boolean onOff; // false
	
	public void ä�����ٲٴ�() {
		int change = 1; // ��������, local���� , ���ú���, �ڵ��ʱ�ȭ XXX
		System.out.println(ch + "����" +change + "�� �ٲٴ�.");
	}
	public void ��Ʃ�꺸��() {// �޼��带 ����°� ==> �޼��� �����Ѵ�
		System.out.println(vol + "�� Ű���� �������� ����.");
	}
	
	
}
