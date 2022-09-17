/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE OPEN_DRONE_ID_MESSAGE_PACK PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * An OpenDroneID message pack is a container for multiple encoded OpenDroneID messages (i.e. not in the format given for the above message descriptions but after encoding into the compressed OpenDroneID byte format). Used e.g. when transmitting on Bluetooth 5.0 Long Range/Extended Advertising or on WiFi Neighbor Aware Networking or on WiFi Beacon.
 */
public class msg_open_drone_id_message_pack extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_OPEN_DRONE_ID_MESSAGE_PACK = 12915;
    public static final int MAVLINK_MSG_LENGTH = 249;
    private static final long serialVersionUID = MAVLINK_MSG_ID_OPEN_DRONE_ID_MESSAGE_PACK;

    
    /**
     * System ID (0 for broadcast).
     */
    @Description("System ID (0 for broadcast).")
    @Units("")
    public short target_system;
    
    /**
     * Component ID (0 for broadcast).
     */
    @Description("Component ID (0 for broadcast).")
    @Units("")
    public short target_component;
    
    /**
     * Only used for drone ID data received from other UAs. See detailed description at https://mavlink.io/en/services/opendroneid.html. 
     */
    @Description("Only used for drone ID data received from other UAs. See detailed description at https://mavlink.io/en/services/opendroneid.html. ")
    @Units("")
    public short id_or_mac[] = new short[20];
    
    /**
     * This field must currently always be equal to 25 (bytes), since all encoded OpenDroneID messages are specificed to have this length.
     */
    @Description("This field must currently always be equal to 25 (bytes), since all encoded OpenDroneID messages are specificed to have this length.")
    @Units("bytes")
    public short single_message_size;
    
    /**
     * Number of encoded messages in the pack (not the number of bytes). Allowed range is 1 - 9.
     */
    @Description("Number of encoded messages in the pack (not the number of bytes). Allowed range is 1 - 9.")
    @Units("")
    public short msg_pack_size;
    
    /**
     * Concatenation of encoded OpenDroneID messages. Shall be filled with nulls in the unused portion of the field.
     */
    @Description("Concatenation of encoded OpenDroneID messages. Shall be filled with nulls in the unused portion of the field.")
    @Units("")
    public short messages[] = new short[225];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_OPEN_DRONE_ID_MESSAGE_PACK;

        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        for (int i = 0; i < id_or_mac.length; i++) {
            packet.payload.putUnsignedByte(id_or_mac[i]);
        }
                    
        packet.payload.putUnsignedByte(single_message_size);
        packet.payload.putUnsignedByte(msg_pack_size);
        
        for (int i = 0; i < messages.length; i++) {
            packet.payload.putUnsignedByte(messages[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a open_drone_id_message_pack message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        
        for (int i = 0; i < this.id_or_mac.length; i++) {
            this.id_or_mac[i] = payload.getUnsignedByte();
        }
                
        this.single_message_size = payload.getUnsignedByte();
        this.msg_pack_size = payload.getUnsignedByte();
        
        for (int i = 0; i < this.messages.length; i++) {
            this.messages[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_open_drone_id_message_pack() {
        this.msgid = MAVLINK_MSG_ID_OPEN_DRONE_ID_MESSAGE_PACK;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_open_drone_id_message_pack( short target_system, short target_component, short[] id_or_mac, short single_message_size, short msg_pack_size, short[] messages) {
        this.msgid = MAVLINK_MSG_ID_OPEN_DRONE_ID_MESSAGE_PACK;

        this.target_system = target_system;
        this.target_component = target_component;
        this.id_or_mac = id_or_mac;
        this.single_message_size = single_message_size;
        this.msg_pack_size = msg_pack_size;
        this.messages = messages;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_open_drone_id_message_pack( short target_system, short target_component, short[] id_or_mac, short single_message_size, short msg_pack_size, short[] messages, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_OPEN_DRONE_ID_MESSAGE_PACK;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.target_system = target_system;
        this.target_component = target_component;
        this.id_or_mac = id_or_mac;
        this.single_message_size = single_message_size;
        this.msg_pack_size = msg_pack_size;
        this.messages = messages;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_open_drone_id_message_pack(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_OPEN_DRONE_ID_MESSAGE_PACK;

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
        return "MAVLINK_MSG_ID_OPEN_DRONE_ID_MESSAGE_PACK - sysid:"+sysid+" compid:"+compid+" target_system:"+target_system+" target_component:"+target_component+" id_or_mac:"+id_or_mac+" single_message_size:"+single_message_size+" msg_pack_size:"+msg_pack_size+" messages:"+messages+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_OPEN_DRONE_ID_MESSAGE_PACK";
    }
}
        