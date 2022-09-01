package be.bxl.icc.reservation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="prices")
public class Price {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "This field must not be empty.")
	@Size(min=2, max=30, message = "This field must be between 2 and 60 characters long.")
	private String type;
	
	@NotEmpty(message = "The price must not be empty.")
	private Double price;
	
	@ManyToOne
	@JoinColumn(name="show_id", nullable=false)
	private Show show_id;

	protected Price() {}

	public Price(Long id, String type, Double price, Show show_id) {
		this.id = id;
		this.type = type;
		this.price = price;
		this.show_id = show_id;
	}
	
	public String toString() {
		return type + ": " + price;
	}
		
}
