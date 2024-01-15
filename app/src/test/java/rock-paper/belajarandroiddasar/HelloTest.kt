package rock-paper

import org.junit.Assert
import org.junit.Test

class HelloTest {

    @Test
    fun testSayHello() {
        val result = Hello.sayHello("alek")

        Assert.assertEquals("Hello alek", result)
    }
}