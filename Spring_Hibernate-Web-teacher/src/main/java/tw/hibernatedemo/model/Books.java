package tw.hibernatedemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "booktitle")
	private String booktitle;

	@Column(name = "publicYear")
	private String publicYear;
	
	// 外來鍵的屬性可省略 mapping
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="fk_user_id")
	private BooksUsers bookUsers;

	public Books() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public String getPublicYear() {
		return publicYear;
	}

	public void setPublicYear(String publicYear) {
		this.publicYear = publicYear;
	}

	public BooksUsers getBookUsers() {
		return bookUsers;
	}

	public void setBookUsers(BooksUsers bookUsers) {
		this.bookUsers = bookUsers;
	}
	
	

}
