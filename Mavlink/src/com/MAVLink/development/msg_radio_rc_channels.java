/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE RADIO_RC_CHANNELS PACKING
package com.MAVLink.development;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * RC channel outputs from a MAVLink RC receiver for input to a flight controller or other components (allows an RC receiver to connect via MAVLink instead of some other protocol such as PPM-Sum or S.BUS).
        Note that this is not intended to be an over-the-air format, and does not replace RC_CHANNELS and similar messages reported by the flight controller.
        The target_system field should normally be set to the system id of the system to control, typically the flight controller.
        The target_component field can normally be set to 0, so that all components of the system can receive the message.
        The channels array field can publish up to 32 channels; the number of channel items used in the array is specified in the count field.
        The time_last_update_ms field contains the timestamp of the last received valid channels data in the receiver's time domain.
        The count field indicates the first index of the channel array that is not used for channel data (this and later indexes are zero-filled).
        The RADIO_RC_CHANNELS_FLAGS_OUTDATED flag is set by the receiver if the channels data is not up-to-date (for example, if new data from the transmitter could not be validated so the last valid data is resent).
        The RADIO_RC_CHANNELS_FLAGS_FAILSAFE failsafe flag is set by the receiver if the receiver's failsafe condition is met (implementation dependent, e.g., connection to the RC radio is lost).
        In this case time_last_update_ms still contains the timestamp of the last valid channels data, but the content of the channels data is not defined by the protocol (it is up to the implementation of the receiver).
        For instance, the channels data could contain failsafe values configured in the receiver; the default is to carry the last valid data.
        Note: The RC channels fields are extensions to ensure that they are located at the end of the serialized payload and subject to MAVLink's trailing-zero trimming.
      
 */
public class msg_radio_rc_channels extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_RADIO_RC_CHANNELS = 420;
    public static final int MAVLINK_MSG_LENGTH = 73;
    private static final long serialVersionUID = MAVLINK_MSG_ID_RADIO_RC_CHANNELS;

    
    /**
     * Time when the data in the channels field were last updated (time since boot in the receiver's time domain).
     */
    @Description("Time when the data in the channels field were last updated (time since boot in the receiver's time domain).")
    @Units("ms")
    public long time_last_update_ms;
    
    /**
     * Radio RC channels status flags.
     */
    @Description("Radio RC channels status flags.")
    @Units("")
    public int flags;
    
    /**
     * System ID (ID of target system, normally flight controller).
     */
    @Description("System ID (ID of target system, normally flight controller).")
    @Units("")
    public short target_system;
    
    /**
     * Component ID (normally 0 for broadcast).
     */
    @Description("Component ID (normally 0 for broadcast).")
    @Units("")
    public short target_component;
    
    /**
     * Total number of RC channels being received. This can be larger than 32, indicating that more channels are available but not given in this message.
     */
    @Description("Total number of RC channels being received. This can be larger than 32, indicating that more channels are available but not given in this message.")
    @Units("")
    public short count;
    
    /**
     * RC channels.         Channel values are in centered 13 bit format. Range is -4096 to 4096, center is 0. Conversion to PWM is x * 5/32 + 1500.         Channels with indexes equal or above count should be set to 0, to benefit from MAVLink's trailing-zero trimming.
     */
    @Description("RC channels.         Channel values are in centered 13 bit format. Range is -4096 to 4096, center is 0. Conversion to PWM is x * 5/32 + 1500.         Channels with indexes equal or above count should be set to 0, to benefit from MAVLink's trailing-zero trimming.")
    @Units("")
    public short channels[] = new short[32];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_RADIO_RC_CHANNELS;

        packet.payload.putUnsignedInt(time_last_update_ms);
        packet.payload.putUnsignedShort(flags);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        packet.payload.putUnsignedByte(count);
        
        if (isMavlink2) {
             
        for (int i = 0; i < channels.length; i++) {
            packet.payload.putShort(channels[i]);
        }
                    
            
        }
        return packet;
    }

    /**
     * Decode a radio_rc_channels message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_last_update_ms = payload.getUnsignedInt();
        this.flags = payload.getUnsignedShort();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        this.count = payload.getUnsignedByte();
        
        if (isMavlink2) {
             
        for (int i = 0; i < this.channels.length; i++) {
            this.channels[i] = payload.getShort();
        }
                
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_radio_rc_channels() {
        this.msgid = MAVLINK_MSG_ID_RADIO_RC_CHANNELS;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_radio_rc_channels( long time_last_update_ms, int flags, short target_system, short target_component, short count, short[] channels) {
        this.msgid = MAVLINK_MSG_ID_RADIO_RC_CHANNELS;

        this.time_last_update_ms = time_last_update_ms;
        this.flags = flags;
        this.target_system = target_system;
        this.target_component = target_component;
        this.count = count;
        this.channels = channels;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_radio_rc_channels( long time_last_update_ms, int flags, short target_system, short target_component, short count, short[] channels, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_RADIO_RC_CHANNELS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_last_update_ms = time_last_update_ms;
        this.flags = flags;
        this.target_system = target_system;
        this.target_component = target_component;
        this.count = count;
        this.channels = channels;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_radio_rc_channels(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_RADIO_RC_CHANNELS;

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
        return "MAVLINK_MSG_ID_RADIO_RC_CHANNELS - sysid:"+sysid+" compid:"+compid+" time_last_update_ms:"+time_last_update_ms+" flags:"+flags+" target_system:"+target_system+" target_component:"+target_component+" count:"+count+" channels:"+channels+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_RADIO_RC_CHANNELS";
    }
}
        