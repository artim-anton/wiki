package com.artimanton.wiki.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Character {
    @PrimaryKey
    var id: String? = null
    var name: String? = null
    var status: String? = null
    var species: String? = null
    var type: String? = null
    var gender: String? = null
    var origin: List<NameUrl>? = null
    var location: List<NameUrl>? = null
    var image: String? = null
    //var episode: List<>? = null
    var url: String? = null
    var created: String? = null

}