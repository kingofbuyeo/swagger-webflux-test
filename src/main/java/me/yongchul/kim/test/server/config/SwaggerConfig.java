package me.yongchul.kim.test.server.config;

import java.util.Optional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;


@Configuration
@EnableSwagger2WebFlux
public class SwaggerConfig {

  @Bean
  @Profile("!prod")
  public Docket publicApi() {
    return docket("public", "me.yongchul.kim.test.server.port.adapter.inbound.rest.external");
  }

  @Bean
  @Profile("!prod")
  public Docket privateApi() {
    return docket("private", "me.yongchul.kim.test.server.port.adapter.inbound.rest.internal");
  }


  public Docket docket(String groupName, String basePackage) {
    Docket docket = new Docket(DocumentationType.SWAGGER_2)
        .groupName(groupName)
        .apiInfo(new ApiInfoBuilder()
            .description("스웨거 도큐먼트 구문 테스트")
            .title("스웨거 테스트")
            .build())
        .select()
        .apis(RequestHandlerSelectors.basePackage(basePackage))
        .paths(PathSelectors.any())
        .build()
        .genericModelSubstitutes(Optional.class, Mono.class, Flux.class);
    return docket;

  }

}
