package listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2023/10/31 08:55
 */
public class SessionRequest implements HttpSessionListener, HttpSessionAttributeListener {
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
}
