package vo;

public class ActionForward {
	
	private String path;	// 최종적으로 가야할 뷰 페이지
	private boolean redirect = true; // 포워딩 방식(리다이렉트 or 디스패쳐)
	
	public void setPath(String path) {
		this.path = path;
	}
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	public String getPath() {
		return path;
	}
	public boolean isRedirect() {
		return redirect;
	}
	
	
}
