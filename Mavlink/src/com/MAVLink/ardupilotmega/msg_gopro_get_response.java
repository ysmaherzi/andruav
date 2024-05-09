/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GOPRO_GET_RESPONSE PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * Response from a GOPRO_COMMAND get request.
 */
public class msg_gopro_get_response extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GOPRO_GET_RESPONSE = 217;
    public static final int MAVLINK_MSG_LENGTH = 6;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GOPRO_GET_RESPONSE;

    
    /**
     * Command ID.
     */
    @Description("Command ID.")
    @Units("")
    public short cmd_id;
    
    /**
     * Status.
     */
    @Description("Status.")
    @Units("")
    public short status;
    
    /**
     * Value.
     */
    @Description("Value.")
    @Units("")
    public short[] value = new short[4];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_GOPRO_GET_RESPONSE;

        packet.payload.putUnsignedByte(cmd_id);
        packet.payload.putUnsignedByte(status);
        
        for (int i = 0; i < value.length; i++) {
            packet.payload.putUnsignedByte(value[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a gopro_get_response message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.cmd_id = payload.getUnsignedByte();
        this.status = payload.getUnsignedByte();
        
        for (int i = 0; i < this.value.length; i++) {
            this.value[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gopro_get_response() {
        this.msgid = MAVLINK_MSG_ID_GOPRO_GET_RESPONSE;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_gopro_get_response( short cmd_id, short status, short[] value) {
        this.msgid = MAVLINK_MSG_ID_GOPRO_GET_RESPONSE;

        this.cmd_id = cmd_id;
        this.status = status;
        this.value = value;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_gopro_get_response( short cmd_id, short status, short[] value, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GOPRO_GET_RESPONSE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.cmd_id = cmd_id;
        this.status = status;
        this.value = value;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gopro_get_response(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GOPRO_GET_RESPONSE;

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
        return "MAVLINK_MSG_ID_GOPRO_GET_RESPONSE - sysid:"+sysid+" compid:"+compid+" cmd_id:"+cmd_id+" status:"+status+" value:"+value+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_GOPRO_GET_RESPONSE";
    }
}
        