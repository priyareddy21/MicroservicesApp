package com.example.orderservice.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
@Table(name="orders")
public class Order {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	  	private Long oid;
	    private Date orderDate;
	    private BigDecimal totalPrice;
	    private Long userId; // Foreign key- UserID from users table
		
	    public Order() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Order(Date orderDate, BigDecimal totalPrice, Long userId) {
			super();
			this.orderDate = orderDate;
			this.totalPrice = totalPrice;
			this.userId = userId;
		}
		

		public Long getOid() {
			return oid;
		}

		public void setOid(Long oid) {
			this.oid = oid;
		}

		public Date getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}

		public BigDecimal getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(BigDecimal totalPrice) {
			this.totalPrice = totalPrice;
		}

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		@Override
		public String toString() {
			return "Order [id=" + oid + ", orderDate=" + orderDate + ", totalPrice=" + totalPrice + ", userId=" + userId
					+ "]";
		}
	    

}
