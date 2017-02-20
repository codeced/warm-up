package com.swamp.practice.tree.viewer;

import java.io.File;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import com.swamp.practice.tree.provider.CustomTreeContentProvider;
import com.swamp.practice.tree.provider.CustomTreeLabelProvider;

public class FileExplorerDialog extends Dialog {

	public FileExplorerDialog(Shell parentShell) {
		super(parentShell);

		// TODO Auto-generated constructor stub
	}

	@Override
	protected Control createContents(Composite parent) {

//		System.out.println("create");
		 
		
		TreeViewer v = new TreeViewer(parent);		
		v.setContentProvider(new CustomTreeContentProvider());
		v.setLabelProvider(new CustomTreeLabelProvider());
		v.setInput(new File("D:/movies"));
		v.getTree().setLayoutData(new GridData(GridData.FILL));
		super.createContents(parent);
		return null;
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

	@Override
	protected void configureShell(Shell newShell) {
		
		// TODO Auto-generated method stub
		super.configureShell(newShell);
		newShell.setLayout(new GridLayout());
		newShell.setBounds(500, 100, 500, 500);
		newShell.setText("Custom file explorer dialog");
	}

}
