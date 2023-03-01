package day230221.p2.service;

import day230221.p2.bean.Customer;

/**
 * 
 *  @Description	CustomerList为Customer对象的管理模块，内部用数组管理
 *  一组Customer对象，并提供相应的添加，修改，删除和遍历方法，供CustomerView调用
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2023年2月21日下午7:20:34
 *
 */
public class CustomerList {
	private Customer[] customers;//用来保存客户对象的数组
	private int total=0;	//记录已保存客户的数量
	
	/**
	 * 用来初始化customers数组的构造器
	 * @param totalCustomers	指定数字的长度
	 */
	public CustomerList(int  totalCustomers) {
		customers=new Customer[totalCustomers];
	}
	/**
	 * 
	 * @Description	将指定的客户添加的数组中
	 * @author greypigeon
	 * @date 2023年2月21日下午7:54:47
	 * @param customer
	 * @return	true：添加成功，false：添加失败
	 */
	public boolean addCustomer(Customer customer) {
		if(total>=customers.length) {
			return false;
		}
		customers[total++]=customer;
		return true;
	}
	/**
	 * 
	 * @Description	修改指定索引位置的客户信息
	 * @author greypigeon
	 * @date 2023年2月21日下午7:58:40
	 * @param index
	 * @param cust
	 * @return	true：修改成功，false：修改失败
	 */
	public boolean replaceCustomer(int index,Customer cust) {
		if(index<0||index>=total) {
			return false;
		}
		customers[index]=cust;
		return true;
	}
	/**
	 * 
	 * @Description	删除指定位置上的客户信息
	 * @author greypigeon
	 * @date 2023年2月21日下午8:04:08
	 * @param index
	 * @return	true：删除成功，false：删除失败
	 */
	public boolean deleteCuatomer(int index) {
		if(index<0||index>=total) {
			return false;
		}
		for(int i=index;i<total-1;i++) {
			customers[i]=customers[i+1];
		}
		
		//最后有数组的元素需要置空
//		customers[total-1]=null;
//		total--;
		customers[--total]=null;
		return true;
	}
	/**
	 * 
	 * @Description	获取所有客户信息
	 * @author greypigeon
	 * @date 2023年2月21日下午8:09:06
	 * @return
	 */
	public Customer[] getAllCustomers() {
		Customer[] custs=new Customer[total];
		for(int i=0;i<total;i++) {
			custs[i]=customers[i];//使数组不含空位置
		}
		return custs;
	}
	/**
	 * 
	 * @Description	获取指定索引位置上的客户
	 * @author greypigeon
	 * @date 2023年2月21日下午8:15:37
	 * @param index
	 * @return	如果找到元素，则返回；如果没找到，则返回null
	 */
	public Customer getCustomer(int index) {
		if(index<0||index>=total) {
			return null;
		}
		return customers[index];
	}
	/**
	 * 
	 * @Description	获取存储客户的数量
	 * @author greypigeon
	 * @date 2023年2月21日下午8:17:36
	 * @return
	 */
	public int getTotal() {
		return total;
		
	}
}



















