package priv.zhong.leetcode.easy

/**
 * @author 钟未鸣
 * @date 2017/12/31
 */
fun main(args: Array<String>) {
}

fun findComplement(num: Int): Int {
    return num.inv().let { Integer.toBinaryString(it) }.substring(32 - Integer.toBinaryString
    (num).length).let { Integer.parseInt(it, 2) }
}