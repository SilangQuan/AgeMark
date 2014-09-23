package com.tencent.agemark;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class AgeSurfaceView extends GLSurfaceView {
	private GLSurfaceView surfaceView;
	private AgeRenderer renderer;
	public AgeSurfaceView(Context context)
	{
		super(context);
		renderer = new AgeRenderer();
		this.setRenderer(renderer);
	}

}
