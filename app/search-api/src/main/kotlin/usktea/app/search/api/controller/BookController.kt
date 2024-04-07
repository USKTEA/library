package usktea.app.search.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import usktea.app.search.api.BookRepository
import usktea.app.search.api.entity.Book
import java.util.*

@RestController
@RequestMapping("/books")
class BookController(
    private val bookRepository: BookRepository
) {

    init {
        val book = Book(
            id = UUID.randomUUID().toString(),
            title = "이거슨마치라잌",
            author = "샤오루",
            publisher = "샤오루컴퍼니",
            category = Book.Category(category1 = "샤오루", category2 = "일상"),
            publishedAt = Date(),
            rate = 1.2f,
            createdAt = Date(),
            updatedAt = null,
        )
        bookRepository.save(book)
    }
    @GetMapping
    fun search(): String {
        return "ok"
    }
}
