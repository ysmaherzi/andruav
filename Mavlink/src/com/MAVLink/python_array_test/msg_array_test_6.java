/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE ARRAY_TEST_6 PACKING
package com.MAVLink.python_array_test;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * Array test #6.
 */
public class msg_array_test_6 extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_ARRAY_TEST_6 = 17156;
    public static final int MAVLINK_MSG_LENGTH = 91;
    private static final long serialVersionUID = MAVLINK_MSG_ID_ARRAY_TEST_6;

    
    /**
     * Value array
     */
    @Description("Value array")
    @Units("")
    public double ar_d[] = new double[2];
    
    /**
     * Stub field
     */
    @Description("Stub field")
    @Units("")
    public long v3;
    
    /**
     * Value array
     */
    @Description("Value array")
    @Units("")
    public long ar_u32[] = new long[2];
    
    /**
     * Value array
     */
    @Description("Value array")
    @Units("")
    public int ar_i32[] = new int[2];
    
    /**
     * Value array
     */
    @Description("Value array")
    @Units("")
    public float ar_f[] = new float[2];
    
    /**
     * Stub field
     */
    @Description("Stub field")
    @Units("")
    public int v2;
    
    /**
     * Value array
     */
    @Description("Value array")
    @Units("")
    public int ar_u16[] = new int[2];
    
    /**
     * Value array
     */
    @Description("Value array")
    @Units("")
    public short ar_i16[] = new short[2];
    
    /**
     * Stub field
     */
    @Description("Stub field")
    @Units("")
    public short v1;
    
    /**
     * Value array
     */
    @Description("Value array")
    @Units("")
    public short ar_u8[] = new short[2];
    
    /**
     * Value array
     */
    @Description("Value array")
    @Units("")
    public byte ar_i8[] = new byte[2];
    
    /**
     * Value array
     */
    @Description("Value array")
    @Units("")
    public byte ar_c[] = new byte[32];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_ARRAY_TEST_6;

        
        for (int i = 0; i < ar_d.length; i++) {
            packet.payload.putDouble(ar_d[i]);
        }
                    
        packet.payload.putUnsignedInt(v3);
        
        for (int i = 0; i < ar_u32.length; i++) {
            packet.payload.putUnsignedInt(ar_u32[i]);
        }
                    
        
        for (int i = 0; i < ar_i32.length; i++) {
            packet.payload.putInt(ar_i32[i]);
        }
                    
        
        for (int i = 0; i < ar_f.length; i++) {
            packet.payload.putFloat(ar_f[i]);
        }
                    
        packet.payload.putUnsignedShort(v2);
        
        for (int i = 0; i < ar_u16.length; i++) {
            packet.payload.putUnsignedShort(ar_u16[i]);
        }
                    
        
        for (int i = 0; i < ar_i16.length; i++) {
            packet.payload.putShort(ar_i16[i]);
        }
                    
        packet.payload.putUnsignedByte(v1);
        
        for (int i = 0; i < ar_u8.length; i++) {
            packet.payload.putUnsignedByte(ar_u8[i]);
        }
                    
        
        for (int i = 0; i < ar_i8.length; i++) {
            packet.payload.putByte(ar_i8[i]);
        }
                    
        
        for (int i = 0; i < ar_c.length; i++) {
            packet.payload.putByte(ar_c[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a array_test_6 message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        
        for (int i = 0; i < this.ar_d.length; i++) {
            this.ar_d[i] = payload.getDouble();
        }
                
        this.v3 = payload.getUnsignedInt();
        
        for (int i = 0; i < this.ar_u32.length; i++) {
            this.ar_u32[i] = payload.getUnsignedInt();
        }
                
        
        for (int i = 0; i < this.ar_i32.length; i++) {
            this.ar_i32[i] = payload.getInt();
        }
                
        
        for (int i = 0; i < this.ar_f.length; i++) {
            this.ar_f[i] = payload.getFloat();
        }
                
        this.v2 = payload.getUnsignedShort();
        
        for (int i = 0; i < this.ar_u16.length; i++) {
            this.ar_u16[i] = payload.getUnsignedShort();
        }
                
        
        for (int i = 0; i < this.ar_i16.length; i++) {
            this.ar_i16[i] = payload.getShort();
        }
                
        this.v1 = payload.getUnsignedByte();
        
        for (int i = 0; i < this.ar_u8.length; i++) {
            this.ar_u8[i] = payload.getUnsignedByte();
        }
                
        
        for (int i = 0; i < this.ar_i8.length; i++) {
            this.ar_i8[i] = payload.getByte();
        }
                
        
        for (int i = 0; i < this.ar_c.length; i++) {
            this.ar_c[i] = payload.getByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_array_test_6() {
        this.msgid = MAVLINK_MSG_ID_ARRAY_TEST_6;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_array_test_6( double[] ar_d, long v3, long[] ar_u32, int[] ar_i32, float[] ar_f, int v2, int[] ar_u16, short[] ar_i16, short v1, short[] ar_u8, byte[] ar_i8, byte[] ar_c) {
        this.msgid = MAVLINK_MSG_ID_ARRAY_TEST_6;

        this.ar_d = ar_d;
        this.v3 = v3;
        this.ar_u32 = ar_u32;
        this.ar_i32 = ar_i32;
        this.ar_f = ar_f;
        this.v2 = v2;
        this.ar_u16 = ar_u16;
        this.ar_i16 = ar_i16;
        this.v1 = v1;
        this.ar_u8 = ar_u8;
        this.ar_i8 = ar_i8;
        this.ar_c = ar_c;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_array_test_6( double[] ar_d, long v3, long[] ar_u32, int[] ar_i32, float[] ar_f, int v2, int[] ar_u16, short[] ar_i16, short v1, short[] ar_u8, byte[] ar_i8, byte[] ar_c, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_ARRAY_TEST_6;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.ar_d = ar_d;
        this.v3 = v3;
        this.ar_u32 = ar_u32;
        this.ar_i32 = ar_i32;
        this.ar_f = ar_f;
        this.v2 = v2;
        this.ar_u16 = ar_u16;
        this.ar_i16 = ar_i16;
        this.v1 = v1;
        this.ar_u8 = ar_u8;
        this.ar_i8 = ar_i8;
        this.ar_c = ar_c;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_array_test_6(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_ARRAY_TEST_6;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

                           
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setAr_C(String str) {
        int len = Math.min(str.length(), 32);
        for (int i=0; i<len; i++) {
            ar_c[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<32; i++) {            // padding for the rest of the buffer
            ar_c[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getAr_C() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 32; i++) {
            if (ar_c[i] != 0)
                buf.append((char) ar_c[i]);
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
        return "MAVLINK_MSG_ID_ARRAY_TEST_6 - sysid:"+sysid+" compid:"+compid+" ar_d:"+ar_d+" v3:"+v3+" ar_u32:"+ar_u32+" ar_i32:"+ar_i32+" ar_f:"+ar_f+" v2:"+v2+" ar_u16:"+ar_u16+" ar_i16:"+ar_i16+" v1:"+v1+" ar_u8:"+ar_u8+" ar_i8:"+ar_i8+" ar_c:"+ar_c+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_ARRAY_TEST_6";
    }
}
        