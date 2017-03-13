package com.swamp.practice.tree.viewer;

import java.io.File;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import com.swamp.practice.tree.provider.CustomTreeContentProvider;
import com.swamp.practice.tree.provider.CustomTreeLabelProvider;

public class FileExplorerDialog extends Dialog {

	TreeViewer treeViewer = null;

	public FileExplorerDialog(Shell parentShell) {
		super(parentShell);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Control createContents(Composite parent) {

		// System.out.println("create");

		treeViewer = new TreeViewer(parent);
		treeViewer.setContentProvider(new CustomTreeContentProvider());
		treeViewer.setLabelProvider(new CustomTreeLabelProvider());
		treeViewer.setInput(new File("D:/movies"));
		treeViewer.getTree().setLayoutData(new GridData(GridData.FILL));
		Label l = new Label(parent, 0);
		l.setText("Hello");
		Button b = new Button(parent, SWT.PUSH);
		b.setText("click me");
		b.setLayoutData(new GridData());
		b.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				FileDialog di = new FileDialog(new Shell());
				System.out.println(di.open());
			}

			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		super.createContents(parent);
		return null;
	}

	@Override
	public int open() {
		return super.open();
	}

	@Override
	protected void okPressed() {
		System.out.println(treeViewer.getSelection());
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
