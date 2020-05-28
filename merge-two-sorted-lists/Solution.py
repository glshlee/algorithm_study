class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        tempHead = ListNode(0, None)
        tempNode = tempHead
        while l1 is not None and l2 is not None:
            if l1.val < l2.val:
                tempNode.next = l1
                tempNode = l1
                l1 = l1.next
            else:
                tempNode.next = l2
                tempNode = l2
                l2 = l2.next

        temp = l2 if l1 is None else l1
        while temp is not None:
            tempNode.next = temp
            tempNode = temp 
            temp = temp.next

        return tempHead.next

if __name__ == "__main__":
    l1 = ListNode(1, ListNode(2, ListNode(3, None)))
    l2 = ListNode(1, ListNode(3, ListNode(4, None)))
    s = Solution()

    node = s.mergeTwoLists(l2, l1)
    while node is not None:
        print (node.val)
        node = node.next
    # print(s.isValid("()){}"))
    # print(s.isValid(""))
    # print(s.isValid("(){}[{}]"))