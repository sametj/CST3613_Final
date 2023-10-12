package James.CLASSES;

public class Router {
	private String RID;
	private String assignedTo;
	public Router(String rID, String assignedTo) {
		super();
		RID = rID;
		this.assignedTo = assignedTo;
	}
	public String getRID() {
		return RID;
	}
	public void setRID(String rID) {
		RID = rID;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	@Override
	public String toString() {
		return "";
	}
	
	
	
}
