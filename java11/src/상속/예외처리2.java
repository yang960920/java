package ���;

import java.io.FileWriter;
import java.io.IOException;

public class ����ó��2 {

	public static void main(String[] args) {
		FileWriter file;
		try {
			file = new FileWriter("test.txt");
			file.write("�ȳ�\n");
			file.write("���̹���\n");
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
