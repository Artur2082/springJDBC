package ua.hillel.springdata;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import ua.hillel.springdata.config.DaoConfig;
import ua.hillel.springdata.config.ServletConfig;
import ua.hillel.springdata.config.SpringJdbcConfig;
import ua.hillel.springdata.config.WebMvcConfig;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{DaoConfig.class, SpringJdbcConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ServletConfig.class, WebMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/*"};
    }
}
