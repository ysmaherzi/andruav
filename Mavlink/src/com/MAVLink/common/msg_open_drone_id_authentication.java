/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE OPEN_DRONE_ID_AUTHENTICATION PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * Data for filling the OpenDroneID Authentication message. The Authentication Message defines a field that can provide a means of authenticity for the identity of the UAS (Unmanned Aircraft System). The Authentication message can have two different formats. For data page 0, the fields PageCount, Length and TimeStamp are present and AuthData is only 17 bytes. For data page 1 through 15, PageCount, Length and TimeStamp are not present and the size of AuthData is 23 bytes.
 */
public class msg_open_drone_id_authentication extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_OPEN_DRONE_ID_AUTHENTICATION = 12902;
    public static final int MAVLINK_MSG_LENGTH = 53;
    private static final long serialVersionUID = MAVLINK_MSG_ID_OPEN_DRONE_ID_AUTHENTICATION;

    
    /**
     * This field is only present for page 0. 32 bit Unix Timestamp in seconds since 00:00:00 01/01/2019.
     */
    @Description("This field is only present for page 0. 32 bit Unix Timestamp in seconds since 00:00:00 01/01/2019.")
    @Units("s")
    public long timestamp;
    
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
     * Indicates the type of authentication.
     */
    @Description("Indicates the type of authentication.")
    @Units("")
    public short authentication_type;
    
    /**
     * Allowed range is 0 - 15.
     */
    @Description("Allowed range is 0 - 15.")
    @Units("")
    public short data_page;
    
    /**
     * This field is only present for page 0. Allowed range is 0 - 15. See the description of struct ODID_Auth_data at https://github.com/opendroneid/opendroneid-core-c/blob/master/libopendroneid/opendroneid.h.
     */
    @Description("This field is only present for page 0. Allowed range is 0 - 15. See the description of struct ODID_Auth_data at https://github.com/opendroneid/opendroneid-core-c/blob/master/libopendroneid/opendroneid.h.")
    @Units("")
    public short last_page_index;
    
    /**
     * This field is only present for page 0. Total bytes of authentication_data from all data pages. See the description of struct ODID_Auth_data at https://github.com/opendroneid/opendroneid-core-c/blob/master/libopendroneid/opendroneid.h.
     */
    @Description("This field is only present for page 0. Total bytes of authentication_data from all data pages. See the description of struct ODID_Auth_data at https://github.com/opendroneid/opendroneid-core-c/blob/master/libopendroneid/opendroneid.h.")
    @Units("bytes")
    public short length;
    
    /**
     * Opaque authentication data. For page 0, the size is only 17 bytes. For other pages, the size is 23 bytes. Shall be filled with nulls in the unused portion of the field.
     */
    @Description("Opaque authentication data. For page 0, the size is only 17 bytes. For other pages, the size is 23 bytes. Shall be filled with nulls in the unused portion of the field.")
    @Units("")
    public short authentication_data[] = new short[23];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_OPEN_DRONE_ID_AUTHENTICATION;

        packet.payload.putUnsignedInt(timestamp);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        for (int i = 0; i < id_or_mac.length; i++) {
            packet.payload.putUnsignedByte(id_or_mac[i]);
        }
                    
        packet.payload.putUnsignedByte(authentication_type);
        packet.payload.putUnsignedByte(data_page);
        packet.payload.putUnsignedByte(last_page_index);
        packet.payload.putUnsignedByte(length);
        
        for (int i = 0; i < authentication_data.length; i++) {
            packet.payload.putUnsignedByte(authentication_data[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a open_drone_id_authentication message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.timestamp = payload.getUnsignedInt();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        
        for (int i = 0; i < this.id_or_mac.length; i++) {
            this.id_or_mac[i] = payload.getUnsignedByte();
        }
                
        this.authentication_type = payload.getUnsignedByte();
        this.data_page = payload.getUnsignedByte();
        this.last_page_index = payload.getUnsignedByte();
        this.length = payload.getUnsignedByte();
        
        for (int i = 0; i < this.authentication_data.length; i++) {
            this.authentication_data[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_open_drone_id_authentication() {
        this.msgid = MAVLINK_MSG_ID_OPEN_DRONE_ID_AUTHENTICATION;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_open_drone_id_authentication( long timestamp, short target_system, short target_component, short[] id_or_mac, short authentication_type, short data_page, short last_page_index, short length, short[] authentication_data) {
        this.msgid = MAVLINK_MSG_ID_OPEN_DRONE_ID_AUTHENTICATION;

        this.timestamp = timestamp;
        this.target_system = target_system;
        this.target_component = target_component;
        this.id_or_mac = id_or_mac;
        this.authentication_type = authentication_type;
        this.data_page = data_page;
        this.last_page_index = last_page_index;
        this.length = length;
        this.authentication_data = authentication_data;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_open_drone_id_authentication( long timestamp, short target_system, short target_component, short[] id_or_mac, short authentication_type, short data_page, short last_page_index, short length, short[] authentication_data, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_OPEN_DRONE_ID_AUTHENTICATION;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.timestamp = timestamp;
        this.target_system = target_system;
        this.target_component = target_component;
        this.id_or_mac = id_or_mac;
        this.authentication_type = authentication_type;
        this.data_page = data_page;
        this.last_page_index = last_page_index;
        this.length = length;
        this.authentication_data = authentication_data;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_open_drone_id_authentication(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_OPEN_DRONE_ID_AUTHENTICATION;

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
        return "MAVLINK_MSG_ID_OPEN_DRONE_ID_AUTHENTICATION - sysid:"+sysid+" compid:"+compid+" timestamp:"+timestamp+" target_system:"+target_system+" target_component:"+target_component+" id_or_mac:"+id_or_mac+" authentication_type:"+authentication_type+" data_page:"+data_page+" last_page_index:"+last_page_index+" length:"+length+" authentication_data:"+authentication_data+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_OPEN_DRONE_ID_AUTHENTICATION";
    }
}
        