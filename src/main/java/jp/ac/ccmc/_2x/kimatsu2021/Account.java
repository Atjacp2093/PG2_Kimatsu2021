package jp.ac.ccmc._2x.kimatsu2021;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Account {
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "className", nullable = false)
	private String className;
	@Column(name = "tel", nullable = false)
	private String tel;
	@Column(name = "address", nullable = false)
	private String address;

	public Account() {
		super();
	}

	public Account(String name, String className, String tel, String address) {
		super();
		this.name = name;
        this.className = className;
		this.tel = tel;
		this.address = address;
	}
}