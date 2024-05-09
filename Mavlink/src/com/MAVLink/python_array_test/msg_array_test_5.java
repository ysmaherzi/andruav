/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE ARRAY_TEST_5 PACKING
package com.MAVLink.python_array_test;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * Array test #5.
 */
public class msg_array_test_5 extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_ARRAY_TEST_5 = 17155;
    public static final int MAVLINK_MSG_LENGTH = 10;
    private static final long serialVersionUID = MAVLINK_MSG_ID_ARRAY_TEST_5;

    
    /**
     * Value array
     */
    @Description("Value array")
    @Units("")
    public byte[] c1 = new byte[5];
    
    /**
     * Value array
     */
    @Description("Value array")
    @Units("")
    public byte[] c2 = new byte[5];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_ARRAY_TEST_5;

        
        for (int i = 0; i < c1.length; i++) {
            packet.payload.putByte(c1[i]);
        }
                    
        
        for (int i = 0; i < c2.length; i++) {
            packet.payload.putByte(c2[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a array_test_5 message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        
        for (int i = 0; i < this.c1.length; i++) {
            this.c1[i] = payload.getByte();
        }
                
        
        for (int i = 0; i < this.c2.length; i++) {
            this.c2[i] = payload.getByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_array_test_5() {
        this.msgid = MAVLINK_MSG_ID_ARRAY_TEST_5;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_array_test_5( byte[] c1, byte[] c2) {
        this.msgid = MAVLINK_MSG_ID_ARRAY_TEST_5;

        this.c1 = c1;
        this.c2 = c2;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_array_test_5( byte[] c1, byte[] c2, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_ARRAY_TEST_5;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.c1 = c1;
        this.c2 = c2;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_array_test_5(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_ARRAY_TEST_5;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

     
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setC1(String str) {
        int len = Math.min(str.length(), 5);
        for (int i=0; i<len; i++) {
            c1[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<5; i++) {            // padding for the rest of the buffer
            c1[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getC1() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 5; i++) {
            if (c1[i] != 0)
                buf.append((char) c1[i]);
            else
                break;
        }
        return buf.toString();

    }
                          
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setC2(String str) {
        int len = Math.min(str.length(), 5);
        for (int i=0; i<len; i++) {
            c2[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<5; i++) {            // padding for the rest of the buffer
            c2[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getC2() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 5; i++) {
            if (c2[i] != 0)
                buf.append((char) c2[i]);
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
        return "MAVLINK_MSG_ID_ARRAY_TEST_5 - sysid:"+sysid+" compid:"+compid+" c1:"+c1+" c2:"+c2+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_ARRAY_TEST_5";
    }
}
        