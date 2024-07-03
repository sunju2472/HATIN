package com.project1.hatin.feed.controller

import com.project1.hatin.feed.service.FeedService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/feed")
class FeedController (
    @Autowired
    private val feedService: FeedService
){
    /**
     * 게시글 조회 api
     */

}