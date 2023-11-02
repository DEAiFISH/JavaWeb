package listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2023/10/31 08:54
 */
@WebListener
public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {
    /**
     * @description 创建对象
     *
     * @author DEAiFISH
     * @date 2023/10/31 08:55
     * @param sre
     * @return void
     */
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

    }

    /**
     * @description 销毁对象
     *
     * @author DEAiFISH
     * @date 2023/10/31 08:55
     * @param sre
     * @return void
     */
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {

    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
    }
}
