package com.thing.api.model;


public class Session {
	
	private int deviceId;
	private long timestamp;
	private String protocol;
	private String format;
	
	public Session(int deviceId, String protocol, String format, long timestamp) {
		this.deviceId = deviceId;
		this.protocol = protocol;
		this.format = format;
		this.timestamp = timestamp;
	}
	public Session(int deviceId, String protocol, String format) {
		this.deviceId = deviceId;
		this.protocol = protocol;
		this.format = format;
		this.timestamp = System.currentTimeMillis() / 1000L;
	}
	public int getDeviceId() {
		return this.deviceId;
	}
	public String getProtocol() {
		return this.protocol;
	}
	public String getFormat() {
		return this.format;
	}
	public long getTimeStamp() {
		return this.timestamp;
	}
	public void updateTimeStamp() {
		this.timestamp = System.currentTimeMillis() / 1000L;
	}
	public boolean after(long timestamp) {
		return (this.timestamp > timestamp);
	}
	public boolean before(long timestamp) {
		return (this.timestamp < timestamp);
	}
	public String getPingAddress() {
		return "devices/"+deviceId+"/ping";
	}
}
