package mx.com.gentera.seguros.sima.web.mappers;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import mx.com.gentera.seguros.sima.web.annotations.SourceTableField;
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
			byte b;
			int i;
			Field[] arrayOfField;
			for (i = (arrayOfField = item.getClass().getDeclaredFields()).length, b = 0; b < i;) {
				Field field = arrayOfField[b];
				Object value = null;
				String fieldClassName = field.getType().getSimpleName();
				SourceTableField sourceTableField = field.<SourceTableField>getAnnotation(SourceTableField.class);
				if (sourceTableField != null) {
					String fieldName = sourceTableField.name();
					String str1;
					switch ((str1 = fieldClassName).hashCode()) {
					case -1808118735:
						if (!str1.equals("String"))
							break;
						value = rs.getString(fieldName);
						break;
					case -672261858:
						if (!str1.equals("Integer"))
							break;
						value = Integer.valueOf(rs.getInt(fieldName));
						break;
					case 2122702:
						if (!str1.equals("Date"))
							break;
						value = rs.getDate(fieldName);
						break;
					case 2374300:
						if (!str1.equals("Long"))
							break;
						value = Long.valueOf(rs.getLong(fieldName));
						break;
					case 2052876273:
						if (!str1.equals("Double"))
							break;
						value = Double.valueOf(rs.getDouble(fieldName));
						break;
					}
					field.setAccessible(true);
					field.set(item, value);
				}
				b++;
			}
		} catch (InstantiationException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return item;
	}
}
