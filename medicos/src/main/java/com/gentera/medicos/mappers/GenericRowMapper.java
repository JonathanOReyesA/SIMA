package com.gentera.medicos.mappers;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.gentera.medicos.annotations.SourceTableField;

public class GenericRowMapper<T> implements RowMapper<T> {
	private Class<T> type;

	public GenericRowMapper(Class<T> type) {
		super();
		this.type = type;
	}

	@Override
	public T mapRow(ResultSet rs, int rowNum) throws SQLException {
		T item = null;

		try {
			item = type.newInstance();

			for (Field field : item.getClass().getDeclaredFields()) {
				Object value = null;

				String fieldClassName = field.getType().getSimpleName();
				SourceTableField sourceTableField = field.getAnnotation(SourceTableField.class);

				if (sourceTableField != null) {
					String fieldName = sourceTableField.name();

					switch (fieldClassName) {
					case "String":
						value = rs.getString(fieldName);
						break;
					case "Integer":
						value = rs.getInt(fieldName);
						break;
					case "Long":
						value = rs.getLong(fieldName);
						break;
					case "Double":
						value = rs.getDouble(fieldName);
						break;
					case "Date":
						value = rs.getDate(fieldName);
						break;
					default:
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
