package com.sb.bank.rest.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	// "/bank.*" is the url pattern of the root controller 
		// groupName can be anything
		@Bean
		public Docket postApi() {
			return new Docket(DocumentationType.SWAGGER_2).groupName("Bank Master").apiInfo(apiInfo()).select()
					.paths(regex("/bank.*")).build();
		}

		
		//title can be anything
		private ApiInfo apiInfo() {
			return new ApiInfoBuilder().title("Bank App Master")
					.description("Bank Documentation")
					.termsOfServiceUrl("https://www.youtube.com/channel/UCORuRdpN2TQCKnsuEaeK-kQ").license("Java_Knowledge")
					.licenseUrl("https://www.youtube.com/channel/UCORuRdpN2TQCKnsuEaeK-kQ").version("1.0").build();
		}
	
}
