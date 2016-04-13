package com.testappreatapijsonviews


import grails.rest.*
import grails.converters.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class OneController extends RestfulController {
    static responseFormats = ['json', 'xml']

    OneController() {
        super(One)
    }
}
