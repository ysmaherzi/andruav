/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE STATUSTEXT PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * Status text message. These messages are printed in yellow in the COMM console of QGroundControl. WARNING: They consume quite some bandwidth, so use only for important status and error messages. If implemented wisely, these messages are buffered on the MCU and sent only at a limited rate (e.g. 10 Hz).
 */
public class msg_statustext extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_STATUSTEXT = 253;
    public static final int MAVLINK_MSG_LENGTH = 54;
    private static final long serialVersionUID = MAVLINK_MSG_ID_STATUSTEXT;

    
    /**
     * Severity of status. Relies on the definitions within RFC-5424.
     */
    @Description("Severity of status. Relies on the definitions within RFC-5424.")
    @Units("")
    public short severity;
    
    /**
     * Status text message, without null termination character
     */
    @Description("Status text message, without null termination character")
    @Units("")
    public byte[] text = new byte[50];
    
    /**
     * Unique (opaque) identifier for this statustext message.  May be used to reassemble a logical long-statustext message from a sequence of chunks.  A value of zero indicates this is the only chunk in the sequence and the message can be emitted immediately.
     */
    @Description("Unique (opaque) identifier for this statustext message.  May be used to reassemble a logical long-statustext message from a sequence of chunks.  A value of zero indicates this is the only chunk in the sequence and the message can be emitted immediately.")
    @Units("")
    public int id;
    
    /**
     * This chunk's sequence number; indexing is from zero.  Any null character in the text field is taken to mean this was the last chunk.
     */
    @Description("This chunk's sequence number; indexing is from zero.  Any null character in the text field is taken to mean this was the last chunk.")
    @Units("")
    public short chunk_seq;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_STATUSTEXT;

        packet.payload.putUnsignedByte(severity);
        
        for (int i = 0; i < text.length; i++) {
            packet.payload.putByte(text[i]);
        }
                    
        
        if (isMavlink2) {
             packet.payload.putUnsignedShort(id);
             packet.payload.putUnsignedByte(chunk_seq);
            
        }
        return packet;
    }

    /**
     * Decode a statustext message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.severity = payload.getUnsignedByte();
        
        for (int i = 0; i < this.text.length; i++) {
            this.text[i] = payload.getByte();
        }
                
        
        if (isMavlink2) {
             this.id = payload.getUnsignedShort();
             this.chunk_seq = payload.getUnsignedByte();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_statustext() {
        this.msgid = MAVLINK_MSG_ID_STATUSTEXT;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_statustext( short severity, byte[] text, int id, short chunk_seq) {
        this.msgid = MAVLINK_MSG_ID_STATUSTEXT;

        this.severity = severity;
        this.text = text;
        this.id = id;
        this.chunk_seq = chunk_seq;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_statustext( short severity, byte[] text, int id, short chunk_seq, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_STATUSTEXT;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.severity = severity;
        this.text = text;
        this.id = id;
        this.chunk_seq = chunk_seq;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_statustext(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_STATUSTEXT;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

       
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setText(String str) {
        int len = Math.min(str.length(), 50);
        for (int i=0; i<len; i++) {
            text[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<50; i++) {            // padding for the rest of the buffer
            text[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getText() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 50; i++) {
            if (text[i] != 0)
                buf.append((char) text[i]);
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
        return "MAVLINK_MSG_ID_STATUSTEXT - sysid:"+sysid+" compid:"+compid+" severity:"+severity+" text:"+text+" id:"+id+" chunk_seq:"+chunk_seq+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_STATUSTEXT";
    }
}
        