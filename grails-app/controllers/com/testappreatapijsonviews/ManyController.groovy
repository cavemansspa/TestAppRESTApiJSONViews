package com.testappreatapijsonviews


import grails.rest.*
import grails.converters.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ManyController extends RestfulController {
    static responseFormats = ['json', 'xml']

    ManyController() {
        super(Many)
    }
}
