package sample.db.pojos;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Report implements Serializable {

	private static final long serialVersionUID = -8870087833694435721L;
	
	private Integer id;
	private String name;
	private String content;
	private Date date;
	private List<Employee> authors;

	// This constructor is mandatory
	public Report() {
		super();
		this.authors = new ArrayList<Employee>();
	}

	// You can create as many extra constructors as you wish
	public Report(String name, String content, LocalDate ldate) {
		super();
		this.name = name;
		this.content = content;
		this.setLocalDate(ldate);
		this.authors = new ArrayList<Employee>();
	}

	public Report(Integer id, String name, String content, LocalDate localDate, List<Employee> authors) {
		super();
		this.name = name;
		this.content = content;
		this.setLocalDate(localDate);
		this.authors = authors;
	}

	// Hashcode uses primary keys, since they are unique
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	// Equals uses primary keys, since they are unique
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Report other = (Report) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", name=" + name + ", content=" + content +
				", date=" + date + ", authors=" + authors + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getDate(Date date) {
		return this.date;
	}
	
	// Additional method to use LocalDate objects
	public void setLocalDate(LocalDate ldate) {
		this.date = Date.valueOf(ldate);
	}
	
	// Additional method to use LocalDate objects
	public LocalDate getLocalDate() {
		return this.date.toLocalDate();
	}
	
	public List<Employee> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Employee> authors) {
		this.authors = authors;
	}
	
	// Additional method to add to a list
	public void addAuthor(Employee employee) {
		if (!authors.contains(employee)) {
			this.authors.add(employee);
		}
	}
	
	// Additional method to remove from a list
	public void removeAuthor(Employee employee) {
		if (authors.contains(employee)) {
			this.authors.remove(employee);
		}
	}
}
