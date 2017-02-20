package com.swamp.practice.tree.provider;

import java.io.File;

import org.eclipse.jface.viewers.ITreeContentProvider;

public class CustomTreeContentProvider implements ITreeContentProvider {

	public Object[] getElements(Object inputElement) {
		// TODO Auto-generated method stub
		System.out.println(inputElement);
		File f = (File) inputElement;
		if(f.isDirectory()){
			return f.listFiles();
		}
		return new Object[0];
	}

	public Object[] getChildren(Object parentElement) {
		System.out.println("Inside getchi");
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
