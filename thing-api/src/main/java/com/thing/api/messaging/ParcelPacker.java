package com.thing.api.messaging;

/**
 * Name: ParcelPacker
 * ---------------------------------------------------------------
 * Desc: The ParcelPacker class is responsible for packaging
 * 		 given data into a parcel object. 
 * 
 * @author jcollinge
 *
 */
public class ParcelPacker {

	public static Parcel makeParcel(int id, String message, String format, String topic) {
		Message m = new Message(id, message, format);
		Parcel p = new Parcel(m, topic);
		return p;
	}
	public static Parcel makeParcel(Message message, String topic) {
		Parcel p = new Parcel(message, topic);
		return p;
	}
}
