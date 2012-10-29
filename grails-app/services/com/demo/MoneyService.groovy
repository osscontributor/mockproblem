package com.demo

import grails.plugins.rest.client.RestBuilder

class MoneyService {

    def getSomeData() {
        new RestBuilder().get('some bogus url')
    }
}
