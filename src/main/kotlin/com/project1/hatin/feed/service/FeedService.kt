package com.project1.hatin.feed.service

import com.project1.hatin.feed.dto.FeedResponseDto
import com.project1.hatin.feed.repository.FeedRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class FeedService(
    @Autowired
    private var feedRepository: FeedRepository
){
    /**
     * 아이디로 조회
     */

}