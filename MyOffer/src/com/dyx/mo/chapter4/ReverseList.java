/**
 * 
 */
package com.dyx.mo.chapter4;

import java.util.Stack;

/**
 * Author    : Yongxinda(yongxinda89@gmail.com)
 * Version   : 1.0
 * Date      : 2016年7月11日
 * Time      : 下午10:34:15
 * Summary   : 从尾到头打印链表   题目：输入个链表的头结点，从尾到头反过来打印出每个结点的值。
 * Copyright : Copyright (c) 2016
 */
public class ReverseList {
	/**
	 * 
	 * Author    : Yongxinda(yongxinda89@gmail.com)
	 * Version   : 1.0
	 * Date      : 2016年7月11日
	 * Time      : 下午10:38:15
	 * Summary   : 节点
	 * Copyright : Copyright (c) 2016
	 */
	public static class ListNode{
		int value;
		ListNode nextNode;
	}
	
	/**
	 * 输入个链表的头结点，从尾到头反过来打印出每个结点的值
	 * @param rootNode
	 */
	public static void printListNode(ListNode rootNode){
		Stack<ListNode> stack=new Stack<>();
		while(rootNode!=null){
			stack.push(rootNode);
			rootNode=rootNode.nextNode;
		}
		
		ListNode temp;
		
		while(!stack.isEmpty()){
			temp=stack.pop();
			System.out.println(temp.value+"");
		}
	}
	
	
	public static void unPrintListNode(ListNode rootNode){
		if(rootNode!=null){
			printListNode(rootNode);
			System.out.println(rootNode.value+"");
		}
	}
	
	
	public static void main(String[] args) {
		ListNode node=new ListNode();
		
		node.value=1;
		node.nextNode=new ListNode();
		
		node.nextNode.value=2;
		node.nextNode.nextNode=new ListNode();
		
		node.nextNode.nextNode.value=3;
		node.nextNode.nextNode.nextNode=new ListNode();
		
		node.nextNode.nextNode.nextNode.value=4;
		node.nextNode.nextNode.nextNode.nextNode=new ListNode();
		
		printListNode(node);
		System.out.println("**************");
		unPrintListNode(node);
		
	}
	
}
