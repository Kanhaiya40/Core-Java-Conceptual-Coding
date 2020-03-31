import javax.swing.*;
import java.awt.*;


public class AWTAndSwings extends JFrame{

    JFrame obj;
    JPanel p1;
    JMenuBar m1;
    JMenu file,edit,view,navigate;
    JMenuItem   Open,New,Close ,Setting,Exit,Cut ,Copy,Paste,Delete,Tool ,Appriances,Compare,Class,File,Symbol;
    JTextField t1;


    public AWTAndSwings()
    {

        obj=new JFrame("Calculator");
        obj.setVisible(true);
        obj.setSize(900,900);
        obj.setLayout(new BorderLayout());
        p1=new JPanel();
        obj.add(p1,BorderLayout.WEST);
        m1=new JMenuBar();
        m1.setVisible(true);
        m1.setSize(900,900);
        p1.add(m1,BorderLayout.BEFORE_LINE_BEGINS);
        file=new JMenu("File");
        edit=new JMenu("Edit");
        view=new JMenu("view");
        navigate=new JMenu("Navigate");
        m1.add(file);
        m1.add(edit);
        m1.add(view);
        m1.add(navigate);
        Open=new JMenuItem("Open");
        New=new JMenuItem("New");
        Close=new JMenuItem("Close");
        Setting=new JMenuItem("Setting");
        Exit=new JMenuItem("Exit");
        Cut=new JMenuItem("Cut");
        Copy=new JMenuItem("Copy");
        Paste=new JMenuItem("Paste");
        Delete=new JMenuItem("Delete");
        Tool=new JMenuItem("Tool");
        Appriances=new JMenuItem("Appriances");
        Compare=new JMenuItem("Compare");
        Class=new JMenuItem("Class");
        File=new JMenuItem("File");
        Symbol=new JMenuItem("Symbol");
        file.add(Open);
        file.add(New);
        file.add(Close);
        file.add(Setting);
        file.add(Exit);
        edit.add(Cut);
        edit.add(Copy);
        edit.add(Paste);
        edit.add(Delete);
        view.add(Tool);
        view.add(Compare);
        view.add(Appriances);
        navigate.add(Class);
        navigate.add(File);
        navigate.add(Symbol);
        t1=new JTextField("Enter Your Input");
        t1.setSize(100,100);
        t1.setVisible(true);
        p1.add(t1);







    }



    public static void main(String[] args) {

        AWTAndSwings af=new AWTAndSwings();
    }

}
