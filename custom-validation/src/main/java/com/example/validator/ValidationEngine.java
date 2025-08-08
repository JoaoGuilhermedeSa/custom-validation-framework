package com.example.validator;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class ValidationEngine {

	public Set<String> validate(Object object) throws IllegalAccessException {
		Set<String> errors = new HashSet<>();
		Field[] fields = object.getClass().getDeclaredFields();

		for (Field field : fields) {
			field.setAccessible(true);

			if (field.isAnnotationPresent(NotNull.class)) {
				if (field.get(object) == null) {
					errors.add(field.getName() + " - " + field.getAnnotation(NotNull.class).message());
				}
			}

			if (field.isAnnotationPresent(NotBlank.class)) {
				Object value = field.get(object);
				if (value == null || ((String) value).trim().isEmpty()) {
					errors.add(field.getName() + " - " + field.getAnnotation(NotBlank.class).message());
				}
			}
		}

		return errors;
	}
}
