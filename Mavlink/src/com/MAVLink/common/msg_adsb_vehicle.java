/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE ADSB_VEHICLE PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * The location and information of an ADSB vehicle
 */
public class msg_adsb_vehicle extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_ADSB_VEHICLE = 246;
    public static final int MAVLINK_MSG_LENGTH = 38;
    private static final long serialVersionUID = MAVLINK_MSG_ID_ADSB_VEHICLE;

    
    /**
     * ICAO address
     */
    @Description("ICAO address")
    @Units("")
    public long ICAO_address;
    
    /**
     * Latitude
     */
    @Description("Latitude")
    @Units("degE7")
    public int lat;
    
    /**
     * Longitude
     */
    @Description("Longitude")
    @Units("degE7")
    public int lon;
    
    /**
     * Altitude(ASL)
     */
    @Description("Altitude(ASL)")
    @Units("mm")
    public int altitude;
    
    /**
     * Course over ground
     */
    @Description("Course over ground")
    @Units("cdeg")
    public int heading;
    
    /**
     * The horizontal velocity
     */
    @Description("The horizontal velocity")
    @Units("cm/s")
    public int hor_velocity;
    
    /**
     * The vertical velocity. Positive is up
     */
    @Description("The vertical velocity. Positive is up")
    @Units("cm/s")
    public short ver_velocity;
    
    /**
     * Bitmap to indicate various statuses including valid data fields
     */
    @Description("Bitmap to indicate various statuses including valid data fields")
    @Units("")
    public int flags;
    
    /**
     * Squawk code
     */
    @Description("Squawk code")
    @Units("")
    public int squawk;
    
    /**
     * ADSB altitude type.
     */
    @Description("ADSB altitude type.")
    @Units("")
    public short altitude_type;
    
    /**
     * The callsign, 8+null
     */
    @Description("The callsign, 8+null")
    @Units("")
    public byte[] callsign = new byte[9];
    
    /**
     * ADSB emitter type.
     */
    @Description("ADSB emitter type.")
    @Units("")
    public short emitter_type;
    
    /**
     * Time since last communication in seconds
     */
    @Description("Time since last communication in seconds")
    @Units("s")
    public short tslc;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_ADSB_VEHICLE;

        packet.payload.putUnsignedInt(ICAO_address);
        packet.payload.putInt(lat);
        packet.payload.putInt(lon);
        packet.payload.putInt(altitude);
        packet.payload.putUnsignedShort(heading);
        packet.payload.putUnsignedShort(hor_velocity);
        packet.payload.putShort(ver_velocity);
        packet.payload.putUnsignedShort(flags);
        packet.payload.putUnsignedShort(squawk);
        packet.payload.putUnsignedByte(altitude_type);
        
        for (int i = 0; i < callsign.length; i++) {
            packet.payload.putByte(callsign[i]);
        }
                    
        packet.payload.putUnsignedByte(emitter_type);
        packet.payload.putUnsignedByte(tslc);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a adsb_vehicle message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.ICAO_address = payload.getUnsignedInt();
        this.lat = payload.getInt();
        this.lon = payload.getInt();
        this.altitude = payload.getInt();
        this.heading = payload.getUnsignedShort();
        this.hor_velocity = payload.getUnsignedShort();
        this.ver_velocity = payload.getShort();
        this.flags = payload.getUnsignedShort();
        this.squawk = payload.getUnsignedShort();
        this.altitude_type = payload.getUnsignedByte();
        
        for (int i = 0; i < this.callsign.length; i++) {
            this.callsign[i] = payload.getByte();
        }
                
        this.emitter_type = payload.getUnsignedByte();
        this.tslc = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_adsb_vehicle() {
        this.msgid = MAVLINK_MSG_ID_ADSB_VEHICLE;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_adsb_vehicle( long ICAO_address, int lat, int lon, int altitude, int heading, int hor_velocity, short ver_velocity, int flags, int squawk, short altitude_type, byte[] callsign, short emitter_type, short tslc) {
        this.msgid = MAVLINK_MSG_ID_ADSB_VEHICLE;

        this.ICAO_address = ICAO_address;
        this.lat = lat;
        this.lon = lon;
        this.altitude = altitude;
        this.heading = heading;
        this.hor_velocity = hor_velocity;
        this.ver_velocity = ver_velocity;
        this.flags = flags;
        this.squawk = squawk;
        this.altitude_type = altitude_type;
        this.callsign = callsign;
        this.emitter_type = emitter_type;
        this.tslc = tslc;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_adsb_vehicle( long ICAO_address, int lat, int lon, int altitude, int heading, int hor_velocity, short ver_velocity, int flags, int squawk, short altitude_type, byte[] callsign, short emitter_type, short tslc, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_ADSB_VEHICLE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.ICAO_address = ICAO_address;
        this.lat = lat;
        this.lon = lon;
        this.altitude = altitude;
        this.heading = heading;
        this.hor_velocity = hor_velocity;
        this.ver_velocity = ver_velocity;
        this.flags = flags;
        this.squawk = squawk;
        this.altitude_type = altitude_type;
        this.callsign = callsign;
        this.emitter_type = emitter_type;
        this.tslc = tslc;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_adsb_vehicle(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_ADSB_VEHICLE;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

                         
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setCallsign(String str) {
        int len = Math.min(str.length(), 9);
        for (int i=0; i<len; i++) {
            callsign[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<9; i++) {            // padding for the rest of the buffer
            callsign[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getCallsign() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 9; i++) {
            if (callsign[i] != 0)
                buf.append((char) callsign[i]);
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
        return "MAVLINK_MSG_ID_ADSB_VEHICLE - sysid:"+sysid+" compid:"+compid+" ICAO_address:"+ICAO_address+" lat:"+lat+" lon:"+lon+" altitude:"+altitude+" heading:"+heading+" hor_velocity:"+hor_velocity+" ver_velocity:"+ver_velocity+" flags:"+flags+" squawk:"+squawk+" altitude_type:"+altitude_type+" callsign:"+callsign+" emitter_type:"+emitter_type+" tslc:"+tslc+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_ADSB_VEHICLE";
    }
}
        