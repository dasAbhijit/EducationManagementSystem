package com.ems.common.converters;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;

import org.mapstruct.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StringToUUIDConverter {

	@Qualifier
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.SOURCE)
	public static @interface StringToUUID {

	}

	@StringToUUID
	public UUID toUUID(String string) {
		return  UUID.fromString(string);
	}
}
