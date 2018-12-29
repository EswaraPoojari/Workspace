package com.practice.springbootstarter.converters;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
// this class is used to convert to custom date format
// here we implemented Converter for conversion, we can use other options also such as ConversionService, custom property Editors also.
//Custom converter should be register as bean
@Component 
// ConfigurationPropertiesBindingPostProcessor, detects the custom converters annotated with @ConfigurationPropertiesBinding for type conversion
@ConfigurationPropertiesBinding 
public class LocalDateConverter implements Converter<String, LocalDate> {

	@Override
	public LocalDate convert(String source) {
		if(null == source){
		return null;
		}
		return LocalDate.parse(source, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
	}

}
