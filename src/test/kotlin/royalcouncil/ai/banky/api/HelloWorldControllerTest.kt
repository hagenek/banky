import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.http.HttpStatus
import org.junit.jupiter.api.Assertions.assertEquals

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloWorldControllerTest {

    @Autowired
    private lateinit var testRestTemplate: TestRestTemplate

    @LocalServerPort
    private var port: Int = 0

    @Test
    fun `test hello world endpoint returns correct message`() {
        val response = testRestTemplate.getForEntity("http://localhost:$port/hello", String::class.java)
        assertEquals(HttpStatus.OK, response.statusCode)
        assertEquals("""{"message":"Hello World"}""", response.body)
    }
}
