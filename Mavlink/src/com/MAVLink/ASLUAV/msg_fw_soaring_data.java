/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE FW_SOARING_DATA PACKING
package com.MAVLink.ASLUAV;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * Fixed-wing soaring (i.e. thermal seeking) data
 */
public class msg_fw_soaring_data extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_FW_SOARING_DATA = 8011;
    public static final int MAVLINK_MSG_LENGTH = 102;
    private static final long serialVersionUID = MAVLINK_MSG_ID_FW_SOARING_DATA;

    
    /**
     * Timestamp
     */
    @Description("Timestamp")
    @Units("ms")
    public long timestamp;
    
    /**
     * Timestamp since last mode change
     */
    @Description("Timestamp since last mode change")
    @Units("ms")
    public long timestampModeChanged;
    
    /**
     * Thermal core updraft strength
     */
    @Description("Thermal core updraft strength")
    @Units("m/s")
    public float xW;
    
    /**
     * Thermal radius
     */
    @Description("Thermal radius")
    @Units("m")
    public float xR;
    
    /**
     * Thermal center latitude
     */
    @Description("Thermal center latitude")
    @Units("deg")
    public float xLat;
    
    /**
     * Thermal center longitude
     */
    @Description("Thermal center longitude")
    @Units("deg")
    public float xLon;
    
    /**
     * Variance W
     */
    @Description("Variance W")
    @Units("")
    public float VarW;
    
    /**
     * Variance R
     */
    @Description("Variance R")
    @Units("")
    public float VarR;
    
    /**
     * Variance Lat
     */
    @Description("Variance Lat")
    @Units("")
    public float VarLat;
    
    /**
     * Variance Lon 
     */
    @Description("Variance Lon ")
    @Units("")
    public float VarLon;
    
    /**
     * Suggested loiter radius
     */
    @Description("Suggested loiter radius")
    @Units("m")
    public float LoiterRadius;
    
    /**
     * Suggested loiter direction
     */
    @Description("Suggested loiter direction")
    @Units("")
    public float LoiterDirection;
    
    /**
     * Distance to soar point
     */
    @Description("Distance to soar point")
    @Units("m")
    public float DistToSoarPoint;
    
    /**
     * Expected sink rate at current airspeed, roll and throttle
     */
    @Description("Expected sink rate at current airspeed, roll and throttle")
    @Units("m/s")
    public float vSinkExp;
    
    /**
     * Measurement / updraft speed at current/local airplane position
     */
    @Description("Measurement / updraft speed at current/local airplane position")
    @Units("m/s")
    public float z1_LocalUpdraftSpeed;
    
    /**
     * Measurement / roll angle tracking error
     */
    @Description("Measurement / roll angle tracking error")
    @Units("deg")
    public float z2_DeltaRoll;
    
    /**
     * Expected measurement 1
     */
    @Description("Expected measurement 1")
    @Units("")
    public float z1_exp;
    
    /**
     * Expected measurement 2
     */
    @Description("Expected measurement 2")
    @Units("")
    public float z2_exp;
    
    /**
     * Thermal drift (from estimator prediction step only)
     */
    @Description("Thermal drift (from estimator prediction step only)")
    @Units("m/s")
    public float ThermalGSNorth;
    
    /**
     * Thermal drift (from estimator prediction step only)
     */
    @Description("Thermal drift (from estimator prediction step only)")
    @Units("m/s")
    public float ThermalGSEast;
    
    /**
     *  Total specific energy change (filtered)
     */
    @Description(" Total specific energy change (filtered)")
    @Units("m/s")
    public float TSE_dot;
    
    /**
     *  Debug variable 1
     */
    @Description(" Debug variable 1")
    @Units("")
    public float DebugVar1;
    
    /**
     *  Debug variable 2
     */
    @Description(" Debug variable 2")
    @Units("")
    public float DebugVar2;
    
    /**
     * Control Mode [-]
     */
    @Description("Control Mode [-]")
    @Units("")
    public short ControlMode;
    
    /**
     * Data valid [-]
     */
    @Description("Data valid [-]")
    @Units("")
    public short valid;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_FW_SOARING_DATA;

        packet.payload.putUnsignedLong(timestamp);
        packet.payload.putUnsignedLong(timestampModeChanged);
        packet.payload.putFloat(xW);
        packet.payload.putFloat(xR);
        packet.payload.putFloat(xLat);
        packet.payload.putFloat(xLon);
        packet.payload.putFloat(VarW);
        packet.payload.putFloat(VarR);
        packet.payload.putFloat(VarLat);
        packet.payload.putFloat(VarLon);
        packet.payload.putFloat(LoiterRadius);
        packet.payload.putFloat(LoiterDirection);
        packet.payload.putFloat(DistToSoarPoint);
        packet.payload.putFloat(vSinkExp);
        packet.payload.putFloat(z1_LocalUpdraftSpeed);
        packet.payload.putFloat(z2_DeltaRoll);
        packet.payload.putFloat(z1_exp);
        packet.payload.putFloat(z2_exp);
        packet.payload.putFloat(ThermalGSNorth);
        packet.payload.putFloat(ThermalGSEast);
        packet.payload.putFloat(TSE_dot);
        packet.payload.putFloat(DebugVar1);
        packet.payload.putFloat(DebugVar2);
        packet.payload.putUnsignedByte(ControlMode);
        packet.payload.putUnsignedByte(valid);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a fw_soaring_data message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.timestamp = payload.getUnsignedLong();
        this.timestampModeChanged = payload.getUnsignedLong();
        this.xW = payload.getFloat();
        this.xR = payload.getFloat();
        this.xLat = payload.getFloat();
        this.xLon = payload.getFloat();
        this.VarW = payload.getFloat();
        this.VarR = payload.getFloat();
        this.VarLat = payload.getFloat();
        this.VarLon = payload.getFloat();
        this.LoiterRadius = payload.getFloat();
        this.LoiterDirection = payload.getFloat();
        this.DistToSoarPoint = payload.getFloat();
        this.vSinkExp = payload.getFloat();
        this.z1_LocalUpdraftSpeed = payload.getFloat();
        this.z2_DeltaRoll = payload.getFloat();
        this.z1_exp = payload.getFloat();
        this.z2_exp = payload.getFloat();
        this.ThermalGSNorth = payload.getFloat();
        this.ThermalGSEast = payload.getFloat();
        this.TSE_dot = payload.getFloat();
        this.DebugVar1 = payload.getFloat();
        this.DebugVar2 = payload.getFloat();
        this.ControlMode = payload.getUnsignedByte();
        this.valid = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_fw_soaring_data() {
        this.msgid = MAVLINK_MSG_ID_FW_SOARING_DATA;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_fw_soaring_data( long timestamp, long timestampModeChanged, float xW, float xR, float xLat, float xLon, float VarW, float VarR, float VarLat, float VarLon, float LoiterRadius, float LoiterDirection, float DistToSoarPoint, float vSinkExp, float z1_LocalUpdraftSpeed, float z2_DeltaRoll, float z1_exp, float z2_exp, float ThermalGSNorth, float ThermalGSEast, float TSE_dot, float DebugVar1, float DebugVar2, short ControlMode, short valid) {
        this.msgid = MAVLINK_MSG_ID_FW_SOARING_DATA;

        this.timestamp = timestamp;
        this.timestampModeChanged = timestampModeChanged;
        this.xW = xW;
        this.xR = xR;
        this.xLat = xLat;
        this.xLon = xLon;
        this.VarW = VarW;
        this.VarR = VarR;
        this.VarLat = VarLat;
        this.VarLon = VarLon;
        this.LoiterRadius = LoiterRadius;
        this.LoiterDirection = LoiterDirection;
        this.DistToSoarPoint = DistToSoarPoint;
        this.vSinkExp = vSinkExp;
        this.z1_LocalUpdraftSpeed = z1_LocalUpdraftSpeed;
        this.z2_DeltaRoll = z2_DeltaRoll;
        this.z1_exp = z1_exp;
        this.z2_exp = z2_exp;
        this.ThermalGSNorth = ThermalGSNorth;
        this.ThermalGSEast = ThermalGSEast;
        this.TSE_dot = TSE_dot;
        this.DebugVar1 = DebugVar1;
        this.DebugVar2 = DebugVar2;
        this.ControlMode = ControlMode;
        this.valid = valid;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_fw_soaring_data( long timestamp, long timestampModeChanged, float xW, float xR, float xLat, float xLon, float VarW, float VarR, float VarLat, float VarLon, float LoiterRadius, float LoiterDirection, float DistToSoarPoint, float vSinkExp, float z1_LocalUpdraftSpeed, float z2_DeltaRoll, float z1_exp, float z2_exp, float ThermalGSNorth, float ThermalGSEast, float TSE_dot, float DebugVar1, float DebugVar2, short ControlMode, short valid, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_FW_SOARING_DATA;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.timestamp = timestamp;
        this.timestampModeChanged = timestampModeChanged;
        this.xW = xW;
        this.xR = xR;
        this.xLat = xLat;
        this.xLon = xLon;
        this.VarW = VarW;
        this.VarR = VarR;
        this.VarLat = VarLat;
        this.VarLon = VarLon;
        this.LoiterRadius = LoiterRadius;
        this.LoiterDirection = LoiterDirection;
        this.DistToSoarPoint = DistToSoarPoint;
        this.vSinkExp = vSinkExp;
        this.z1_LocalUpdraftSpeed = z1_LocalUpdraftSpeed;
        this.z2_DeltaRoll = z2_DeltaRoll;
        this.z1_exp = z1_exp;
        this.z2_exp = z2_exp;
        this.ThermalGSNorth = ThermalGSNorth;
        this.ThermalGSEast = ThermalGSEast;
        this.TSE_dot = TSE_dot;
        this.DebugVar1 = DebugVar1;
        this.DebugVar2 = DebugVar2;
        this.ControlMode = ControlMode;
        this.valid = valid;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_fw_soaring_data(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_FW_SOARING_DATA;

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
        return "MAVLINK_MSG_ID_FW_SOARING_DATA - sysid:"+sysid+" compid:"+compid+" timestamp:"+timestamp+" timestampModeChanged:"+timestampModeChanged+" xW:"+xW+" xR:"+xR+" xLat:"+xLat+" xLon:"+xLon+" VarW:"+VarW+" VarR:"+VarR+" VarLat:"+VarLat+" VarLon:"+VarLon+" LoiterRadius:"+LoiterRadius+" LoiterDirection:"+LoiterDirection+" DistToSoarPoint:"+DistToSoarPoint+" vSinkExp:"+vSinkExp+" z1_LocalUpdraftSpeed:"+z1_LocalUpdraftSpeed+" z2_DeltaRoll:"+z2_DeltaRoll+" z1_exp:"+z1_exp+" z2_exp:"+z2_exp+" ThermalGSNorth:"+ThermalGSNorth+" ThermalGSEast:"+ThermalGSEast+" TSE_dot:"+TSE_dot+" DebugVar1:"+DebugVar1+" DebugVar2:"+DebugVar2+" ControlMode:"+ControlMode+" valid:"+valid+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_FW_SOARING_DATA";
    }
}
        