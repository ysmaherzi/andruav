/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE RELAY_STATUS PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Reports the on/off state of relays, as controlled by MAV_CMD_DO_SET_RELAY.
 */
public class msg_relay_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_RELAY_STATUS = 376;
    public static final int MAVLINK_MSG_LENGTH = 8;
    private static final long serialVersionUID = MAVLINK_MSG_ID_RELAY_STATUS;

    
    /**
     * Timestamp (time since system boot).
     */
    @Description("Timestamp (time since system boot).")
    @Units("ms")
    public long time_boot_ms;
    
    /**
     * Relay states.  Relay instance numbers are represented as individual bits in this mask by offset.
     */
    @Description("Relay states.  Relay instance numbers are represented as individual bits in this mask by offset.")
    @Units("")
    public int on;
    
    /**
     * Relay present.  Relay instance numbers are represented as individual bits in this mask by offset.  Bits will be true if a relay instance is configured.
     */
    @Description("Relay present.  Relay instance numbers are represented as individual bits in this mask by offset.  Bits will be true if a relay instance is configured.")
    @Units("")
    public int present;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_RELAY_STATUS;

        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putUnsignedShort(on);
        packet.payload.putUnsignedShort(present);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a relay_status message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_boot_ms = payload.getUnsignedInt();
        this.on = payload.getUnsignedShort();
        this.present = payload.getUnsignedShort();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_relay_status() {
        this.msgid = MAVLINK_MSG_ID_RELAY_STATUS;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_relay_status( long time_boot_ms, int on, int present) {
        this.msgid = MAVLINK_MSG_ID_RELAY_STATUS;

        this.time_boot_ms = time_boot_ms;
        this.on = on;
        this.present = present;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_relay_status( long time_boot_ms, int on, int present, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_RELAY_STATUS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.on = on;
        this.present = present;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_relay_status(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_RELAY_STATUS;

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
        return "MAVLINK_MSG_ID_RELAY_STATUS - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" on:"+on+" present:"+present+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_RELAY_STATUS";
    }
}
        