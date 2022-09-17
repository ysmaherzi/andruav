/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MISSION_CHECKSUM PACKING
package com.MAVLink.development;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * Checksum for the current mission, rally point or geofence plan, or for the "combined" plan (a GCS can use these checksums to determine if it has matching plans).
        This message must be broadcast with the appropriate checksum following any change to a mission, geofence or rally point definition
        (immediately after the MISSION_ACK that completes the upload sequence).
        It may also be requested using MAV_CMD_REQUEST_MESSAGE, where param 2 indicates the plan type for which the checksum is required.
        The checksum must be calculated on the autopilot, but may also be calculated by the GCS.
        The checksum uses the same CRC32 algorithm as MAVLink FTP (https://mavlink.io/en/services/ftp.html#crc32-implementation).
        The checksum for a mission, geofence or rally point definition is run over each item in the plan in seq order (excluding the home location if present in the plan), and covers the following fields (in order):
        frame, command, autocontinue, param1, param2, param3, param4, param5, param6, param7.
        The checksum for the whole plan (MAV_MISSION_TYPE_ALL) is calculated using the same approach, running over each sub-plan in the following order: mission, geofence then rally point.
      
 */
public class msg_mission_checksum extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_MISSION_CHECKSUM = 53;
    public static final int MAVLINK_MSG_LENGTH = 5;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MISSION_CHECKSUM;

    
    /**
     * CRC32 checksum of current plan for specified type.
     */
    @Description("CRC32 checksum of current plan for specified type.")
    @Units("")
    public long checksum;
    
    /**
     * Mission type.
     */
    @Description("Mission type.")
    @Units("")
    public short mission_type;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_MISSION_CHECKSUM;

        packet.payload.putUnsignedInt(checksum);
        packet.payload.putUnsignedByte(mission_type);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a mission_checksum message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.checksum = payload.getUnsignedInt();
        this.mission_type = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_mission_checksum() {
        this.msgid = MAVLINK_MSG_ID_MISSION_CHECKSUM;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_mission_checksum( long checksum, short mission_type) {
        this.msgid = MAVLINK_MSG_ID_MISSION_CHECKSUM;

        this.checksum = checksum;
        this.mission_type = mission_type;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_mission_checksum( long checksum, short mission_type, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_MISSION_CHECKSUM;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.checksum = checksum;
        this.mission_type = mission_type;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_mission_checksum(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_MISSION_CHECKSUM;

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
        return "MAVLINK_MSG_ID_MISSION_CHECKSUM - sysid:"+sysid+" compid:"+compid+" checksum:"+checksum+" mission_type:"+mission_type+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_MISSION_CHECKSUM";
    }
}
        