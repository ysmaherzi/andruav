/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE CAN_FILTER_MODIFY PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * Modify the filter of what CAN messages to forward over the mavlink. This can be used to make CAN forwarding work well on low bandwith links. The filtering is applied on bits 8 to 24 of the CAN id (2nd and 3rd bytes) which corresponds to the DroneCAN message ID for DroneCAN. Filters with more than 16 IDs can be constructed by sending multiple CAN_FILTER_MODIFY messages.
 */
public class msg_can_filter_modify extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_CAN_FILTER_MODIFY = 388;
    public static final int MAVLINK_MSG_LENGTH = 37;
    private static final long serialVersionUID = MAVLINK_MSG_ID_CAN_FILTER_MODIFY;

    
    /**
     * filter IDs, length num_ids
     */
    @Description("filter IDs, length num_ids")
    @Units("")
    public int[] ids = new int[16];
    
    /**
     * System ID.
     */
    @Description("System ID.")
    @Units("")
    public short target_system;
    
    /**
     * Component ID.
     */
    @Description("Component ID.")
    @Units("")
    public short target_component;
    
    /**
     * bus number
     */
    @Description("bus number")
    @Units("")
    public short bus;
    
    /**
     * what operation to perform on the filter list. See CAN_FILTER_OP enum.
     */
    @Description("what operation to perform on the filter list. See CAN_FILTER_OP enum.")
    @Units("")
    public short operation;
    
    /**
     * number of IDs in filter list
     */
    @Description("number of IDs in filter list")
    @Units("")
    public short num_ids;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_CAN_FILTER_MODIFY;

        
        for (int i = 0; i < ids.length; i++) {
            packet.payload.putUnsignedShort(ids[i]);
        }
                    
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        packet.payload.putUnsignedByte(bus);
        packet.payload.putUnsignedByte(operation);
        packet.payload.putUnsignedByte(num_ids);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a can_filter_modify message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        
        for (int i = 0; i < this.ids.length; i++) {
            this.ids[i] = payload.getUnsignedShort();
        }
                
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        this.bus = payload.getUnsignedByte();
        this.operation = payload.getUnsignedByte();
        this.num_ids = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_can_filter_modify() {
        this.msgid = MAVLINK_MSG_ID_CAN_FILTER_MODIFY;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_can_filter_modify( int[] ids, short target_system, short target_component, short bus, short operation, short num_ids) {
        this.msgid = MAVLINK_MSG_ID_CAN_FILTER_MODIFY;

        this.ids = ids;
        this.target_system = target_system;
        this.target_component = target_component;
        this.bus = bus;
        this.operation = operation;
        this.num_ids = num_ids;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_can_filter_modify( int[] ids, short target_system, short target_component, short bus, short operation, short num_ids, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_CAN_FILTER_MODIFY;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.ids = ids;
        this.target_system = target_system;
        this.target_component = target_component;
        this.bus = bus;
        this.operation = operation;
        this.num_ids = num_ids;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_can_filter_modify(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_CAN_FILTER_MODIFY;

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
        return "MAVLINK_MSG_ID_CAN_FILTER_MODIFY - sysid:"+sysid+" compid:"+compid+" ids:"+ids+" target_system:"+target_system+" target_component:"+target_component+" bus:"+bus+" operation:"+operation+" num_ids:"+num_ids+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_CAN_FILTER_MODIFY";
    }
}
        