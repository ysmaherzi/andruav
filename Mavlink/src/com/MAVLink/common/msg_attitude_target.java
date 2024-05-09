/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE ATTITUDE_TARGET PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * Reports the current commanded attitude of the vehicle as specified by the autopilot. This should match the commands sent in a SET_ATTITUDE_TARGET message if the vehicle is being controlled this way.
 */
public class msg_attitude_target extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_ATTITUDE_TARGET = 83;
    public static final int MAVLINK_MSG_LENGTH = 37;
    private static final long serialVersionUID = MAVLINK_MSG_ID_ATTITUDE_TARGET;

    
    /**
     * Timestamp (time since system boot).
     */
    @Description("Timestamp (time since system boot).")
    @Units("ms")
    public long time_boot_ms;
    
    /**
     * Attitude quaternion (w, x, y, z order, zero-rotation is 1, 0, 0, 0)
     */
    @Description("Attitude quaternion (w, x, y, z order, zero-rotation is 1, 0, 0, 0)")
    @Units("")
    public float[] q = new float[4];
    
    /**
     * Body roll rate
     */
    @Description("Body roll rate")
    @Units("rad/s")
    public float body_roll_rate;
    
    /**
     * Body pitch rate
     */
    @Description("Body pitch rate")
    @Units("rad/s")
    public float body_pitch_rate;
    
    /**
     * Body yaw rate
     */
    @Description("Body yaw rate")
    @Units("rad/s")
    public float body_yaw_rate;
    
    /**
     * Collective thrust, normalized to 0 .. 1 (-1 .. 1 for vehicles capable of reverse trust)
     */
    @Description("Collective thrust, normalized to 0 .. 1 (-1 .. 1 for vehicles capable of reverse trust)")
    @Units("")
    public float thrust;
    
    /**
     * Bitmap to indicate which dimensions should be ignored by the vehicle.
     */
    @Description("Bitmap to indicate which dimensions should be ignored by the vehicle.")
    @Units("")
    public short type_mask;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_ATTITUDE_TARGET;

        packet.payload.putUnsignedInt(time_boot_ms);
        
        for (int i = 0; i < q.length; i++) {
            packet.payload.putFloat(q[i]);
        }
                    
        packet.payload.putFloat(body_roll_rate);
        packet.payload.putFloat(body_pitch_rate);
        packet.payload.putFloat(body_yaw_rate);
        packet.payload.putFloat(thrust);
        packet.payload.putUnsignedByte(type_mask);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a attitude_target message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_boot_ms = payload.getUnsignedInt();
        
        for (int i = 0; i < this.q.length; i++) {
            this.q[i] = payload.getFloat();
        }
                
        this.body_roll_rate = payload.getFloat();
        this.body_pitch_rate = payload.getFloat();
        this.body_yaw_rate = payload.getFloat();
        this.thrust = payload.getFloat();
        this.type_mask = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_attitude_target() {
        this.msgid = MAVLINK_MSG_ID_ATTITUDE_TARGET;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_attitude_target( long time_boot_ms, float[] q, float body_roll_rate, float body_pitch_rate, float body_yaw_rate, float thrust, short type_mask) {
        this.msgid = MAVLINK_MSG_ID_ATTITUDE_TARGET;

        this.time_boot_ms = time_boot_ms;
        this.q = q;
        this.body_roll_rate = body_roll_rate;
        this.body_pitch_rate = body_pitch_rate;
        this.body_yaw_rate = body_yaw_rate;
        this.thrust = thrust;
        this.type_mask = type_mask;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_attitude_target( long time_boot_ms, float[] q, float body_roll_rate, float body_pitch_rate, float body_yaw_rate, float thrust, short type_mask, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_ATTITUDE_TARGET;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.q = q;
        this.body_roll_rate = body_roll_rate;
        this.body_pitch_rate = body_pitch_rate;
        this.body_yaw_rate = body_yaw_rate;
        this.thrust = thrust;
        this.type_mask = type_mask;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_attitude_target(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_ATTITUDE_TARGET;

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
        return "MAVLINK_MSG_ID_ATTITUDE_TARGET - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" q:"+q+" body_roll_rate:"+body_roll_rate+" body_pitch_rate:"+body_pitch_rate+" body_yaw_rate:"+body_yaw_rate+" thrust:"+thrust+" type_mask:"+type_mask+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_ATTITUDE_TARGET";
    }
}
        