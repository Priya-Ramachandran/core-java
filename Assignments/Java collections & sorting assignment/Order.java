package Class;

import java.time.LocalDate;
import java.util.List;

public class Order {
	private Long orderId;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private long custId;
	
	public Order() {
		
	}

	public Order(Long orderId, LocalDate orderDate, LocalDate deliveryDate, String status,long custId) {
		super();
		this.orderId = orderId;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.custId = custId;
		
	}
	

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	
	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", status=" + status + ", orderDate=" + orderDate + ", deliveryDate="
				+ deliveryDate + ",custId=" +custId+"]";
	}


}
