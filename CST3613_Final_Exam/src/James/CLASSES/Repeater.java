package James.CLASSES;

public class Repeater {
	private String RPID;
	private String assignedTo;
	
	
	public Repeater(String rPID, String assignedTo) {
		super();
		RPID = rPID;
		this.assignedTo = assignedTo;
	}


	public String getRPID() {
		return RPID;
	}


	public void setRPID(String rPID) {
		RPID = rPID;
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
