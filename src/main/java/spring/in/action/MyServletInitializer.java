package spring.in.action;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;

/**
 * Created by shliangyan on 2017/9/19.
 */
public class MyServletInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
//        ServletRegistration.Dynamic dynamic = servletContext.addServlet("myServlet")
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        ServletRegistration.Dynamic registration = servletContext.addServlet("appServlet", dispatcherServlet);
        registration.addMapping("/");
        registration.setMultipartConfig(new MultipartConfigElement("/tmp/spittr/uploads"));
    }
}
