/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/**
 * Gimbal device error and condition flags (0 means no error or other condition).
 */
public class MAV_STORM32_GIMBAL_DEVICE_ERROR_FLAGS {
   public static final int MAV_STORM32_GIMBAL_DEVICE_ERROR_FLAGS_AT_ROLL_LIMIT = 1; /* Gimbal device is limited by hardware roll limit. | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_ERROR_FLAGS_AT_PITCH_LIMIT = 2; /* Gimbal device is limited by hardware pitch limit. | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_ERROR_FLAGS_AT_YAW_LIMIT = 4; /* Gimbal device is limited by hardware yaw limit. | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_ERROR_FLAGS_ENCODER_ERROR = 8; /* There is an error with the gimbal device's encoders. | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_ERROR_FLAGS_POWER_ERROR = 16; /* There is an error with the gimbal device's power source. | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_ERROR_FLAGS_MOTOR_ERROR = 32; /* There is an error with the gimbal device's motors. | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_ERROR_FLAGS_SOFTWARE_ERROR = 64; /* There is an error with the gimbal device's software. | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_ERROR_FLAGS_COMMS_ERROR = 128; /* There is an error with the gimbal device's communication. | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_ERROR_FLAGS_CALIBRATION_RUNNING = 256; /* Gimbal device is currently calibrating (not an error). | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_ERROR_FLAGS_NO_MANAGER = 32768; /* Gimbal device is not assigned to a gimbal manager (not an error). | */
   public static final int MAV_STORM32_GIMBAL_DEVICE_ERROR_FLAGS_ENUM_END = 32769; /*  | */
}
            