package com.kkankkandev.springboot.learnjpaandhibernate.course.jdbc;

import com.kkankkandev.springboot.learnjpaandhibernate.course.jpa.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	private static String INSERT_QUERY =
		"""
      INSERT INTO course (id, name, author) 
      VALUES (?, ?, ?);
		""";

	private static String DELETE_QUERY =
		"""
			DELETE FROM COURSE WHERE id = ?;
		""";

	private static String SELECT_QUERY =
  """
    SELECT * FROM COURSE WHERE id = ?;
	""";

	private static String SELECT_ALL_QUERY =
	"""
    SELECT * FROM COURSE;
	""";

	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY,
			course.getId(), course.getName(), course.getAuthor());
	}

	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}

	public Course findById(long id){
		return springJdbcTemplate.queryForObject(SELECT_QUERY,
			new BeanPropertyRowMapper<>(Course.class), id);
	}

	public List<Course> selectAll(){
		List<Course> query = springJdbcTemplate.query(SELECT_ALL_QUERY,
			new BeanPropertyRowMapper<>(Course.class));

		return query;
	}
}
