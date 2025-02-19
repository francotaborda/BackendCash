package com.backend.swaggerconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfiguration {


		@Bean
		public Docket api() {
			return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.apis(RequestHandlerSelectors.basePackage("com.backend"))
					//.paths(PathSelectors.any())
					.paths(PathSelectors.any())
					.build()
					//.pathMapping("/api")
					//.apiInfo(apiDetails())
					.useDefaultResponseMessages(false);

		}

		public ApiInfo apiDetails() {
			return new ApiInfo(
					"Backend Cash",
					"API",
					"0.0.1",
					"free to use",
					new springfox.documentation.service.Contact("Franco Taborda", "", "francotaborda360@gmail.com"),
					"API", null, null
			);
		}

}
