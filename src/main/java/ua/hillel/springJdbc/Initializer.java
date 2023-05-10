package ua.hillel.springJdbc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import ua.hillel.springJdbc.config.DaoConfig;
import ua.hillel.springJdbc.config.ServletConfig;
import ua.hillel.springJdbc.config.SpringJdbcConfig;
import ua.hillel.springJdbc.config.WebMvcConfig;

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
