package day230314.Test;
/**
 * @description:    接口的应用：代理模式（Proxy）
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:
 * @time:    2023/3/14 21:44
 */

public class NetWorkTest {
    public static void main(String[] args) {
       Server server=new Server();
        ProxyServer proxyServer=new ProxyServer(server);  //多态：NetWork work=new Server（）

        proxyServer.browse();
    }
}

interface NetWork{      //使用interface定义接口

    public void browse();   //抽象方法，省略了public abstract
}

//被代理类
class Server implements NetWork{
    @Override
    public void browse() {
        System.out.println("真实服务器访问网络");
    }
}

//代理类
class ProxyServer implements NetWork{

    private NetWork work;

    public ProxyServer(NetWork work){
        this.work=work;
    }

    public void check(){
        System.out.println("联网之前的检查工作");
    }
    @Override
    public void browse() {
        check();
        work.browse();
    }
}


