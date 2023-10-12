package James.CLASSES;

import java.util.TreeMap;

import James.ENUMS.NetworkStatus;
import James.ENUMS.NetworkTypes;

public class Network {
	private String netName;
	private NetworkTypes netType;
	private double bandwidth;
	private double optimumBW;
	private double maxBW;
	private double minBW;
	private boolean cSwitched;
	private NetworkStatus status;
	private TreeMap<String,Hub> hubs;
	private TreeMap<String,Repeater> repeaters;
	private TreeMap<String,Router> routers;
	private TreeMap<String,Switch> switches;
	
	public Network(String netName, NetworkTypes netType, double bandwidth, double optimumBW, double maxBW, double minBW,
			boolean cSwitched, NetworkStatus status, TreeMap<String, Hub> hubs, TreeMap<String, Repeater> repeaters,
			TreeMap<String, Router> routers, TreeMap<String, Switch> switches) {
		super();
		this.netName = netName;
		this.netType = netType;
		this.bandwidth = bandwidth;
		this.optimumBW = optimumBW;
		this.maxBW = maxBW;
		this.minBW = minBW;
		this.cSwitched = cSwitched;
		this.status = status;
		this.hubs = hubs;
		this.repeaters = repeaters;
		this.routers = routers;
		this.switches = switches;
	}

	public String getNetName() {
		return netName;
	}

	public void setNetName(String netName) {
		this.netName = netName;
	}

	public NetworkTypes getNetType() {
		return netType;
	}

	public void setNetType(NetworkTypes netType) {
		this.netType = netType;
	}

	public double getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(double bandwidth) {
		this.bandwidth = bandwidth;
	}

	public double getOptimumBW() {
		return optimumBW;
	}

	public void setOptimumBW(double optimumBW) {
		this.optimumBW = optimumBW;
	}

	public double getMaxBW() {
		return maxBW;
	}

	public void setMaxBW(double maxBW) {
		this.maxBW = maxBW;
	}

	public double getMinBW() {
		return minBW;
	}

	public void setMinBW(double minBW) {
		this.minBW = minBW;
	}

	public boolean iscSwitched() {
		return cSwitched;
	}

	public void setcSwitched(boolean cSwitched) {
		this.cSwitched = cSwitched;
	}

	public NetworkStatus getStatus() {
		return status;
	}

	public void setStatus(NetworkStatus status) {
		this.status = status;
	}

	public TreeMap<String, Hub> getHubs() {
		return hubs;
	}

	public void setHubs(TreeMap<String, Hub> hubs) {
		this.hubs = hubs;
	}

	public TreeMap<String, Repeater> getRepeaters() {
		return repeaters;
	}

	public void setRepeaters(TreeMap<String, Repeater> repeaters) {
		this.repeaters = repeaters;
	}

	public TreeMap<String, Router> getRouters() {
		return routers;
	}

	public void setRouters(TreeMap<String, Router> routers) {
		this.routers = routers;
	}

	public TreeMap<String, Switch> getSwitches() {
		return switches;
	}

	public void setSwitches(TreeMap<String, Switch> switches) {
		this.switches = switches;
	}

	@Override
	public String toString() {
		return "<html>" +"<h3>"+ "Network Name: " + netName + "<br>"+
				"Network Type: " + netType + "<br>"+
				"Bandwidth: " + bandwidth +  "<br>"+
				"HUBS: " + hubs + "<br>"+
				"REPEATERS: " + repeaters + "<br>"+
				"ROUTERS: " + routers + "<br>"+ 
				"SWITCHES: "+ switches+"</h3>"+"</html>";
	}
	
	
	
	
}
