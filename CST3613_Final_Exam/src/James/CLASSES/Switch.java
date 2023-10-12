package James.CLASSES;

public class Switch {
	private String SID;
	private String assignedTo;
	
	
	public Switch(String sID, String assignedTo) {
		super();
		SID = sID;
		this.assignedTo = assignedTo;
	}


	public String getSID() {
		return SID;
	}


	public void setSID(String sID) {
		SID = sID;
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
