package net1;	// ��Ʈ��ũ ó���ϱ� ���� �⺻.

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
	private ServerSocket server = null;

	public TCPEchoServer(int port) {
		try {
		server = new ServerSocket(port);	// �� ��ü�� �����Լ� �ȿ� �־ �� �ȴ�. �ٸ� �����ֱ⸦ ������ �Ѵ�. 
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public void process() {	//�����غ� �Ǿ��ų� ȣ��Ǿ� ����Ǵ� ���α׷����� ���μ��� 
		while(true) {	//������ ���μ����� �����ֱ�� while, �������� ������ �ݺ�
		try{
			Socket con =server.accept();
			BufferedInputStream bis = null;
	        BufferedOutputStream bos = null;
			bis = new BufferedInputStream(con.getInputStream());	// ���۵� ��ǲ, �ƿ�ǲ��Ʈ�� : ���� �� �ƿ��� ���� ó�����ִ� ������ ��ü
			bos = new BufferedOutputStream(con.getOutputStream());
		
			String str="";
			byte buf[] = new byte[256]; // 
			int len=0;
			
		while((len=bis.read(buf,0,buf.length)) != -1) {	// -1 �̶� �ǹ̴� ���� ��. ���������� �о���δٴ� �ǹ�.
			str = str + new String(buf,0,len);
			bos.write(buf, 0, len);
			bos.flush();
			
			if(str.indexOf("\n") != -1)
			break;
		}
		System.out.println("������ �޽��� : " + str);
		bos.close();
		bis.close();
		con.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		
	}
	}
	public static void main(String[] args) {
		if(args.length != 1) {	// args ����ؼ� �����ǳ� ��Ʈ��ȣ �ϳ� ���� �Է� ���� �� ���� ���� �ʰ� �����ϴ� ó��.
			System.out.println("�Ķ���� : < ��Ʈ��ȣ >");
			System.exit(0);
		}
		int port=Integer.parseInt(args[0]);
		
		TCPEchoServer server = new TCPEchoServer(port);

		server.process();
	}

}
