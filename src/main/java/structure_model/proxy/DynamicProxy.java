package structure_model.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName DynamicProxyDemo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 17:04
 * @Version V1.0
 **/
public class DynamicProxy implements InvocationHandler {



    private  Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        System.out.println("中介看房前");
        Object  result =method.invoke(object,objects);
        System.out.println("中介看房后");
        return result;
    }
}
