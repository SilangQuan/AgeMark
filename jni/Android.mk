LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := AgeMark
LOCAL_SRC_FILES := AgeMark.cpp\
			 com_tencent_agemark_AgeRenderer.cpp

LOCAL_LDLIBS := -lGLESv1_CM -lGLESv2 -llog

include $(BUILD_SHARED_LIBRARY)
