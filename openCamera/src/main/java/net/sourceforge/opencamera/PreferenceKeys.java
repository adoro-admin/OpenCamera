package net.sourceforge.opencamera;

public class PreferenceKeys {
    // must be static, to safely call from other Activities
	
	// arguably the static methods here that don't receive an argument could just be static final strings? Though we may want to change some of them to be cameraId-specific in future

    public static String getFirstTimePreferenceKey() {
        return "done_first_time";
    }

    public static String getUseCamera2PreferenceKey() {
    	return "preference_use_camera2";
    }

    public static String getFlashPreferenceKey(int cameraId) {
    	return "flash_value_" + cameraId;
    }

    /*public static String getFocusPreferenceKey(int cameraId) {
    	return "focus_value_" + cameraId;
    }*/

    public static String getResolutionPreferenceKey(int cameraId) {
    	return "camera_resolution_" + cameraId;
    }
    
    public static String getExposurePreferenceKey() {
    	return "preference_exposure";
    }

    public static String getColorEffectPreferenceKey() {
    	return "preference_color_effect";
    }

    public static String getSceneModePreferenceKey() {
    	return "preference_scene_mode";
    }

    public static String getWhiteBalancePreferenceKey() {
    	return "preference_white_balance";
    }

    public static String getISOPreferenceKey() {
    	return "preference_iso";
    }
    
    public static String getExposureTimePreferenceKey() {
    	return "preference_exposure_time";
    }
    
    public static String getVolumeKeysPreferenceKey() {
    	return "preference_volume_keys";
    }
    
    public static String getQualityPreferenceKey() {
    	return "preference_quality";
    }
    
    public static String getAutoStabilisePreferenceKey() {
    	return "preference_auto_stabilise";
    }
    
    public static String getLocationPreferenceKey() {
    	return "preference_location";
    }
    
    public static String getGPSDirectionPreferenceKey() {
    	return "preference_gps_direction";
    }
    
    public static String getRequireLocationPreferenceKey() {
    	return "preference_require_location";
    }
    
    public static String getStampPreferenceKey() {
    	return "preference_stamp";
    }

    public static String getStampDateFormatPreferenceKey() {
    	return "preference_stamp_dateformat";
    }

    public static String getStampTimeFormatPreferenceKey() {
    	return "preference_stamp_timeformat";
    }

    public static String getStampGPSFormatPreferenceKey() {
    	return "preference_stamp_gpsformat";
    }

    public static String getTextStampPreferenceKey() {
    	return "preference_textstamp";
    }

    public static String getStampFontSizePreferenceKey() {
    	return "preference_stamp_fontsize";
    }

    public static String getStampFontColorPreferenceKey() {
    	return "preference_stamp_font_color";
    }

    public static String getStampStyleKey() {
    	return "preference_stamp_style";
    }

    public static String getUIPlacementPreferenceKey() {
    	return "preference_ui_placement";
    }
    
    public static String getTouchCapturePreferenceKey() {
    	return "preference_touch_capture";
    }

    public static String getPausePreviewPreferenceKey() {
    	return "preference_pause_preview";
    }

    public static String getShowToastsPreferenceKey() {
    	return "preference_show_toasts";
    }

    public static String getThumbnailAnimationPreferenceKey() {
    	return "preference_thumbnail_animation";
    }
    
    public static String getUsingSAFPreferenceKey() {
    	return "preference_using_saf";
    }

    public static String getSaveLocationPreferenceKey() {
    	return "preference_save_location";
    }

    public static String getSaveLocationSAFPreferenceKey() {
    	return "preference_save_location_saf";
    }

    public static String getSavePhotoPrefixPreferenceKey() {
    	return "preference_save_photo_prefix";
    }

    public static String getShowISOPreferenceKey() {
    	return "preference_show_iso";
    }
    
    public static String getShowGridPreferenceKey() {
    	return "preference_grid";
    }
    
    public static String getShowCropGuidePreferenceKey() {
    	return "preference_crop_guide";
    }
    
    public static String getFaceDetectionPreferenceKey() {
    	return "preference_face_detection";
    }

    public static String getPreviewSizePreferenceKey() {
    	return "preference_preview_size";
    }

    public static String getRotatePreviewPreferenceKey() {
    	return "preference_rotate_preview";
    }


    public static String getTimerPreferenceKey() {
    	return "preference_timer";
    }
    
    public static String getTimerBeepPreferenceKey() {
    	return "preference_timer_beep";
    }
    
    public static String getTimerSpeakPreferenceKey() {
    	return "preference_timer_speak";
    }
    
    public static String getBurstModePreferenceKey() {
    	return "preference_burst_mode";
    }
    
    public static String getBurstIntervalPreferenceKey() {
    	return "preference_burst_interval";
    }
    
    public static String getShutterSoundPreferenceKey() {
    	return "preference_shutter_sound";
    }
    
    public static String getImmersiveModePreferenceKey() {
    	return "preference_immersive_mode";
    }
}
