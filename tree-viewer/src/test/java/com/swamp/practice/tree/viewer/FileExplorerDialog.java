package com.swamp.practice.tree.viewer;


import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Shell;

public class FileExplorerDialog extends Dialog{

	public FileExplorerDialog(Shell parentShell) {
		super(parentShell);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public int open() {
		System.out.println("open pressed");
		// TODO Auto-generated method stub
		return super.open();
	}
	
	
	@Override
	protected void okPressed() {

System.out.println("ok pressed");
		super.okPressed();
	}
	
	
	

}
