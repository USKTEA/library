package usktea.app.search.api.entity

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.*
import java.util.*

@Mapping(mappingPath = "elastic/book-mapping.json")
@Setting(settingPath = "elastic/book-setting.json")
@Document(indexName = "books")
class Book(
    @Id
    val id: String,

    @Field(type = FieldType.Text)
    val title: String,

    @Field(type = FieldType.Text)
    val author: String,

    @Field(type = FieldType.Text)
    val publisher: String,

    @Field(type = FieldType.Object)
    val category: Category,

    @Field(type = FieldType.Date)
    val publishedAt: Date,

    @Field(type = FieldType.Float)
    val rate: Float,

    @Field(type = FieldType.Date)
    val createdAt: Date,

    @Field(type = FieldType.Date)
    val updatedAt: Date?,
) {

    data class Category(
        val category1: String,
        val category2: String,
    )
}
