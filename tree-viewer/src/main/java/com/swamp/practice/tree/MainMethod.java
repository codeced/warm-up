package com.swamp.practice.tree;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import com.swamp.practice.tree.viewer.AppWindow;
import com.swamp.practice.tree.viewer.FileExplorerDialog;

/**
 * Unit test for simple App.
 */
public class MainMethod {

	public static void main(String[] args) {

		Display d = new Display();
		Shell s = new Shell(d);
		s.setText("Title");
		s.setLayout(new GridLayout());
		FileExplorerDialog dialog = new FileExplorerDialog(s);

		// w.open();

		

		dialog.open();

	}

}
