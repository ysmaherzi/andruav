/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE WHEEL_DISTANCE PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * Cumulative distance traveled for each reported wheel.
 */
public class msg_wheel_distance extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_WHEEL_DISTANCE = 9000;
    public static final int MAVLINK_MSG_LENGTH = 137;
    private static final long serialVersionUID = MAVLINK_MSG_ID_WHEEL_DISTANCE;

    
    /**
     * Timestamp (synced to UNIX time or since system boot).
     */
    @Description("Timestamp (synced to UNIX time or since system boot).")
    @Units("us")
    public long time_usec;
    
    /**
     * Distance reported by individual wheel encoders. Forward rotations increase values, reverse rotations decrease them. Not all wheels will necessarily have wheel encoders; the mapping of encoders to wheel positions must be agreed/understood by the endpoints.
     */
    @Description("Distance reported by individual wheel encoders. Forward rotations increase values, reverse rotations decrease them. Not all wheels will necessarily have wheel encoders; the mapping of encoders to wheel positions must be agreed/understood by the endpoints.")
    @Units("m")
    public double[] distance = new double[16];
    
    /**
     * Number of wheels reported.
     */
    @Description("Number of wheels reported.")
    @Units("")
    public short count;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_WHEEL_DISTANCE;

        packet.payload.putUnsignedLong(time_usec);
        
        for (int i = 0; i < distance.length; i++) {
            packet.payload.putDouble(distance[i]);
        }
                    
        packet.payload.putUnsignedByte(count);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a wheel_distance message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_usec = payload.getUnsignedLong();
        
        for (int i = 0; i < this.distance.length; i++) {
            this.distance[i] = payload.getDouble();
        }
                
        this.count = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_wheel_distance() {
        this.msgid = MAVLINK_MSG_ID_WHEEL_DISTANCE;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_wheel_distance( long time_usec, double[] distance, short count) {
        this.msgid = MAVLINK_MSG_ID_WHEEL_DISTANCE;

        this.time_usec = time_usec;
        this.distance = distance;
        this.count = count;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_wheel_distance( long time_usec, double[] distance, short count, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_WHEEL_DISTANCE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.distance = distance;
        this.count = count;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_wheel_distance(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_WHEEL_DISTANCE;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

          
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_WHEEL_DISTANCE - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" distance:"+distance+" count:"+count+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_WHEEL_DISTANCE";
    }
}
        