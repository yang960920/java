package ����;

import javax.print.attribute.standard.JobSheets;

public class �迭����� {

	public static void main(String[] args) {
		// 1. �迭 ����� - �̹� ���� �˰� �ִ� ���
		String[] hobby = {"run","book","swim","walk"};
		// hobby �� �⺻������ (����1��, ���� , �Ǽ� ,����) �� �ƴϰ� ����������
		// ������ ������ �ּҰ� �������
		// ������[] ��ȣ �ȿ� �ε������ ���� ��.
		System.out.println(hobby);
		System.out.println("0: " + hobby[0]);
		System.out.println("1: " + hobby[1]);
		System.out.println(hobby.length);
		//hobby.length ���� . �� ���� �����ڷν� hobby�� �ִ� length�� �˷��� ��¶�
		System.out.println(hobby[3]);
		System.out.println(hobby[hobby.length - 1]);
		//for���� cŸ�� �� ��κ�
		for (int i = 0; i < hobby.length; i++) {
			// i ==> index �� ���� , 0 ,1 ,2 �� �⺻������ �ε����� 1�� ������
			System.out.println(i+": " + hobby[i]);
		}
		// hobby.length -1 �� length �� ��ġ�� �׻� �� ������ �̱� ������
		// ���������� �ϳ� ���� ���� ����Ʈ �ض� ��� ������
		// hobby[3] = hobby[hobby.length -1] �Ȱ��� ���̴�.
		
		// for-each �� : �˾Ƽ� ó������ index�� 1�� �����ϸ鼭 
		// �ϳ��� �����ش�.
		// for (String ���� : ����������)
		
		//��¿�!!
		for (String x : hobby) {
			System.out.println(x);
		}
		
		
		// 2. �迭 ����� - ���� �𸣰� �ִ� ���, �������� ��������.
		String[] job = new String[5];
		System.out.println(job);
		job[0] = "�鿣�� ���α׷���";
		job[1] = "ī�� ����";
		System.out.println(job[0]);
		System.out.println(job[1]);
		System.out.println();
		for (int i = 0; i < job.length; i++) {
			System.out.println(i+": " + job[i]);
		}
	}

}
