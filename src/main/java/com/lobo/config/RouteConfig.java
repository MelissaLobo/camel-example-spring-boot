package com.lobo.config;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author Melissa Lobo
 * 
 * Class responsible for application configuration
 *
 */
@Component
public class RouteConfig extends RouteBuilder {

	@Bean
	public ServletRegistrationBean camelServletRegistrationBean() {
		ServletRegistrationBean registration = new ServletRegistrationBean(new CamelHttpTransportServlet(),
				"/r/api/v1/*");
		registration.setName("CamelServlet");
		return registration;
	}

	@Override
	public void configure() throws Exception {
		restConfiguration()
			.dataFormatProperty("prettyPrint", "true")
			.component("servlet")
			.bindingMode(RestBindingMode.json)
			.apiContextPath("/api-doc")
				.apiProperty("api.title", "API-Main-App")
				.apiProperty("api.version", "1.0.0")
				.apiProperty("cors", "true");
	}

}
