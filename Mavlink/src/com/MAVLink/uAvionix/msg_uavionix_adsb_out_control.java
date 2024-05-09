/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE UAVIONIX_ADSB_OUT_CONTROL PACKING
package com.MAVLink.uAvionix;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * Control message with all data sent in UCP control message.
 */
public class msg_uavionix_adsb_out_control extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CONTROL = 10007;
    public static final int MAVLINK_MSG_LENGTH = 17;
    private static final long serialVersionUID = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CONTROL;

    
    /**
     * Barometric pressure altitude (MSL) relative to a standard atmosphere of 1013.2 mBar and NOT bar corrected altitude (m * 1E-3). (up +ve). If unknown set to INT32_MAX
     */
    @Description("Barometric pressure altitude (MSL) relative to a standard atmosphere of 1013.2 mBar and NOT bar corrected altitude (m * 1E-3). (up +ve). If unknown set to INT32_MAX")
    @Units("mbar")
    public int baroAltMSL;
    
    /**
     * Mode A code (typically 1200 [0x04B0] for VFR)
     */
    @Description("Mode A code (typically 1200 [0x04B0] for VFR)")
    @Units("")
    public int squawk;
    
    /**
     * ADS-B transponder control state flags
     */
    @Description("ADS-B transponder control state flags")
    @Units("")
    public short state;
    
    /**
     * Emergency status
     */
    @Description("Emergency status")
    @Units("")
    public short emergencyStatus;
    
    /**
     * Flight Identification: 8 ASCII characters, '0' through '9', 'A' through 'Z' or space. Spaces (0x20) used as a trailing pad character, or when call sign is unavailable.
     */
    @Description("Flight Identification: 8 ASCII characters, '0' through '9', 'A' through 'Z' or space. Spaces (0x20) used as a trailing pad character, or when call sign is unavailable.")
    @Units("")
    public byte[] flight_id = new byte[8];
    
    /**
     * X-Bit enable (military transponders only)
     */
    @Description("X-Bit enable (military transponders only)")
    @Units("")
    public short x_bit;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CONTROL;

        packet.payload.putInt(baroAltMSL);
        packet.payload.putUnsignedShort(squawk);
        packet.payload.putUnsignedByte(state);
        packet.payload.putUnsignedByte(emergencyStatus);
        
        for (int i = 0; i < flight_id.length; i++) {
            packet.payload.putByte(flight_id[i]);
        }
                    
        packet.payload.putUnsignedByte(x_bit);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a uavionix_adsb_out_control message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.baroAltMSL = payload.getInt();
        this.squawk = payload.getUnsignedShort();
        this.state = payload.getUnsignedByte();
        this.emergencyStatus = payload.getUnsignedByte();
        
        for (int i = 0; i < this.flight_id.length; i++) {
            this.flight_id[i] = payload.getByte();
        }
                
        this.x_bit = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_uavionix_adsb_out_control() {
        this.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CONTROL;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_uavionix_adsb_out_control( int baroAltMSL, int squawk, short state, short emergencyStatus, byte[] flight_id, short x_bit) {
        this.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CONTROL;

        this.baroAltMSL = baroAltMSL;
        this.squawk = squawk;
        this.state = state;
        this.emergencyStatus = emergencyStatus;
        this.flight_id = flight_id;
        this.x_bit = x_bit;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_uavionix_adsb_out_control( int baroAltMSL, int squawk, short state, short emergencyStatus, byte[] flight_id, short x_bit, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CONTROL;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.baroAltMSL = baroAltMSL;
        this.squawk = squawk;
        this.state = state;
        this.emergencyStatus = emergencyStatus;
        this.flight_id = flight_id;
        this.x_bit = x_bit;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_uavionix_adsb_out_control(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CONTROL;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

             
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setFlight_Id(String str) {
        int len = Math.min(str.length(), 8);
        for (int i=0; i<len; i++) {
            flight_id[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<8; i++) {            // padding for the rest of the buffer
            flight_id[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getFlight_Id() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 8; i++) {
            if (flight_id[i] != 0)
                buf.append((char) flight_id[i]);
            else
                break;
        }
        return buf.toString();

    }
                           
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CONTROL - sysid:"+sysid+" compid:"+compid+" baroAltMSL:"+baroAltMSL+" squawk:"+squawk+" state:"+state+" emergencyStatus:"+emergencyStatus+" flight_id:"+flight_id+" x_bit:"+x_bit+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CONTROL";
    }
}
        