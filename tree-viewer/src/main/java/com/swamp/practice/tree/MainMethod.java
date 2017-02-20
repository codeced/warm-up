package com.swamp.practice.tree;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
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
		AppWindow w = new AppWindow(s);
//		w.open();
		

		Label l = new Label(s, 0);
		l.setText("Hello");
		

		dialog.open();

	}

}
