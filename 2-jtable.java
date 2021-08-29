import javax.swing.*;    
class abc extends JFrame{    
    JFrame f;    
    abc(){    
    f=new JFrame();    
    String data[][]={ {"101","Mahesh","9515479704"},    
                          {"102","Akshay","8978937353"},    
                          {"103","Suchi","9573299464"},
                        {"104","Jagruth","9010345678"}};    
    String column[]={"ID","NAME","MOBILE NUMBER"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    add(sp);          
    setSize(300,400);    
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new abc();
    }
}
