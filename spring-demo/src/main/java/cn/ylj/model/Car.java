package cn.ylj.model;

/**
 * @author : ylj
 * create at:  2022/11/6
 */
public class Car {

	private   int maxSpeed ;
	private  String brand ;
	private   double price ;

	private static int prodNum = 0;


	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car{" +
				"maxSpeed=" + maxSpeed +
				", brand='" + brand + '\'' +
				", price=" + price +
				", 生产数量='" + prodNum++ + '\'' +
				'}';
	}
}