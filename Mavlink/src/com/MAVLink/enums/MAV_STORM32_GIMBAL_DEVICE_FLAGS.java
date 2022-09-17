/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/**
 * Flags for gimbal device operation. Used for setting and reporting, unless specified otherwise. Settings which are in violation of the capability flags are ignored by the gimbal device.
 */
public class MAV_STORM32_GIMBAL_DEVICE_FLAGS {
   public static final int MAV_STORM32_GIMBAL_DEVICE_FLAGS_RETRACT = 1; /* Retracted safe position (no stabilization), takes presedence over NEUTRAL flag. If supported by the gimbal, the angles in the retracted position can be set in addition. | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_FLAGS_NEUTRAL = 2; /* Neutral position (horizontal, forward looking, with stabiliziation). | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_FLAGS_ROLL_LOCK = 4; /* Lock roll angle to absolute angle relative to horizon (not relative to drone). This is generally the default. | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_FLAGS_PITCH_LOCK = 8; /* Lock pitch angle to absolute angle relative to horizon (not relative to drone). This is generally the default. | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_FLAGS_YAW_LOCK = 16; /* Lock yaw angle to absolute angle relative to earth (not relative to drone). When the YAW_ABSOLUTE flag is set, the quaternion is in the Earth frame with the x-axis pointing North (yaw absolute), else it is in the Earth frame rotated so that the x-axis is pointing forward (yaw relative to vehicle). | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_FLAGS_CAN_ACCEPT_YAW_ABSOLUTE = 256; /* Gimbal device can accept absolute yaw angle input. This flag cannot be set, is only for reporting (attempts to set it are rejected by the gimbal device). | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_FLAGS_YAW_ABSOLUTE = 512; /* Yaw angle is absolute (is only accepted if CAN_ACCEPT_YAW_ABSOLUTE is set). If this flag is set, the quaternion is in the Earth frame with the x-axis pointing North (yaw absolute), else it is in the Earth frame rotated so that the x-axis is pointing forward (yaw relative to vehicle). | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_FLAGS_RC_EXCLUSIVE = 1024; /* RC control. The RC input signal fed to the gimbal device exclusively controls the gimbal's orientation. Overrides RC_MIXED flag if that is also set. | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_FLAGS_RC_MIXED = 2048; /* RC control. The RC input signal fed to the gimbal device is mixed into the gimbal's orientation. Is overriden by RC_EXCLUSIVE flag if that is also set. | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_FLAGS_NONE = 65535; /* UINT16_MAX = ignore. | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_FLAGS_ENUM_END = 65536; /*  | */
}
            