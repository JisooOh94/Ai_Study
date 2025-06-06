import com.example.controller.HelloController
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.assertTrue

@SpringBootTest
class HelloControllerTest {

    @Autowired
    private lateinit var controller: HelloController

    @Test
    fun `test asyncHello`() = runBlocking {
        val response = controller.asyncHello()
        println("Response from asyncHello: $response")
        assertTrue(response.contains("Hello from HelloService"))
    }

    @Test
    fun `test blockingHello`() {
        val response = controller.blockingHello()
        println("Response from blockingHello: $response")
        assertTrue(response.contains("Hello from HelloService"))
    }
}