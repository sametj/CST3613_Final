package James.INTERFACES;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeMap;
import James.CLASSES.*;
import James.DB.DBSupport;
import James.ENUMS.NetworkStatus;
import James.ENUMS.NetworkTypes;
public interface NetworkBuilding {

		public static TreeMap<String,Network> buildNetwork() throws SQLException{
			Connection conn = DBSupport.establishConnection();
			Statement use =  conn.createStatement();
			use.execute("USE imperial_defense");
			String query = "SELECT * FROM Network";
			Statement queryStatement = conn.createStatement();	
			ResultSet rs = queryStatement.executeQuery(query);
			TreeMap<String,Network> N = new TreeMap<>();
			while(rs.next()) {
				String A = rs.getString("NetName");
				String B = rs.getString("NetType");
				NetworkTypes nt = null;
				if (B.equals("DATA")) {
					nt = NetworkTypes.DATA;
				}
				if (B.equals("COMM")) {
					nt = NetworkTypes.COMM;
				}
				if (B.equals("VIDEO")) {
					nt = NetworkTypes.VIDEO;
				}
				double C = rs.getDouble("Bandwidth");
				double D = rs.getDouble("OptimumBW");
				double E = rs.getDouble("MaxBW");
				double F = rs.getDouble("MinBW");
				int G = rs.getInt("CSwitched");
				boolean bool;
				if (G == 0) {
					 bool = true;
				}else {
					bool = false;
				}
				String H = rs.getString("NetStatus");
				NetworkStatus ns = null;
				if(H.equals("ONLINE")) {
					ns = NetworkStatus.ONLINE;
				}else {
					ns = NetworkStatus.OFFLINE;
				}
				TreeMap<String,Hub> hubs = buildHubs(A);
				TreeMap<String,Repeater> repeaters = buildRepeaters(A);;
				TreeMap<String,Router> routers = buildRouters(A);
				TreeMap<String,Switch> switches = buildSwitches(A);
				
				Network n = new Network(A,nt,C,D,E,F,bool,ns,hubs,repeaters,routers,switches);
				N.put(n.getNetName(), n);				
			}
			return N;
			
		}
		
		public static TreeMap<String,Hub> buildHubs(String net) throws SQLException{
			Connection conn = DBSupport.establishConnection();
			Statement use =  conn.createStatement();
			use.execute("USE imperial_defense");
			String query = "SELECT * FROM Hub WHERE AssignedTo='" + net + "'";
			Statement queryStatement = conn.createStatement();	
			ResultSet rs = queryStatement.executeQuery(query);
			TreeMap<String,Hub> H = new TreeMap<>();
			while(rs.next()) {
				String A = rs.getString("HID");
				String B = rs.getString("AssignedTo");
				
				Hub h = new Hub(A,B);
				H.put(h.getHID(),h);
			}
			conn.close();
			return H;
			
		}
		
		public static TreeMap<String,Repeater> buildRepeaters(String net) throws SQLException{
			Connection conn = DBSupport.establishConnection();
			Statement use =  conn.createStatement();
			use.execute("USE imperial_defense");
			String query = "SELECT * FROM Repeater WHERE AssignedTo='" + net + "'";
			Statement queryStatement = conn.createStatement();	
			ResultSet rs = queryStatement.executeQuery(query);
			TreeMap<String,Repeater> R = new TreeMap<>();
			while(rs.next()) {
				String A = rs.getString("RPID");
				String B = rs.getString("AssignedTo");
				Repeater r = new Repeater(A,B);
				R.put(r.getRPID(), r);
			}
			return R;
			
		}
		public static TreeMap<String,Router> buildRouters(String net) throws SQLException{
			Connection conn = DBSupport.establishConnection();
			Statement use =  conn.createStatement();
			use.execute("USE imperial_defense");
			String query = "SELECT * FROM Router WHERE AssignedTo='" + net + "'";
			Statement queryStatement = conn.createStatement();	
			ResultSet rs = queryStatement.executeQuery(query);
			TreeMap<String,Router> R = new TreeMap<>();
			while(rs.next()) {
				String A = rs.getString("RID");
				String B = rs.getString("AssignedTo");
				Router r = new Router(A,B);
				R.put(r.getRID(), r);
			}
			return R;
			
		}
		
		public static TreeMap<String,Switch> buildSwitches(String net) throws SQLException{
			Connection conn = DBSupport.establishConnection();
			Statement use =  conn.createStatement();
			use.execute("USE imperial_defense");
			String query = "SELECT * FROM Switch WHERE AssignedTo='" + net + "'";
			Statement queryStatement = conn.createStatement();	
			ResultSet rs = queryStatement.executeQuery(query);
			TreeMap<String,Switch> S = new TreeMap<>();
			while(rs.next()) {
				String A = rs.getString("SID");
				String B = rs.getString("AssignedTo");
				
				Switch s = new Switch(A,B);
				S.put(s.getSID(), s);
			}
			return S;
			
		}
		
}
