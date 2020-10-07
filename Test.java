public class Test {
    public static void main(String[] args) {
        ShowMessage sh=new ShowMessage();//空构函数构造sh
        sh.setSupportMessage(new SupportMessageC());//使用setSupportMessage()注入
        sh.show();
        ShowMessage sh1=new ShowMessage(new SupportMessageE());//使用带参构造函数构造sh1
        sh1.show();
    }
}
