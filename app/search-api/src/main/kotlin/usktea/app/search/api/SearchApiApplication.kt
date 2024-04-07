package usktea.app.search.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan
@SpringBootApplication(
    scanBasePackageClasses = [
        SearchApiApplication::class,
    ]
)
class SearchApiApplication

fun main(args: Array<String>) {
    runApplication<SearchApiApplication>(*args)
}
