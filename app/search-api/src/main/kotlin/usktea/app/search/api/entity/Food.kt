package usktea.app.search.api.entity

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.*
import java.util.*

@Mapping(mappingPath = "elastic/food-mapping.json")
@Setting(settingPath = "elastic/food-setting.json")
@Document(indexName = "foods")
class Food(
    @Id
    val id: String,

    @Field(type = FieldType.Text)
    val name: String,

    @Field(type = FieldType.Date)
    val createdAt: Date,
)
