/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE VICON_POSITION_ESTIMATE PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * Global position estimate from a Vicon motion system source.
 */
public class msg_vicon_position_estimate extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE = 104;
    public static final int MAVLINK_MSG_LENGTH = 116;
    private static final long serialVersionUID = MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE;

    
    /**
     * Timestamp (UNIX time or time since system boot)
     */
    @Description("Timestamp (UNIX time or time since system boot)")
    @Units("us")
    public long usec;
    
    /**
     * Global X position
     */
    @Description("Global X position")
    @Units("m")
    public float x;
    
    /**
     * Global Y position
     */
    @Description("Global Y position")
    @Units("m")
    public float y;
    
    /**
     * Global Z position
     */
    @Description("Global Z position")
    @Units("m")
    public float z;
    
    /**
     * Roll angle
     */
    @Description("Roll angle")
    @Units("rad")
    public float roll;
    
    /**
     * Pitch angle
     */
    @Description("Pitch angle")
    @Units("rad")
    public float pitch;
    
    /**
     * Yaw angle
     */
    @Description("Yaw angle")
    @Units("rad")
    public float yaw;
    
    /**
     * Row-major representation of 6x6 pose cross-covariance matrix upper right triangle (states: x, y, z, roll, pitch, yaw; first six entries are the first ROW, next five entries are the second ROW, etc.). If unknown, assign NaN value to first element in the array.
     */
    @Description("Row-major representation of 6x6 pose cross-covariance matrix upper right triangle (states: x, y, z, roll, pitch, yaw; first six entries are the first ROW, next five entries are the second ROW, etc.). If unknown, assign NaN value to first element in the array.")
    @Units("")
    public float[] covariance = new float[21];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE;

        packet.payload.putUnsignedLong(usec);
        packet.payload.putFloat(x);
        packet.payload.putFloat(y);
        packet.payload.putFloat(z);
        packet.payload.putFloat(roll);
        packet.payload.putFloat(pitch);
        packet.payload.putFloat(yaw);
        
        if (isMavlink2) {
             
        for (int i = 0; i < covariance.length; i++) {
            packet.payload.putFloat(covariance[i]);
        }
                    
            
        }
        return packet;
    }

    /**
     * Decode a vicon_position_estimate message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.usec = payload.getUnsignedLong();
        this.x = payload.getFloat();
        this.y = payload.getFloat();
        this.z = payload.getFloat();
        this.roll = payload.getFloat();
        this.pitch = payload.getFloat();
        this.yaw = payload.getFloat();
        
        if (isMavlink2) {
             
        for (int i = 0; i < this.covariance.length; i++) {
            this.covariance[i] = payload.getFloat();
        }
                
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_vicon_position_estimate() {
        this.msgid = MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_vicon_position_estimate( long usec, float x, float y, float z, float roll, float pitch, float yaw, float[] covariance) {
        this.msgid = MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE;

        this.usec = usec;
        this.x = x;
        this.y = y;
        this.z = z;
        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.covariance = covariance;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_vicon_position_estimate( long usec, float x, float y, float z, float roll, float pitch, float yaw, float[] covariance, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.usec = usec;
        this.x = x;
        this.y = y;
        this.z = z;
        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.covariance = covariance;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_vicon_position_estimate(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE;

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
        return "MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE - sysid:"+sysid+" compid:"+compid+" usec:"+usec+" x:"+x+" y:"+y+" z:"+z+" roll:"+roll+" pitch:"+pitch+" yaw:"+yaw+" covariance:"+covariance+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE";
    }
}
        