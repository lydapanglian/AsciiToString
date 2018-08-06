
import com.ui.IndexPage;

import javax.swing.*;

/**
 * Created by ly_dapanglian on 2018/8/6.
 */
public class Main {


    public static void main(String[] args){
        JFrame frame = new JFrame("ASCIIToString");
        frame.setSize(350,400);
        JPanel rootPanel = new IndexPage().mainPanel;
        frame.setContentPane(rootPanel);
        frame.setVisible(true);

    }
}
