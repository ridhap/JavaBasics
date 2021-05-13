/**
 * @(#)test.java
 *
 *
 * @author 
 * @version 1.00 2014/3/27
 */

import javax.swing.JFrame;
import javax.swing.JLabel;

public final class test extends JFrame {
private test() {
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
getContentPane().add(new JLabel("Hello, World!"));
pack();
setLocationRelativeTo(null);
}

public static void main(String[] args) {
new test().setVisible(true);
}
}