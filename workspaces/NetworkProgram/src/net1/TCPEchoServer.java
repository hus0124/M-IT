package net1;	// 네트워크 처리하기 위한 기본.

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
	private ServerSocket server = null;

	public TCPEchoServer(int port) {
		try {
		server = new ServerSocket(port);	// 이 객체는 메인함수 안에 있어선 안 된다. 다른 생애주기를 가져야 한다. 
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public void process() {	//실행준비 되었거나 호출되어 실행되는 프로그램들이 프로세스 
		while(true) {	//서버의 프로세스의 생명주기는 while, 강제종료 전까진 반복
		try{
			Socket con =server.accept();
			BufferedInputStream bis = null;
	        BufferedOutputStream bos = null;
			bis = new BufferedInputStream(con.getInputStream());	// 버퍼드 인풋, 아웃풋스트림 : 전송 인 아웃을 묶어 처리해주는 개념의 객체
			bos = new BufferedOutputStream(con.getOutputStream());
		
			String str="";
			byte buf[] = new byte[256]; // 
			int len=0;
			
		while((len=bis.read(buf,0,buf.length)) != -1) {	// -1 이란 의미는 없단 것. 없을때까지 읽어들인다는 의미.
			str = str + new String(buf,0,len);
			bos.write(buf, 0, len);
			bos.flush();
			
			if(str.indexOf("\n") != -1)
			break;
		}
		System.out.println("수신한 메시지 : " + str);
		bos.close();
		bis.close();
		con.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		
	}
	}
	public static void main(String[] args) {
		if(args.length != 1) {	// args 사용해서 아이피나 포트번호 하나 직접 입력 받을 때 에러 나지 않게 방지하는 처리.
			System.out.println("파라미터 : < 포트번호 >");
			System.exit(0);
		}
		int port=Integer.parseInt(args[0]);
		
		TCPEchoServer server = new TCPEchoServer(port);

		server.process();
	}

}
