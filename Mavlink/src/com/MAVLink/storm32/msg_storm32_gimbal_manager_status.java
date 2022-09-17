/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE STORM32_GIMBAL_MANAGER_STATUS PACKING
package com.MAVLink.storm32;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * Message reporting the current status of a gimbal manager. This message should be broadcast at a low regular rate (e.g. 1 Hz, may be increase momentarily to e.g. 5 Hz for a period of 1 sec after a change).
 */
public class msg_storm32_gimbal_manager_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_STATUS = 60011;
    public static final int MAVLINK_MSG_LENGTH = 7;
    private static final long serialVersionUID = MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_STATUS;

    
    /**
     * Gimbal device flags currently applied.
     */
    @Description("Gimbal device flags currently applied.")
    @Units("")
    public int device_flags;
    
    /**
     * Gimbal manager flags currently applied.
     */
    @Description("Gimbal manager flags currently applied.")
    @Units("")
    public int manager_flags;
    
    /**
     * Gimbal ID (component ID or 1-6 for non-MAVLink gimbal) that this gimbal manager is responsible for.
     */
    @Description("Gimbal ID (component ID or 1-6 for non-MAVLink gimbal) that this gimbal manager is responsible for.")
    @Units("")
    public short gimbal_id;
    
    /**
     * Client who is currently supervisor (0 = none).
     */
    @Description("Client who is currently supervisor (0 = none).")
    @Units("")
    public short supervisor;
    
    /**
     * Profile currently applied (0 = default).
     */
    @Description("Profile currently applied (0 = default).")
    @Units("")
    public short profile;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_STATUS;

        packet.payload.putUnsignedShort(device_flags);
        packet.payload.putUnsignedShort(manager_flags);
        packet.payload.putUnsignedByte(gimbal_id);
        packet.payload.putUnsignedByte(supervisor);
        packet.payload.putUnsignedByte(profile);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a storm32_gimbal_manager_status message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.device_flags = payload.getUnsignedShort();
        this.manager_flags = payload.getUnsignedShort();
        this.gimbal_id = payload.getUnsignedByte();
        this.supervisor = payload.getUnsignedByte();
        this.profile = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_storm32_gimbal_manager_status() {
        this.msgid = MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_STATUS;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_storm32_gimbal_manager_status( int device_flags, int manager_flags, short gimbal_id, short supervisor, short profile) {
        this.msgid = MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_STATUS;

        this.device_flags = device_flags;
        this.manager_flags = manager_flags;
        this.gimbal_id = gimbal_id;
        this.supervisor = supervisor;
        this.profile = profile;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_storm32_gimbal_manager_status( int device_flags, int manager_flags, short gimbal_id, short supervisor, short profile, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_STATUS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.device_flags = device_flags;
        this.manager_flags = manager_flags;
        this.gimbal_id = gimbal_id;
        this.supervisor = supervisor;
        this.profile = profile;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_storm32_gimbal_manager_status(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_STATUS;

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
        return "MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_STATUS - sysid:"+sysid+" compid:"+compid+" device_flags:"+device_flags+" manager_flags:"+manager_flags+" gimbal_id:"+gimbal_id+" supervisor:"+supervisor+" profile:"+profile+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_STATUS";
    }
}
        