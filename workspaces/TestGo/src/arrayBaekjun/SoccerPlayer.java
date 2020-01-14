package arrayBaekjun;

public class SoccerPlayer {
	String name;
	String nation;
	String position;
	int backno;
	
	public SoccerPlayer(String name, String nation, String position, int backno){
		this.name = name;
		this.nation = nation;
		this.position = position;
		this.backno = backno;
	}

	public String getName() {
		return name;
	}

	public String getNation() {
		return nation;
	}

	public String getPosition() {
		return position;
	}

	public int getBackno() {
		return backno;
	}

	
}
