package hoa.nguyenminh.it

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class StringUnitTest {
    @Test
    fun simple1() {
        val input = "123 123"
        val result = "123\n123"
        val value = StringUtil.breakString(input)
        assertEquals(result, value)
    }

    @Test
    fun simple2() {
        val input = "123"
        val result = "123"
        val value = StringUtil.breakString(input)
        assertEquals(result, value)
    }

    @Test
    fun simple3() {
        val input = ""
        val result = ""
        val value = StringUtil.breakString(input)
        assertEquals(result, value)
    }

    @Test
    fun simple4() {
        val input = "123 123 12"
        val result = "123\n123 12"
        val value = StringUtil.breakString(input)
        assertEquals(result, value)
    }

    @Test
    fun simple5() {
        val input = " "
        val result = ""
        val value = StringUtil.breakString(input)
        assertEquals(result, value)
    }

    @Test
    fun simple6() {
        val input = " 123 123 12 "
        val result = "123\n123 12"
        val value = StringUtil.breakString(input)
        assertEquals(result, value)
    }

    @Test
    fun case1() {
        val input = "anh chính là thanh xuân của em"
        val result = "anh chính là\nthanh xuân của em"
        val value = StringUtil.breakString(input)
        assertEquals(result, value)
    }

    @Test
    fun case2() {
        val input = "banh trung thu"
        val result = "banh\ntrung thu"
        val value = StringUtil.breakString(input)
        assertEquals(result, value)
    }

    @Test
    fun case3() {
        val input = "banh trung thu kinh do"
        val result = "banh trung\nthu kinh do"
        val value = StringUtil.breakString(input)
        assertEquals(result, value)
    }

    @Test
    fun case4() {
        val input = "xac du phong"
        val result = "xac du\nphong"
        val value = StringUtil.breakString(input)
        assertEquals(result, value)
    }

    @Test
    fun case5() {
        val input = "xac du 123"
        val result = "xa\ndu 123"
        val value = StringUtil.breakString(input)
        assertEquals(result, value)
    }
    @Test
    fun case6() {
        val input = "1234567 12 123"
        val result = "1234567\n12 123"
        val value = StringUtil.breakString(input)
        assertEquals(result, value)
    }
}
