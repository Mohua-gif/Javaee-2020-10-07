/**
 *
 */
public class ShowMessage {
    SupportMessage supportMessage;//接口定义变量 降低耦合性 面向接口原则
    /**
     * @description: 构造（空）方法
     */
    public ShowMessage(){

    }
    public ShowMessage(SupportMessage supportMessage){
        this.supportMessage=supportMessage;
    }
    public void setSupportMessage(SupportMessage supportMessage){
        this.supportMessage=supportMessage;
    }//属性的注入函数——依赖注入
    public void show(){
        System.out.println(supportMessage.getMessage());
    }

}
