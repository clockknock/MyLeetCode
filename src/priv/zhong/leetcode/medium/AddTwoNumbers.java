package priv.zhong.leetcode.medium;

import priv.zhong.leetcode.bean.ListNode;

/**
 * @author 钟未鸣
 * @date 2018/1/9
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        //9 9
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        //9
        ListNode l2 = new ListNode(9);
        ListNode listNode = addTwoNumbers02(l1, l2);
        System.out.println(listNode);
    }

    private static ListNode addTwoNumbers02(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null ) {
            return l1;
        }

        //计算当前位,并判断是否需要进位



        return l1;
    }

   /* private static ListNode addTwoNumbers01(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null ) {
            return l1;
        }
        int limit = 10;

        //计算当前位,并判断是否需要进位
        l1.val += l2.val;
         handleCarry(l1, limit);
        l1.next = addTwoNumbers(l1.next, l2.next);

        return l1;
    }

    private static void handleCarry(ListNode l1, int limit) {
        if (l1.val >= limit) {
            l1.val = l1.val - 10;
            if (l1.next != null) {
                l1.next.val += 1;
                handleCarry(l1.next, limit);
            } else {
                l1.next = new ListNode(1);
            }
        }
    }*/
}
