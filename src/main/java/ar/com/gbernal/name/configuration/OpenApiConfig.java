package ar.com.gbernal.name.configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

@Configuration
public class OpenApiConfig {

    private final String moduleName;
    private final String apiVersion;

    public OpenApiConfig(@Value("${openapi-modulename}") String moduleName, @Value("${openapi-apiversion}") String apiVersion){
        this.moduleName = moduleName;
        this.apiVersion = apiVersion;
    }

    @Bean
    public OpenAPI customOpenAPI() {
        final String apiTitle = String.format("%s API", StringUtils.capitalize(moduleName));
        return new OpenAPI()
                .info(new Info().title(apiTitle).version(apiVersion));
    }
}
