package br.edson.desafio.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@PrimaryKeyJoinColumn(name = "id_bebida")
@Table(name="cachaca")
public class Cachaca extends Bebida implements Serializable{

	private static final long serialVersionUID = 1L;
	private Date dataBarril;

	public Cachaca() {
		super();
	}
	
	public Cachaca(Date dataBarril) {
		super();
		this.dataBarril = dataBarril;
	}
	@Temporal(TemporalType.DATE)
	@Column (name = "data_barril")
	public Date getDataBarril() {
		return dataBarril;
	}

	public void setDataBarril(Date dataBarril) {
		this.dataBarril = dataBarril;
	}
	
	

	
	
}
