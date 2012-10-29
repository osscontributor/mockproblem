package com.demo

import grails.plugins.rest.client.RestBuilder

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(MoneyService)
class MoneyServiceTests {

    void testMoney() {
        def mockRestBuilder = mockFor(RestBuilder)
        mockRestBuilder.demand.get {String url ->
            'some data'
        }
        // I think this mock behaves the way I want, but the
        // RestBuilder created in the MoneyService does not...
        def mock = mockRestBuilder.createMock()

        def results = service.getSomeData()
        assert 'some data' == results
    }
}
