package James.CLASSES;

public class Hub {
	private String HID;
	private String assignedTo;
	
	public Hub(String hID, String assignedTo) {
		super();
		HID = hID;
		this.assignedTo = assignedTo;
	}

	public String getHID() {
		return HID;
	}

	public void setHID(String hID) {
		HID = hID;
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

