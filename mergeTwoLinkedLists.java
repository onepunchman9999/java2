public void merge(List list1, List list2) {
	if (list1 == null) {
		return list2;
	} else if (list2 == null) {
		return list1;
	}
	
	List mergedHead;
	
	if(list1.value < list2.value) {
		mergedHead = list1;
		//set list1 with mergedHead and connect and recurse with list1.next
		mergedHead.next = merge(list1.next, list2);
	} else {
		mergedHead = list2;
		mergedHead.next = merge(list1, list2.next);
	}
	
	return mergedHead;
	
}