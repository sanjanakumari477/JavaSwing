import java.awt.*;
public class OpenDialog {
    public static void main(String[] args) {
        MyFrame f = new MyFrame("Open Box");
        f.setVisible(true);
        f.setSize(400, 400);

        FileDialog fd = new FileDialog(f, "FileDialog Load", FileDialog.LOAD);
        fd.setVisible(true);
    }
}

class MyFrame extends Frame {
    MyFrame(String s) {
        super(s);
    }
}
