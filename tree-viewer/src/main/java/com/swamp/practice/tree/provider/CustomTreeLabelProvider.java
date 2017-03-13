package com.swamp.practice.tree.provider;

import java.io.File;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;

public class CustomTreeLabelProvider implements ILabelProvider {

	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	public Image getImage(Object element) {
		// TODO Auto-generated method stub
		ImageData source = new ImageData(getClass().getResourceAsStream("/icon/download.png"));
		
	      ImageData mask = source.getTransparencyMask();
	      return new Image(null, source, mask); 
//	      return null;
	}

	public String getText(Object element) {
		return element.toString();
	}

}
