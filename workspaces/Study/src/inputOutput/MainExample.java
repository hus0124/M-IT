package inputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainExample {

	public static void main(String[] args) throws IOException {
		// 입력 출력에 scanner 와 system.out.print 보통 쓰지만 이건 처리 속도가 느린 편이다.
		// 입력할 때 빠르게 처리하려면 버퍼드리더 사용.
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine(); 	// 한 줄씩 입력 받음. 그 이외에도 br.메소드 다양
		// 10 20 한 줄에 입력가능								// add throw exception 적용.
		String lines[] = line.split(" ");	// 입력 받는 사이에 공백을 의미. 이 공백을 기준으로 좌우 입력 받는 것을 나눔.
											// 구분자로 콤마 같은 걸 넣어줘도 된다.
		int a = Integer.parseInt(lines[0]);
		int b = Integer.parseInt(lines[1]);
		
		System.out.println("출력확인 " + a + " " + b);
		// 출력할 때 빠르게 처리하려면 버퍼드라이터 사용
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Hello World!");
		bw.flush();	// 출력할때 마무리 붙여주는 용법.
	}

}
