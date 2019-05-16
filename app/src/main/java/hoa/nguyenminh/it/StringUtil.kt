package hoa.nguyenminh.it

/**
 * Created by Hoa Nguyen on May 16 2019.
 */

object StringUtil {

    @JvmStatic
    fun breakString(string: String?): String {
        if (string == null || string.trim().isEmpty()) return ""

        var result = string.trim()

        val length = result.length
        var posBreak = -1
        var jump = 0
        var left: Int
        var right: Int


        val mid = length / 2

        if (result[mid] == ' ') {
            posBreak = mid
        } else {
            left = mid - jump
            right = mid + jump

            while (left > 0 && right < length && result[left] != ' ' && result[right] != ' ') {
                jump++
                left = mid - jump
                right = mid + jump
            }

            if (jump > 0) {
                if (left > 0 && result[left] == ' ') {
                    posBreak = left
                } else if (right < length && result[right] == ' ') {
                    posBreak = right
                }
            }
        }

        if (posBreak > -1) {
            result = result.substring(0, posBreak) + "\n" + result.substring(posBreak + 1)
        }

        return result
    }
}