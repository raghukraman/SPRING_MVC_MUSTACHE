package com.raghu.examples.config;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.mustache.MustacheViewResolver;


public class CustomMustacheViewResolver extends MustacheViewResolver {

    @Override
    protected View loadView(String viewName, Locale locale) throws Exception {
        if ("search".equals(viewName)) {
            System.out.println("Mustache view does not exist: {}" + viewName);
            return null;
        }
        return super.loadView(viewName, locale);
    }
    
    
}
