import kotlin.test.Test
import kotlin.test.assertEquals

class MingwFibiTest {
    @Test
    fun thirdValue() {
        assertEquals(23, fibi.take(3).last())
    }
}
