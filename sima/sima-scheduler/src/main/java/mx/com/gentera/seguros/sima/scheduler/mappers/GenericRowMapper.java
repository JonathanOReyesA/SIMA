package mx.com.gentera.seguros.sima.scheduler.mappers;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import mx.com.gentera.seguros.sima.scheduler.annotations.SourceTableField;
import org.springframework.jdbc.core.RowMapper;

public class GenericRowMapper<T> implements RowMapper<T> {
	private Class<T> type;

	public GenericRowMapper(Class<T> type) {
		this.type = type;
	}

	public T mapRow(ResultSet rs, int rowNum) throws SQLException {
		T item = null;
		try {
			item = this.type.newInstance();
			for (Field field : item.getClass().getDeclaredFields()) {
				Object value = null;
				String fieldClassName = field.getType().getSimpleName();
				SourceTableField sourceTableField = field.<SourceTableField>getAnnotation(SourceTableField.class);
				if (sourceTableField != null) {
					String fieldName = sourceTableField.name();
					switch (fieldClassName) {
					case "String":
						value = rs.getString(fieldName);
						break;
					case "Integer":
						value = Integer.valueOf(rs.getInt(fieldName));
						break;
					case "Long":
						value = Long.valueOf(rs.getLong(fieldName));
						break;
					case "Double":
						value = Double.valueOf(rs.getDouble(fieldName));
						break;
					case "Date":
						value = rs.getDate(fieldName);
						break;
					}
					field.setAccessible(true);
					field.set(item, value);
				}
			}
		} catch (InstantiationException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return item;
	}
}
