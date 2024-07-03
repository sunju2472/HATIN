package com.project1.hatin.comment.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Comment (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id : Long?,

)