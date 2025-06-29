import java.awt.*;

public class SaveDialog {
    public static void main(String[] args) {
        MyFrame f = new MyFrame("Save Box");
        f.setVisible(true);
        f.setSize(400, 400);

        FileDialog fd = new FileDialog(f, "Save your File", FileDialog.SAVE);
        fd.setVisible(true);
    }
}

class MyFrame extends Frame {
    MyFrame(String s) {
        super(s);
    }
}
