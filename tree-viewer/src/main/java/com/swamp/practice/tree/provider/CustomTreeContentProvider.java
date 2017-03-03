package com.swamp.practice.tree.provider;

import java.io.File;
import java.util.EventObject;

import org.eclipse.jface.viewers.ITreeContentProvider;

public class CustomTreeContentProvider implements ITreeContentProvider {

	public Object[] getElements(Object inputElement) {
		// TODO Auto-generated method stub
		File f = (File) inputElement;
		if(f.isDirectory()){
			return f.listFiles();
		}
		return new Object[0];
	}

	public Object[] getChildren(Object parentElement) {
		File f = (File) parentElement;
		if(f.isDirectory()){
			return f.listFiles();
		}
		return new Object[0];
	}

	public Object getParent(Object element) {
		
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasChildren(Object element) {
		File f = (File) element;
		if(f.isDirectory()){
			return f.listFiles()!= null;
		}
		return false;
	}

}
