package com.project1.hatin.feed.repository

import com.project1.hatin.feed.entity.Feed
import org.springframework.data.repository.CrudRepository

interface FeedRepository : CrudRepository<Feed, Long>