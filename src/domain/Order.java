package domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/*
 * �����ݿ������Ӷ���ʱ(dao.impl.OrderDao#add(domain.Order)) ���ӵ������� id,ordertime,price,state,user_id  ���һ�������ݿ��ֶ�  
 * user��orderitems ��������dao.impl.OrderDao#find(java.lang.String)������ʵ�ֵ�
 * 
 */
public class Order {
	
	private String id;
	private Date ordertime;
	private double price;
	private boolean state;//״̬
	private User user;//��ס���������ĸ��û�   user_id
	private Set<OrderItem> orderitems =new HashSet<OrderItem>();//�������涩����ļ���
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<OrderItem> getOrderitems() {
		return orderitems;
	}
	public void setOrderitems(Set<OrderItem> orderitems) {
		this.orderitems = orderitems;
	}
	
	
}