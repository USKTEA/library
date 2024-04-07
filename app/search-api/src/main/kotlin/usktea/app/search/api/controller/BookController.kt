package usktea.app.search.api.controller

import org.springframework.data.elasticsearch.client.elc.NativeQuery
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import usktea.app.search.api.entity.Food

@RestController
@RequestMapping("/books")
class BookController(
) {

    @GetMapping
    fun search(): String {
        return "ok"
    }
}
