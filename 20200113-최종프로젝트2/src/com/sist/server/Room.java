package com.sist.server;
import java.util.*;
public class Room {
	String roomName,roomState,roomPwd;
	int current,maxcount;
	Vector<Server.Client> userVc=new Vector<Server.Client>();
	public Room(String roomName, String roomState, String roomPwd, int maxcount) {
		
		this.roomName = roomName;
		this.roomState = roomState;
		this.roomPwd = roomPwd;
		this.maxcount = maxcount;
		current=1; //방만든사람 1 (방장) Vector 0번인 사람이 ...방장, 방에서 사람이 나갈때 Vector
	}
	
}
