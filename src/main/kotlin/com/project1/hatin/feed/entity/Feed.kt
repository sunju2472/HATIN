package com.project1.hatin.feed.entity

import com.project1.hatin.feed.dto.FeedResponseDto
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Feed (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id :Long?,

    @Column(nullable = false, length = 255)
    var title : String,

    @Column(nullable = false, length = 1000)
    var content : String,

    @Column(name = "created_at", nullable = false)
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(nullable = false)
    var likes: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = ForeignKey(name="fk_feed_user_id"))
    val user_id :String,

    @Column(nullable = false, length = 50)
    var type : String
) {
    fun toResponse() : FeedResponseDto = FeedResponseDto(
        id = id,
        title = title,
        content = content,
        createdAt = createdAt,
        likes = likes,
        user_id = user_id,
        type = type

    )
}
