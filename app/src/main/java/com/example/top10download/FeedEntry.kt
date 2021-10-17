package com.example.top10download

class FeedEntry {
    var name: String = ""


    override fun toString(): String {
        return """
            name = $name
           """.trimIndent()
    }
}
