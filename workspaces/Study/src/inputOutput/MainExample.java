package inputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainExample {

	public static void main(String[] args) throws IOException {
		// �Է� ��¿� scanner �� system.out.print ���� ������ �̰� ó�� �ӵ��� ���� ���̴�.
		// �Է��� �� ������ ó���Ϸ��� ���۵帮�� ���.
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine(); 	// �� �پ� �Է� ����. �� �̿ܿ��� br.�޼ҵ� �پ�
		// 10 20 �� �ٿ� �Է°���								// add throw exception ����.
		String lines[] = line.split(" ");	// �Է� �޴� ���̿� ������ �ǹ�. �� ������ �������� �¿� �Է� �޴� ���� ����.
											// �����ڷ� �޸� ���� �� �־��൵ �ȴ�.
		int a = Integer.parseInt(lines[0]);
		int b = Integer.parseInt(lines[1]);
		
		System.out.println("���Ȯ�� " + a + " " + b);
		// ����� �� ������ ó���Ϸ��� ���۵������ ���
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Hello World!");
		bw.flush();	// ����Ҷ� ������ �ٿ��ִ� ���.
	}

}
