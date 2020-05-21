class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def deleteNode(self, node):
        """
        :type node: ListNode
        :rtype: void Do not return anything, modify node in-place instead.
        """
        node.val = node.next.val
        node.next = node.next.next
    
if __name__ == "__main__":
    s = Solution()
    node1 = ListNode(1, None)
    node2 = ListNode(2, node1)
    node3 = ListNode(3, node2)
    node4 = ListNode(4, node3)
    node5 = ListNode(5, node4)
    s.deleteNode(node3)

    n = node5
    while n is not None:
        print (n.val)
        n = n.next