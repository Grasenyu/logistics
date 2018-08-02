package com.sanyang.logistics03.vo;

public class Channel {
	
	private Integer channel_id;
	
	private String channelno;
	
	private Integer wh_id;
	
	public Channel() {
		// TODO Auto-generated constructor stub
	}

	public Channel(Integer channel_id, String channelno, Integer wh_id) {
		super();
		this.channel_id = channel_id;
		this.channelno = channelno;
		this.wh_id = wh_id;
	}

	public Integer getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(Integer channel_id) {
		this.channel_id = channel_id;
	}

	public String getChannelno() {
		return channelno;
	}

	public void setChannelno(String channelno) {
		this.channelno = channelno;
	}

	public Integer getWh_id() {
		return wh_id;
	}

	public void setWh_id(Integer wh_id) {
		this.wh_id = wh_id;
	}

	@Override
	public String toString() {
		return "Channel [channel_id=" + channel_id + ", channelno=" + channelno + ", wh_id=" + wh_id + "]";
	}
	
	

}
