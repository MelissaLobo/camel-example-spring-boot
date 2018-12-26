package com.lobo.config;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Value;
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
	
	@Value("${server.port}")
    String serverPort;
    
    @Value("${baeldung.api.path}")
    String contextPath;

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
			.contextPath(contextPath) 
		  	.port(serverPort)
			.dataFormatProperty("prettyPrint", "true")
			.apiContextRouteId("doc-api")
			.component("servlet")
			.bindingMode(RestBindingMode.json)
			.apiContextPath("/api-doc")
				.apiProperty("api.title", "API-Main-App")
				.apiProperty("api.version", "1.0.0")
				.apiProperty("cors", "true");
	}

}
