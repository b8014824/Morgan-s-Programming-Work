package enrolsystem

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class ClassControllerSpec extends Specification implements ControllerUnitTest<ClassController> {

	static scaffold = Course

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
