package parsers

// grails test-app me dice que no encuentra la lib...
//import com.thoughtworks.xstream.XStream
import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(JsonService)
@Mock([JsonService])
class JsonServiceTests { //  extends GroovyTestCase
   
   static String PS = System.getProperty("file.separator")
   
   void testVersion()
   {
      //def file = new File("test"+ PS +"resources"+ PS +"pruebaXmlToJson.xml")
      // def xml = file.getText()
      String xml = new File("test"+ PS +"resources"+ PS +"pruebaXmlToJson.xml").getText('UTF-8')
      def json=service.xmlToJson(xml)  
      assert json != null
   }
}
