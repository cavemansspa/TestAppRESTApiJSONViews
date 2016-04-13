package com.testappreatapijsonviews

class Many {

    String name

    static belongsTo = [ one: One ]
    static constraints = {
    }
}
