/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE STORM32_GIMBAL_DEVICE_STATUS PACKING
package com.MAVLink.storm32;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * Message reporting the current status of a gimbal device. This message should be broadcasted by a gimbal device component at a low regular rate (e.g. 4 Hz). For higher rates it should be emitted with a target.
 */
public class msg_storm32_gimbal_device_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_STORM32_GIMBAL_DEVICE_STATUS = 60001;
    public static final int MAVLINK_MSG_LENGTH = 42;
    private static final long serialVersionUID = MAVLINK_MSG_ID_STORM32_GIMBAL_DEVICE_STATUS;

    
    /**
     * Timestamp (time since system boot).
     */
    @Description("Timestamp (time since system boot).")
    @Units("ms")
    public long time_boot_ms;
    
    /**
     * Quaternion components, w, x, y, z (1 0 0 0 is the null-rotation). The frame depends on the STORM32_GIMBAL_DEVICE_FLAGS_YAW_ABSOLUTE flag.
     */
    @Description("Quaternion components, w, x, y, z (1 0 0 0 is the null-rotation). The frame depends on the STORM32_GIMBAL_DEVICE_FLAGS_YAW_ABSOLUTE flag.")
    @Units("")
    public float q[] = new float[4];
    
    /**
     * X component of angular velocity (NaN if unknown).
     */
    @Description("X component of angular velocity (NaN if unknown).")
    @Units("rad/s")
    public float angular_velocity_x;
    
    /**
     * Y component of angular velocity (NaN if unknown).
     */
    @Description("Y component of angular velocity (NaN if unknown).")
    @Units("rad/s")
    public float angular_velocity_y;
    
    /**
     * Z component of angular velocity (the frame depends on the STORM32_GIMBAL_DEVICE_FLAGS_YAW_ABSOLUTE flag, NaN if unknown).
     */
    @Description("Z component of angular velocity (the frame depends on the STORM32_GIMBAL_DEVICE_FLAGS_YAW_ABSOLUTE flag, NaN if unknown).")
    @Units("rad/s")
    public float angular_velocity_z;
    
    /**
     * Yaw in absolute frame relative to Earth's North, north is 0 (NaN if unknown).
     */
    @Description("Yaw in absolute frame relative to Earth's North, north is 0 (NaN if unknown).")
    @Units("deg")
    public float yaw_absolute;
    
    /**
     * Gimbal device flags currently applied.
     */
    @Description("Gimbal device flags currently applied.")
    @Units("")
    public int flags;
    
    /**
     * Failure flags (0 for no failure).
     */
    @Description("Failure flags (0 for no failure).")
    @Units("")
    public int failure_flags;
    
    /**
     * System ID
     */
    @Description("System ID")
    @Units("")
    public short target_system;
    
    /**
     * Component ID
     */
    @Description("Component ID")
    @Units("")
    public short target_component;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_STORM32_GIMBAL_DEVICE_STATUS;

        packet.payload.putUnsignedInt(time_boot_ms);
        
        for (int i = 0; i < q.length; i++) {
            packet.payload.putFloat(q[i]);
        }
                    
        packet.payload.putFloat(angular_velocity_x);
        packet.payload.putFloat(angular_velocity_y);
        packet.payload.putFloat(angular_velocity_z);
        packet.payload.putFloat(yaw_absolute);
        packet.payload.putUnsignedShort(flags);
        packet.payload.putUnsignedShort(failure_flags);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a storm32_gimbal_device_status message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_boot_ms = payload.getUnsignedInt();
        
        for (int i = 0; i < this.q.length; i++) {
            this.q[i] = payload.getFloat();
        }
                
        this.angular_velocity_x = payload.getFloat();
        this.angular_velocity_y = payload.getFloat();
        this.angular_velocity_z = payload.getFloat();
        this.yaw_absolute = payload.getFloat();
        this.flags = payload.getUnsignedShort();
        this.failure_flags = payload.getUnsignedShort();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_storm32_gimbal_device_status() {
        this.msgid = MAVLINK_MSG_ID_STORM32_GIMBAL_DEVICE_STATUS;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_storm32_gimbal_device_status( long time_boot_ms, float[] q, float angular_velocity_x, float angular_velocity_y, float angular_velocity_z, float yaw_absolute, int flags, int failure_flags, short target_system, short target_component) {
        this.msgid = MAVLINK_MSG_ID_STORM32_GIMBAL_DEVICE_STATUS;

        this.time_boot_ms = time_boot_ms;
        this.q = q;
        this.angular_velocity_x = angular_velocity_x;
        this.angular_velocity_y = angular_velocity_y;
        this.angular_velocity_z = angular_velocity_z;
        this.yaw_absolute = yaw_absolute;
        this.flags = flags;
        this.failure_flags = failure_flags;
        this.target_system = target_system;
        this.target_component = target_component;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_storm32_gimbal_device_status( long time_boot_ms, float[] q, float angular_velocity_x, float angular_velocity_y, float angular_velocity_z, float yaw_absolute, int flags, int failure_flags, short target_system, short target_component, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_STORM32_GIMBAL_DEVICE_STATUS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.q = q;
        this.angular_velocity_x = angular_velocity_x;
        this.angular_velocity_y = angular_velocity_y;
        this.angular_velocity_z = angular_velocity_z;
        this.yaw_absolute = yaw_absolute;
        this.flags = flags;
        this.failure_flags = failure_flags;
        this.target_system = target_system;
        this.target_component = target_component;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_storm32_gimbal_device_status(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_STORM32_GIMBAL_DEVICE_STATUS;

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
        return "MAVLINK_MSG_ID_STORM32_GIMBAL_DEVICE_STATUS - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" q:"+q+" angular_velocity_x:"+angular_velocity_x+" angular_velocity_y:"+angular_velocity_y+" angular_velocity_z:"+angular_velocity_z+" yaw_absolute:"+yaw_absolute+" flags:"+flags+" failure_flags:"+failure_flags+" target_system:"+target_system+" target_component:"+target_component+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_STORM32_GIMBAL_DEVICE_STATUS";
    }
}
        