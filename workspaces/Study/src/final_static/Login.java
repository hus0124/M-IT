package final_static;

public class Login {
	int login(String id, String pw){
		if(id.equals("hong") && pw.equals("1234")){
			return Member.LOGIN_SUCCESS; 
		}
		else if(id.equals("hong")){
			return Member.ID_MISMATCH;
		}
		else if(id.equals("hong") && !pw.equals("1234")){
			return Member.PASSWORD_MISMATCH;
		}
		else
			return Member.NOT_EXIST;
	}

}
