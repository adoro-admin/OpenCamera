package net.sourceforge.opencamera.Preview.CameraSurface;

import android.graphics.Matrix;
import android.view.View;

import net.sourceforge.opencamera.CameraController.CameraController;

public interface CameraSurface {
	abstract View getView();
	abstract void setPreviewDisplay(CameraController camera_controller); // n.b., uses double-dispatch similar to Visitor pattern - behaviour depends on type of CameraSurface and CameraController
	abstract void setTransform(Matrix matrix);
}
