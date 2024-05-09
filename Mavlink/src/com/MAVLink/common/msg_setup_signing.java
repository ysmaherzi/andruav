/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SETUP_SIGNING PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * Setup a MAVLink2 signing key. If called with secret_key of all zero and zero initial_timestamp will disable signing
 */
public class msg_setup_signing extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SETUP_SIGNING = 256;
    public static final int MAVLINK_MSG_LENGTH = 42;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SETUP_SIGNING;

    
    /**
     * initial timestamp
     */
    @Description("initial timestamp")
    @Units("")
    public long initial_timestamp;
    
    /**
     * system id of the target
     */
    @Description("system id of the target")
    @Units("")
    public short target_system;
    
    /**
     * component ID of the target
     */
    @Description("component ID of the target")
    @Units("")
    public short target_component;
    
    /**
     * signing key
     */
    @Description("signing key")
    @Units("")
    public short[] secret_key = new short[32];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_SETUP_SIGNING;

        packet.payload.putUnsignedLong(initial_timestamp);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        for (int i = 0; i < secret_key.length; i++) {
            packet.payload.putUnsignedByte(secret_key[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a setup_signing message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.initial_timestamp = payload.getUnsignedLong();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        
        for (int i = 0; i < this.secret_key.length; i++) {
            this.secret_key[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_setup_signing() {
        this.msgid = MAVLINK_MSG_ID_SETUP_SIGNING;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_setup_signing( long initial_timestamp, short target_system, short target_component, short[] secret_key) {
        this.msgid = MAVLINK_MSG_ID_SETUP_SIGNING;

        this.initial_timestamp = initial_timestamp;
        this.target_system = target_system;
        this.target_component = target_component;
        this.secret_key = secret_key;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_setup_signing( long initial_timestamp, short target_system, short target_component, short[] secret_key, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_SETUP_SIGNING;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.initial_timestamp = initial_timestamp;
        this.target_system = target_system;
        this.target_component = target_component;
        this.secret_key = secret_key;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_setup_signing(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_SETUP_SIGNING;

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
        return "MAVLINK_MSG_ID_SETUP_SIGNING - sysid:"+sysid+" compid:"+compid+" initial_timestamp:"+initial_timestamp+" target_system:"+target_system+" target_component:"+target_component+" secret_key:"+secret_key+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_SETUP_SIGNING";
    }
}
        