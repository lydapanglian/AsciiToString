package com.ui;

import javax.swing.*;
import com.Business;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 * Created by ly_dapanglian on 2018/8/6.
 */
public class IndexPage {


    public JPanel mainPanel;
    private JTextField textField1;
    private JButton button1;
    private JTextPane textPane1;

    public IndexPage(){
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String str = textField1.getText();
                Business bus = new Business();
                String res = bus.asciiToString(str);
                textPane1.setText(res);
            }
        });
    }


}
