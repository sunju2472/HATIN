package com.project1.hatin.feed.dto

import com.project1.hatin.feed.entity.Feed
import java.time.LocalDateTime

data class FeedRequestDto(
    var id : Long?,
    var title : String,
    var content : String,
    var createdAt : LocalDateTime,
    var likes : Int,
    var user_id : String,
    var type : String

){
    fun toEntity() : Feed = Feed(
        id = null,
        title = title,
        content = content,
        createdAt = createdAt,
        likes = likes,
        user_id = user_id,
        type = type
    )
}
data class FeedResponseDto(
    var id : Long?,
    var title : String,
    var content : String,
    var createdAt : LocalDateTime,
    var likes : Int,
    var user_id: String,
    var type : String,
)