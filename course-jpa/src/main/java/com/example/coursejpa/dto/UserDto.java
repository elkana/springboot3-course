package com.example.coursejpa.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import com.example.coursejpa.model.Office;
import com.example.coursejpa.model.User;

/**
 * User aplikasi monitoring matel Dibedakan dengan table user matel
 */
// @Projection(
// name = "customBook",
// types = { Book.class })
// public interface CustomBook {
// @Value("#{target.id}")
// long getId();

// String getTitle();
// }
@Projection(name = "userDto", types = {User.class})
public interface UserDto {
	@Value("#{target.userId}")
	String getId();

	Office getOffice();
}
