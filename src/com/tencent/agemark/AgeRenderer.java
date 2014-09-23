package com.tencent.agemark;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLSurfaceView.Renderer;
import android.util.Log;

public class AgeRenderer implements Renderer{
	private long startTime = System.nanoTime();
	private int frames = 0;

	private static native void nativeInit();
	private static native void nativeResize(int w, int h);
	private static native void nativeRender();
	private static native void nativeDone();

	@Override
	public void onDrawFrame(GL10 arg0) {
		// TODO Auto-generated method stub
		nativeRender();
		logFrame();
	}

	@Override
	public void onSurfaceChanged(GL10 arg0, int width, int height) {
		// TODO Auto-generated method stub
		nativeResize(width, height);
	}

	@Override
	public void onSurfaceCreated(GL10 arg0, EGLConfig arg1) {
		// TODO Auto-generated method stub
		nativeInit();
	}

	public void logFrame()
	{
		frames++;
		if(System.nanoTime() - startTime >= 1000000000)
		{
			Log.d("FPSCounter", "fps: " + frames);
			frames = 0;
			startTime = System.nanoTime();
		}
	}

}
