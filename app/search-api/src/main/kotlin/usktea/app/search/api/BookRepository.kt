package usktea.app.search.api

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository
import usktea.app.search.api.entity.Food

interface BookRepository : ElasticsearchRepository<Food, String>
