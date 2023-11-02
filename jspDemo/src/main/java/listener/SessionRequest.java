package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2023/10/31 08:55
 */
@WebListener
public class SessionRequest implements HttpSessionListener, HttpSessionAttributeListener, HttpSessionBindingListener {
    /**
     * @description session创建
     *
     * @author DEAiFISH
     * @date 2023/10/31 08:57
     * @param se
     * @return void
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {

    }

    /**
     * @description session销毁
     *
     * @author DEAiFISH
     * @date 2023/10/31 08:57
     * @param se
     * @return void
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }

    /**
     * @description 添加属性
     *
     * @author DEAiFISH
     * @date 2023/10/31 08:58
     * @param event
     * @return void
     */
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("=====attributeAdded=====");
        System.out.println("name:" + event.getName() + "==>value:" + event.getValue());
    }

    /**
     * @description 删除属性
     *
     * @author DEAiFISH
     * @date 2023/10/31 08:59
     * @param event
     * @return void
     */
    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
    }

    /**
     * @description 销毁属性
     *
     * @author DEAiFISH
     * @date 2023/10/31 08:59
     * @param event
     * @return void
     */
    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
    }

    /**
     * @description 属性绑定
     *
     * @author DEAiFISH
     * @date 2023/10/31 10:00
     * @param event
     * @return void
     */
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        HttpSession session = event.getSession();
        String name = event.getName();
        System.out.println(this + "被绑定到session\"" + session.getId() + "\"的" + name + "属性上");
    }

    /**
     * @description 取消绑定
     *
     * @author DEAiFISH
     * @date 2023/10/31 10:00
     * @param event
     * @return void
     */
    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        HttpSession session = event.getSession();
        String name = event.getName();
        System.out.println(this + "被从session\"" + session.getId() + "\"的" + name + "属性上移除");
    }
}
